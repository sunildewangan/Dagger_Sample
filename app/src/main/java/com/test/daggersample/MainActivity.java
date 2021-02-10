package com.test.daggersample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.test.daggersample.components.ActivityComponent;
import com.test.daggersample.components.ApplicationComponent;
import com.test.daggersample.components.DaggerActivityComponent;
import com.test.daggersample.model.Battery;
import com.test.daggersample.model.Camera;
import com.test.daggersample.model.Mobile;

//Application -- Camera
//Activity -- Battery
//Fragment -- Processor

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    ActivityComponent component;
    Battery battery1, battery2;
    Camera camera1, camera2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replace(new MainFragment());

        component = DaggerActivityComponent.builder().build();

        battery1 = component.getBattery();
        battery2 = component.getBattery();

        ApplicationComponent applicationComponent = ((MyApplication)getApplicationContext()).getComponent();

        camera1 = applicationComponent.getCamera();
        camera2 = applicationComponent.getCamera();

        Log.d(MyApplication.TAG, "==============Activity============= ");
        Log.d(MyApplication.TAG, "Activity: "+camera1);
        Log.d(MyApplication.TAG, "Activity: "+camera2);

        Log.d(MyApplication.TAG, "Activity: "+battery1);
        Log.d(MyApplication.TAG, "Activity: "+battery2);
    }

    void replace(Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame, fragment);
        ft.commit();
    }

    public ActivityComponent getComponent() {
        return component;
    }
}