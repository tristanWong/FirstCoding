package chapter5.test.tristan.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tristan on 2016/4/15.
 */
public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button offline = (Button) findViewById(R.id.force_offline);
        offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bIntent = new Intent("com.example.broadcastbestpractice.FORCE_OFFLINE");
                sendBroadcast(bIntent);
            }
        });
    }
}
