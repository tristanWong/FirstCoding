package chapter2.test.tristan.apphidetitle;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn2 = (Button) findViewById(R.id.btnStartNormal);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent normal = new Intent();
                normal.setClass(MainActivity.this,NormalActivity.class);
                startActivity(normal);
            }
        });
        Button btn3 = (Button) findViewById(R.id.btnStartdialog);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dialog = new Intent();
                dialog.setClass(MainActivity.this,DialogActivity.class);
                startActivity(dialog);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "You Clicked ADD", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rem_item:
                Toast.makeText(this, "You Clicked REM", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }

    @Override
    protected void onStart() {
        Log.d("TAG ","onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("TAG ","onResume");
        super.onResume();
    }

    @Override
    protected void onPostResume() {
        Log.d("TAG ","onPostResume");
        super.onPostResume();
    }

    @Override
    protected void onPause(){
        Log.d("TAG ","onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {

        Log.d("TAG ","onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("TAG ","onDestroy");
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
}
