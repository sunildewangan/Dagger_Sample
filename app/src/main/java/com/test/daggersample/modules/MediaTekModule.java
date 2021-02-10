package com.test.daggersample.modules;

import com.test.daggersample.model.MediaTek;
import com.test.daggersample.model.Processor;
import com.test.daggersample.scopes.FragmentScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
abstract public class MediaTekModule {

    @FragmentScope
    @Binds
     abstract Processor getProcessor(MediaTek mediaTek);
}
