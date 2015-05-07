package com.raizlabs.universalfontwidgets.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

public class FontHelper {

    public enum Font {
        RobotoBlack {
            @Override
            public String getAssetPath() {
                return "fonts/roboto/Roboto-Black.ttf";
            }
        },
        RobotoBlackItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/Roboto-BlackItalic.ttf";
            }
        },
        RobotoBold {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/Roboto-Bold.ttf";
            }
        },
        RobotoBoldItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/Roboto-Italic.ttf";
            }
        },
        RobotoItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/Roboto-Italic.ttf";
            }
        },
        RobotoLight {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/Roboto-Light.ttf";
            }
        },
        RobotoLightItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/Roboto-LightItalic.ttf";
            }
        },
        RobotoMedium {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/Roboto-Medium.ttf";
            }
        },
        RobotoMediumItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/Roboto-MediumItalic.ttf";
            }
        },
        RobotoRegular {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/Roboto-Regular.ttf";
            }
        },
        RobotoThin {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/Roboto-Thin.ttf";
            }
        },
        RobotoThinItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/Roboto-ThinItalic.ttf";
            }
        },
        RobotoCondensedBold {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/RobotoCondensed-Bold.ttf";
            }
        },
        RobotoCondensedBoldItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/RobotoCondensed-Bold.ttf";
            }
        },
        RobotoCondensedItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/RobotoCondensed-Italic.ttf";
            }
        },
        RobotoCondensedLight {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/RobotoCondensed-Light.ttf";
            }
        },
        RobotoCondensedLightItalic {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/RobotoCondensed-LightItalic.ttf";
            }
        },
        RobotoCondensedRegular {
            @Override
            protected String getAssetPath() {
                return "fonts/roboto/RobotoCondensed-Regular.ttf";
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
