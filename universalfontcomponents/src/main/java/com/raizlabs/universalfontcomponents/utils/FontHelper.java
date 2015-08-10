package com.raizlabs.universalfontcomponents.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

public class FontHelper {

    public enum Font {
        RobotoBlack {
            @Override
            public String getAssetPath() {
                return "fonts/defaultFonts/Roboto-Black.ttf";
            }
        },
        RobotoBlackItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/Roboto-BlackItalic.ttf";
            }
        },
        RobotoBold {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/Roboto-Bold.ttf";
            }
        },
        RobotoBoldItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/Roboto-Italic.ttf";
            }
        },
        RobotoItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/Roboto-Italic.ttf";
            }
        },
        RobotoLight {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/Roboto-Light.ttf";
            }
        },
        RobotoLightItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/Roboto-LightItalic.ttf";
            }
        },
        RobotoMedium {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/Roboto-Medium.ttf";
            }
        },
        RobotoMediumItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/Roboto-MediumItalic.ttf";
            }
        },
        RobotoRegular {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/Roboto-Regular.ttf";
            }
        },
        RobotoThin {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/Roboto-Thin.ttf";
            }
        },
        RobotoThinItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/Roboto-ThinItalic.ttf";
            }
        },
        RobotoCondensedBold {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/RobotoCondensed-Bold.ttf";
            }
        },
        RobotoCondensedBoldItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/RobotoCondensed-Bold.ttf";
            }
        },
        RobotoCondensedItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/RobotoCondensed-Italic.ttf";
            }
        },
        RobotoCondensedLight {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/RobotoCondensed-Light.ttf";
            }
        },
        RobotoCondensedLightItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/RobotoCondensed-LightItalic.ttf";
            }
        },
        RobotoCondensedRegular {
            @Override
            protected String getAssetPath() {
                return "fonts/defaultFonts/RobotoCondensed-Regular.ttf";
            }
        };

        private Typeface typeface;

        public Typeface getTypeface(Context context) {
            if (typeface == null) {
                typeface = Typeface.createFromAsset(context.getAssets(), getAssetPath());
            }

            return typeface;
        }

        protected abstract String getAssetPath();
    }

    /**
     * Applies the given {@link Font} to the given {@link TextView}.
     * @param view The {@link TextView} to apply the font to.
     * @param font The {@link Font} to apply.s
     */
    public static void applyFont(TextView view, Font font) {
        view.setTypeface(font.getTypeface(view.getContext()));
    }

    /**
     * Searches the {@link FontMap} for the {@link Typeface} specified by the asset path
     * @param view the {@link TextView} to apply the font to.
     * @param fontAssetPath The asset path containing the font file.
     */
    public static void applyFont(TextView view, String fontAssetPath) {
        view.setTypeface(FontMap.getFontForPath(view.getContext(), fontAssetPath));
    }
}
