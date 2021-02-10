package com.test.daggersample.modules;

import com.test.daggersample.model.Battery;
import com.test.daggersample.model.Cobalt;
import com.test.daggersample.model.Lithium;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {

    @Provides
    Cobalt getCobalt(){
        return new Cobalt();
    }

    @Provides
    Lithium getLithium(){
        Lithium lithium = new Lithium();
        lithium.done();
        return lithium;
    }

    @Singleton
    @Provides
    Battery getBattery(Cobalt cobalt, Lithium lithium){
        return new Battery(cobalt, lithium);
    }
}
