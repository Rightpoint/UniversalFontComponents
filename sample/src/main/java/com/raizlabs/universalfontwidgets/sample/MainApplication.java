package com.raizlabs.universalfontwidgets.sample;

import android.app.Application;

import com.raizlabs.universalfontwidgets.UniversalFontComponents;
import com.raizlabs.universalfontwidgets.utils.FontMap;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        UniversalFontComponents.init(this);
    }
}
