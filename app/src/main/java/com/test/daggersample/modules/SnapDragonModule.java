package com.test.daggersample.modules;

import com.test.daggersample.model.Processor;
import com.test.daggersample.model.SnapDragon;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapDragonModule {

    int clockSpeed;

    public SnapDragonModule(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Provides
    int getClockSpeed(){
        return clockSpeed;
    }

    @Provides
    Processor getProcessor(SnapDragon snapDragon){
        return snapDragon;
    }
}
