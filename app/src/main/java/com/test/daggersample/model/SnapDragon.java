package com.test.daggersample.model;

import android.util.Log;

import com.test.daggersample.MainActivity;

import javax.inject.Inject;

public class SnapDragon implements Processor {
    int clockSpeed;


    @Inject
    public SnapDragon(int clockSpeed) {
        this.clockSpeed = clockSpeed;
        Log.d(MainActivity.TAG, "SnapDragon: ");
    }

    @Override
    public void start() {
        Log.d(MainActivity.TAG, "SnapDragon start: with clockSpeed = "+clockSpeed);
    }
}
