package com.test.daggersample.model;

import android.util.Log;

import com.test.daggersample.MainActivity;

import javax.inject.Inject;

public class Mobile {

    private Battery battery;
    private Processor processor;
    private Camera camera;

    @Inject
    public Mobile(Battery battery, Processor processor, Camera camera){
        this.battery = battery;
        this.processor = processor;
        this.camera = camera;
        Log.d(MainActivity.TAG, "Mobile: battery "+battery.toString()+"  "+processor.toString()+"  "+this.toString());
    }

    public void run(){
        processor.start();
        Log.d(MainActivity.TAG, "Mobile run: ");
    }

    @Inject
    public void setCharger(Charger charger){
        charger.setCharger(this);
    }
}
