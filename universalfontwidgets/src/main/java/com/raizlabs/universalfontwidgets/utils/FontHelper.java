package com.raizlabs.universalfontwidgets.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

public class FontHelper {

    public enum Font {
        RobotoBlack {
            @Override
            public String getAssetPath() {
                return "fonts/Roboto-Black.ttf";
            }
        },
        RobotoBlackItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/Roboto-BlackItalic.ttf";
            }
        },
        RobotoBold {
            @Override
            protected String getAssetPath() {
                return "fonts/Roboto-Bold.ttf";
            }
        },
        RobotoBoldItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/Roboto-Italic.ttf";
            }
        },
        RobotoItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/Roboto-Italic.ttf";
            }
        },
        RobotoLight {
            @Override
            protected String getAssetPath() {
                return "fonts/Roboto-Light.ttf";
            }
        },
        RobotoLightItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/Roboto-LightItalic.ttf";
            }
        },
        RobotoMedium {
            @Override
            protected String getAssetPath() {
                return "fonts/Roboto-Medium.ttf";
            }
        },
        RobotoMediumItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/Roboto-MediumItalic.ttf";
            }
        },
        RobotoRegular {
            @Override
            protected String getAssetPath() {
                return "fonts/Roboto-Regular.ttf";
            }
        },
        RobotoThin {
            @Override
            protected String getAssetPath() {
                return "fonts/Roboto-Thin.ttf";
            }
        },
        RobotoThinItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/Roboto-ThinItalic.ttf";
            }
        },
        RobotoCondensedBold {
            @Override
            protected String getAssetPath() {
                return "fonts/RobotoCondensed-Bold.ttf";
            }
        },
        RobotoCondensedBoldItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/RobotoCondensed-Bold.ttf";
            }
        },
        RobotoCondensedItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/RobotoCondensed-Italic.ttf";
            }
        },
        RobotoCondensedLight {
            @Override
            protected String getAssetPath() {
                return "fonts/RobotoCondensed-Light.ttf";
            }
        },
        RobotoCondensedLightItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/RobotoCondensed-LightItalic.ttf";
            }
        },
        RobotoCondensedRegular {
            @Override
            protected String getAssetPath() {
                return "fonts/RobotoCondensed-Regular.ttf";
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
}
