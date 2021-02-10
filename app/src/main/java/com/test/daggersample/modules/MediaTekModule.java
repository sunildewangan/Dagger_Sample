package com.test.daggersample.modules;

import com.test.daggersample.model.MediaTek;
import com.test.daggersample.model.Processor;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
abstract public class MediaTekModule {

    @Binds
     abstract Processor getProcessor(MediaTek mediaTek);
}
