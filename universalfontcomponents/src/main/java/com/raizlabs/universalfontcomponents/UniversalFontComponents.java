package com.raizlabs.universalfontcomponents;

import android.content.Context;

import com.raizlabs.universalfontcomponents.utils.FontMap;

public class UniversalFontComponents {

    /**
     * Initializes the library components
     * @param context {@link Context} used to initialize components
     */
    public static void init(Context context) {
        FontMap.init(context);
    }
}
