package chapter2.test.tristan.apphidetitle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;


public class NormalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.normal_layout);

    }

}
