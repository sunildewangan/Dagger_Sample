package com.test.daggersample.model;

import android.util.Log;

import com.test.daggersample.MainActivity;

import javax.inject.Inject;

public class Battery {
    //we don't own this class so we can't annotate it with @Inject

    private Cobalt cobalt;
    private Lithium lithium;

    @Inject
    public Battery(Cobalt cobalt, Lithium lithium) {
        this.cobalt = cobalt;
        this.lithium = lithium;
        Log.d(MainActivity.TAG, "Battery: ");
    }
}
