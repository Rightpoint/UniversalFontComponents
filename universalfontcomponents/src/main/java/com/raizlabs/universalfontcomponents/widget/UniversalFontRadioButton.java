package com.raizlabs.universalfontcomponents.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;

import com.raizlabs.universalfontcomponents.R;
import com.raizlabs.universalfontcomponents.utils.FontHelper;
import com.raizlabs.universalfontcomponents.utils.FontMap;

public class UniversalFontRadioButton extends AppCompatRadioButton {
    public UniversalFontRadioButton(Context context) {
        super(context);
    }

    public UniversalFontRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray arr = context.obtainStyledAttributes(attrs, R.styleable.UniversalFontTextView);
        readArray(arr);
        arr.recycle();
    }

    public UniversalFontRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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

        int fontInt = arr.getInt(R.styleable.UniversalFontRadioButton_universalFont, -1);

        String fontPath = arr.getString(R.styleable.UniversalFontRadioButton_customFont);

        if (fontPath != null) {
            setFont(fontPath);
        } else {
            FontHelper.Font font = FontMap.getFontForKey(fontInt);
            setFont(font);
        }
    }
}
