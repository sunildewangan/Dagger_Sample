package com.test.daggersample.components;

import com.test.daggersample.model.Battery;
import com.test.daggersample.modules.BatteryModule;
import com.test.daggersample.scopes.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = BatteryModule.class)
public interface ActivityComponent {

    Battery getBattery();
}
