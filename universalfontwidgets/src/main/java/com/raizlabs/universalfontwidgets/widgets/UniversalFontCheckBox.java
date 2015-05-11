package com.raizlabs.universalfontwidgets.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;

import com.raizlabs.universalfontwidgets.R;
import com.raizlabs.universalfontwidgets.utils.FontHelper;
import com.raizlabs.universalfontwidgets.utils.FontMap;

public class UniversalFontCheckBox extends AppCompatCheckBox {

    public UniversalFontCheckBox(Context context) {
        super(context);
    }

    public UniversalFontCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray arr = context.obtainStyledAttributes(attrs, R.styleable.UniversalFontTextView);
        readArray(arr);
        arr.recycle();
    }

    public UniversalFontCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray arr = context.obtainStyledAttributes(attrs, R.styleable.UniversalFontTextView);
        readArray(arr);
        arr.recycle();
    }

    public void setFont(FontHelper.Font font) {
        if (font != null) {
            setTypeface(font.getTypeface(getContext()));
        }
    }

    public void setFont(String assetPath) {
        Typeface font = FontMap.getFontForPath(getContext(), assetPath);

        if (font != null) {
            setTypeface(font);
        }
    }

    private void readArray(TypedArray arr) {

        if (isInEditMode()) {
            return;
        }

        int fontInt = arr.getInt(R.styleable.UniversalFontCheckBox_universalFont, -1);

        String fontPath = arr.getString(R.styleable.UniversalFontCheckBox_customFont);

        if (fontPath != null) {
            setFont(fontPath);
        } else {
            FontHelper.Font font = FontMap.getFontForKey(fontInt);
            setFont(font);
        }
    }
}
