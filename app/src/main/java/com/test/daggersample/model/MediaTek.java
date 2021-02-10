package com.test.daggersample.model;

import android.util.Log;

import com.test.daggersample.MainActivity;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class MediaTek implements Processor {
    int clockSpeed;
    int core;


    @Inject
    public MediaTek(@Named("clockSpeed")int clockSpeed, @Named("core")int core) {
        this.clockSpeed = clockSpeed;
        this.core = core;
        Log.d(MainActivity.TAG, "MediaTek: start with clockSpeed "+clockSpeed+" core "+core);
    }

    @Override
    public void start() {
        Log.d(MainActivity.TAG, "MediaTek start: ");
    }
}
