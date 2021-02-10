package com.test.daggersample.components;

import com.test.daggersample.MainActivity;
import com.test.daggersample.model.MediaTek;
import com.test.daggersample.model.Mobile;
import com.test.daggersample.modules.BatteryModule;
import com.test.daggersample.modules.CameraModule;
import com.test.daggersample.modules.MediaTekModule;
import com.test.daggersample.modules.SnapDragonModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {BatteryModule.class, MediaTekModule.class, CameraModule.class})
public interface MobileComponent {

   // Mobile getMobile();

    void inject(MainActivity activity);

//    @Component.Builder
//    interface Builder{
//
//        Builder setClockSpeed(@BindsInstance @Named("clockSpeed") int clockSpeed);
//
//        Builder setCore(@BindsInstance @Named("core") int core);
//
//        MobileComponent build();
//    }

    @Component.Factory
    interface factory{
        MobileComponent create(@BindsInstance @Named("clockSpeed") int clockSpeed,
                               @BindsInstance @Named("core") int core,
                               @BindsInstance @Named("megaPixel") int megaPixel);
    }
}
