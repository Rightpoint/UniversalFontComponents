package com.raizlabs.universalfont.sample;

import android.app.Application;

import com.raizlabs.universalfontwidgets.utils.FontMap;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FontMap.init(this);
    }
}
