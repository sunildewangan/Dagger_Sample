package com.test.daggersample.modules;

import com.test.daggersample.model.Camera;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Module;
import dagger.Provides;

@Module
abstract public class CameraModule {

    @Provides
    static Camera getCamera(@Named("megaPixel") int megaPixel){
        return new Camera(megaPixel);
    }
}
