package com.test.daggersample.components;

import com.test.daggersample.model.Processor;
import com.test.daggersample.modules.MediaTekModule;
import com.test.daggersample.scopes.FragmentScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@FragmentScope
@Component(modules = MediaTekModule.class)
public interface FragmentComponent {

    Processor getProcessor();

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder setClockSpeed(@Named("clockSpeed")int clockSpeed);

        @BindsInstance
        Builder setCore(@Named("core")int core);

        FragmentComponent build();
    }
}
