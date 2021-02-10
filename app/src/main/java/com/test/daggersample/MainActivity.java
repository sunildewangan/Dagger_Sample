package com.test.daggersample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.test.daggersample.components.DaggerMobileComponent;
import com.test.daggersample.components.MobileComponent;
import com.test.daggersample.model.Battery;
import com.test.daggersample.model.Mobile;
import com.test.daggersample.model.Processor;
import com.test.daggersample.modules.BatteryModule;
import com.test.daggersample.modules.SnapDragonModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    @Inject
    Mobile mobile1,mobile2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileComponent mobileComponent = DaggerMobileComponent.factory().create(3,5,64);
//        Mobile mobile = mobileComponent.getMobile();
        mobileComponent.inject(this);
        mobile1.run();
        mobile2.run();
    }
}