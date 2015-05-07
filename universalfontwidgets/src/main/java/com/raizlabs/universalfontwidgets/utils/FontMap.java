package com.raizlabs.universalfontwidgets.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;

import com.raizlabs.universalfontwidgets.R;
import com.raizlabs.universalfontwidgets.utils.FontHelper.Font;

public class FontMap {

    private static SparseArray<FontHelper.Font> map;

    /**
     * Initializes the mapping of XML attributes. May be called more than
     * once without actually reloading everything.
     * @param context The {@link Context} to load resources from.
     */
    public static void init(Context context) {
        if (map == null) {
            map = new SparseArray<>();
            Resources resources = context.getResources();

            loadFont(resources, R.integer.Font_Roboto_Black, Font.RobotoBlack);
            loadFont(resources, R.integer.Font_Roboto_Black_Italic, Font.RobotoBlackItalic);
            loadFont(resources, R.integer.Font_Roboto_Bold, Font.RobotoBold);
            loadFont(resources, R.integer.Font_Roboto_Bold_Italic, Font.RobotoBoldItalic);
            loadFont(resources, R.integer.Font_Roboto_Italic, Font.RobotoItalic);
            loadFont(resources, R.integer.Font_Roboto_Light, Font.RobotoLight);
            loadFont(resources, R.integer.Font_Roboto_Light_Italic, Font.RobotoLightItalic);
            loadFont(resources, R.integer.Font_Roboto_Medium, Font.RobotoMedium);
            loadFont(resources, R.integer.Font_Roboto_Medium_Italic, Font.RobotoMediumItalic);
            loadFont(resources, R.integer.Font_Roboto_Regular, Font.RobotoRegular);
            loadFont(resources, R.integer.Font_Roboto_Thin, Font.RobotoThin);
            loadFont(resources, R.integer.Font_Roboto_Thin_Italic, Font.RobotoThinItalic);
            loadFont(resources, R.integer.Font_Roboto_Condensed_Bold, Font.RobotoCondensedBold);
            loadFont(resources, R.integer.Font_Roboto_Condensed_Bold_Italic, Font.RobotoCondensedBoldItalic);
            loadFont(resources, R.integer.Font_Roboto_Condensed_Italic, Font.RobotoCondensedItalic);
            loadFont(resources, R.integer.Font_Roboto_Condensed_Light, Font.RobotoCondensedLight);
            loadFont(resources, R.integer.Font_Roboto_Condensed_Light_Italic, Font.RobotoCondensedLightItalic);
            loadFont(resources, R.integer.Font_Roboto_Condensed_Regular, Font.RobotoCondensedRegular);
        }
    }

    private static void loadFont(Resources resources, int resourceID, Font font) {
        map.put(resources.getInteger(resourceID), font);
    }

    /**
     * Gets the {@link Font} mapped to the given XML attribute value. This
     * should be one of the constants out of {@link R.integer}.
     * @param key The value of the {@link R.integer} for the font to obtain.
     * This should be the actual integer value as obtained from
     * {@link Resources#getInteger(int)}, NOT the resource ID itself.
     * @return The {@link Font} the integer corresponds to.
     */
    public static Font getFontForKey(int key) {
        return map.get(key);
    }
}
