package com.test.daggersample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.daggersample.components.ActivityComponent;
import com.test.daggersample.components.ApplicationComponent;
import com.test.daggersample.components.DaggerFragmentComponent;
import com.test.daggersample.components.FragmentComponent;
import com.test.daggersample.model.Battery;
import com.test.daggersample.model.Camera;
import com.test.daggersample.model.Processor;

public class MainFragment extends Fragment {
    private View view;
    FragmentComponent fragmentComponent;
    Processor processor1, processor2;
    Battery battery1, battery2;
    Camera camera1, camera2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_main, container, false);

        fragmentComponent = DaggerFragmentComponent.builder().setCore(8).setClockSpeed(4).build();

        processor1 = fragmentComponent.getProcessor();
        processor2 = fragmentComponent.getProcessor();

        ActivityComponent activityComponent = ((MainActivity)getActivity()).getComponent();

        battery1 = activityComponent.getBattery();
        battery2 = activityComponent.getBattery();

        ApplicationComponent applicationComponent = ((MyApplication)getContext().getApplicationContext()).getComponent();
        camera1 = applicationComponent.getCamera();
        camera2 = applicationComponent.getCamera();

        Log.d(MyApplication.TAG, "==============Fragment============= ");
        Log.d(MyApplication.TAG, "Fragment: "+camera1);
        Log.d(MyApplication.TAG, "Fragment: "+camera2);

        Log.d(MyApplication.TAG, "Fragment: "+battery1);
        Log.d(MyApplication.TAG, "Fragment: "+battery2);
        Log.d(MyApplication.TAG, "Fragment: "+processor1);
        Log.d(MyApplication.TAG, "Fragment: "+processor2);

        return view;
    }
}