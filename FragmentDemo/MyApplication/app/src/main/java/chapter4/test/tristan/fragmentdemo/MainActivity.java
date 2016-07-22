package chapter4.test.tristan.fragmentdemo;



import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import layout.AnotherFragment;
import layout.RightFragment;

public class MainActivity extends Activity implements View.OnClickListener{
    Button btn = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initView();

    }

    private void initView() {
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

        initRightFragment();

    }

    private void initRightFragment() {
        RightFragment rightFragment = new RightFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.right_fragment,rightFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                showAnotherFragment();
                break;
        }
    }

    private void showAnotherFragment() {
        Log.d("FRAGMENT","Hello Another Fragment");
        AnotherFragment anotherFragment = new AnotherFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.right_fragment,anotherFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
