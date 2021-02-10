package com.test.daggersample.components;

import com.test.daggersample.model.Camera;
import com.test.daggersample.modules.CameraModule;
import com.test.daggersample.scopes.ApplicationScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@ApplicationScope
@Component(modules = CameraModule.class)
public interface ApplicationComponent {

    Camera getCamera();

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder setMp(@Named("megaPixel") int megaPixel);
        ApplicationComponent build();
    }
}
