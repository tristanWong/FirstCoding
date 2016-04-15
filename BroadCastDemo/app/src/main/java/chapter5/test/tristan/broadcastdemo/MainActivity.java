package chapter5.test.tristan.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private IntentFilter intentFilter = null;
    private NetworkChangeReciever networkChangeReciever = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        networkChangeReciever = new NetworkChangeReciever();
        registerReceiver(networkChangeReciever,intentFilter);

    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(networkChangeReciever);
        super.onDestroy();
    }

    private class NetworkChangeReciever extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
//            Toast.makeText(context,"Network Changes",Toast.LENGTH_SHORT).show();
            ConnectivityManager connectivityManager =
                    (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo  = connectivityManager.getActiveNetworkInfo();
            if((networkInfo != null) && (networkInfo.isAvailable())){
                Toast.makeText(context, "Network Is Available", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(context, "Network Is Unavailable", Toast.LENGTH_SHORT).show();
            }

        }
    }
}
