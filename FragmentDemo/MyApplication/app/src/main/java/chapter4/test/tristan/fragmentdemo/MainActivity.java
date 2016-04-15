package chapter4.test.tristan.fragmentdemo;



import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import layout.AnotherFragment;

public class MainActivity extends Activity implements View.OnClickListener{
    Button btn = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
//                showAnotherFragment();
                break;
        }
    }

//    private void showAnotherFragment() {
//        AnotherFragment anotherFragment = new AnotherFragment();
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.right_layout,anotherFragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }
}
