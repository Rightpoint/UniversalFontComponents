package com.raizlabs.universalfontcomponents.sample;

import android.app.Application;

import com.raizlabs.universalfontcomponents.UniversalFontComponents;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        UniversalFontComponents.init(this);
    }
}
