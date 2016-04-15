package layout;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chapter4.test.tristan.fragmentdemo.R;

/**
 * Created by Tristan on 2016/4/11.
 */
public class LeftFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.left_fragment,container,false);


        return view;
    }
}
