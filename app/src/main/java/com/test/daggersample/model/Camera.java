package com.test.daggersample.model;

import android.util.Log;

import com.test.daggersample.MainActivity;

import javax.inject.Inject;

public class Camera {

    //we don't own this class so we can't annotate it with @Inject

    int megaPixel;
    public Camera(int megaPixel) {
        this.megaPixel = megaPixel;
        Log.d(MainActivity.TAG, "Camera: created with "+megaPixel+ " Megapixel");
    }
}
