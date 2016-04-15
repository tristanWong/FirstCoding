package chapter5.test.tristan.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Tristan on 2016/4/15.
 */
public class BaseActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
