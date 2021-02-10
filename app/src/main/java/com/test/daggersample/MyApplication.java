package com.test.daggersample;

import android.app.Application;
import android.util.Log;

import com.test.daggersample.components.ApplicationComponent;
import com.test.daggersample.components.DaggerApplicationComponent;
import com.test.daggersample.model.Camera;

public class MyApplication extends Application {
    public static final String TAG = "Comman";
    ApplicationComponent component;

    Camera camera1, camera2;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder().setMp(64).build();

        camera1 = component.getCamera();
        camera2 = component.getCamera();

        Log.d(TAG, "==============Application============= ");
        Log.d(TAG, "Application: "+camera1);
        Log.d(TAG, "Application: "+camera2);
    }

    public ApplicationComponent getComponent(){
        return component;
    }

}
