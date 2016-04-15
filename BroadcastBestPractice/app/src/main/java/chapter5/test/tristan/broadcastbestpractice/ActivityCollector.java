package chapter5.test.tristan.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tristan on 2016/4/15.
 */
public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<Activity>();


    public static void addActivity(Activity activity){
        activities.add(activity);

    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){

        for (Activity activity:activities) {
            activity.finish();
        }

    }

}
