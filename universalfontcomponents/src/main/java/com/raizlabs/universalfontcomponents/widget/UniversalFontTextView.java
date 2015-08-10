package com.raizlabs.universalfontcomponents.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.raizlabs.universalfontcomponents.R;
import com.raizlabs.universalfontcomponents.utils.FontHelper;
import com.raizlabs.universalfontcomponents.utils.FontMap;

public class UniversalFontTextView extends AppCompatTextView {

    public UniversalFontTextView(Context context) {
        super(context);
    }

    public UniversalFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray arr = context.obtainStyledAttributes(attrs, R.styleable.UniversalFontTextView);
        readArray(arr);
        arr.recycle();
    }

    public UniversalFontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

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

        int fontInt = arr.getInt(R.styleable.UniversalFontTextView_universalFont, -1);

        String fontPath = arr.getString(R.styleable.UniversalFontTextView_customFont);

        if (fontPath != null) {
            setFont(fontPath);
        } else {
            FontHelper.Font font = FontMap.getFontForKey(fontInt);
            setFont(font);
        }
    }
}
