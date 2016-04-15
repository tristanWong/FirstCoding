package layout;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chapter4.test.tristan.fragmentdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.right_fregment, container, false);
    }

}
