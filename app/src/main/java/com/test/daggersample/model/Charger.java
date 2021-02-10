package com.test.daggersample.model;

import android.util.Log;

import com.test.daggersample.MainActivity;

import javax.inject.Inject;

public class Charger {

    @Inject
    public Charger() {
        Log.d(MainActivity.TAG, "Charger: ");
    }

    public void setCharger(Mobile mobile){
        Log.d(MainActivity.TAG, "setCharger: ");
    }
}
