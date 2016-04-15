package layout;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chapter4.test.tristan.fragmentdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnotherFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("FRAGMENT","onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.another_right_fragment, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        Log.d("FRAGMENT","onAttach");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("FRAGMENT","onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.d("FRAGMENT","onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.d("FRAGMENT","onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("FRAGMENT","onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("FRAGMENT","onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("FRAGMENT","onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("FRAGMENT","onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d("FRAGMENT","onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("FRAGMENT","onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("FRAGMENT","onDetach");
        super.onDetach();
    }
}
