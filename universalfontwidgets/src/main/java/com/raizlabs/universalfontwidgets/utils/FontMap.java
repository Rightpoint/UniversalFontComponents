package com.raizlabs.universalfontwidgets.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;

import com.raizlabs.universalfontwidgets.R;
import com.raizlabs.universalfontwidgets.utils.FontHelper.Font;

import java.util.HashMap;

public class FontMap {

    private static SparseArray<FontHelper.Font> defaultFontMap;

    private static HashMap<String, Typeface> customFontMap;

    /**
     * Initializes the mapping of XML attributes. May be called more than
     * once without actually reloading everything.
     * @param context The {@link Context} to load resources from.
     */
    public static void init(Context context) {
        if (defaultFontMap == null) {
            defaultFontMap = new SparseArray<>();
            Resources resources = context.getResources();

            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Black, Font.RobotoBlack);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Black_Italic, Font.RobotoBlackItalic);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Bold, Font.RobotoBold);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Bold_Italic, Font.RobotoBoldItalic);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Italic, Font.RobotoItalic);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Light, Font.RobotoLight);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Light_Italic, Font.RobotoLightItalic);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Medium, Font.RobotoMedium);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Medium_Italic, Font.RobotoMediumItalic);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Regular, Font.RobotoRegular);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Thin, Font.RobotoThin);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Thin_Italic, Font.RobotoThinItalic);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Condensed_Bold, Font.RobotoCondensedBold);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Condensed_Bold_Italic, Font.RobotoCondensedBoldItalic);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Condensed_Italic, Font.RobotoCondensedItalic);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Condensed_Light, Font.RobotoCondensedLight);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Condensed_Light_Italic, Font.RobotoCondensedLightItalic);
            loadFont(resources, R.integer.UniversalFontWidgets_Roboto_Condensed_Regular, Font.RobotoCondensedRegular);
        }

        if (customFontMap == null) {
            customFontMap = new HashMap<>();
        }
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
        return defaultFontMap.get(key);
    }

    /**
     * Gets the {@link Typeface} mapped to the given asset path.  This is a string representing
     * the filename for the custom font to be applied.
     * @param context {@link Context} used to retrieve the asset manager
     * @param assetPath filename for the custom font file to be applied
     * @return {@link Typeface} for the calling view to apply
     */
    public static Typeface getFontForPath(Context context, String assetPath) {
        if (customFontMap.containsKey(assetPath)) {
            return customFontMap.get(assetPath);
        } else {
            Typeface font = Typeface.createFromAsset(context.getAssets(), assetPath);
            if (font != null) {
                customFontMap.put(assetPath, font);
                return font;
            } else {
                return null;
            }
        }
    }

    private static void loadFont(Resources resources, int resourceID, Font font) {
        defaultFontMap.put(resources.getInteger(resourceID), font);
    }
}
