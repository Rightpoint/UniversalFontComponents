package com.raizlabs.universalfontwidgets.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.raizlabs.universalfontwidgets.R;
import com.raizlabs.universalfontwidgets.utils.FontHelper;
import com.raizlabs.universalfontwidgets.utils.FontMap;

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
        setTypeface(font.getTypeface(getContext()));
    }

    public void setFont(String assetPath) {
        setTypeface(Typeface.createFromAsset(getResources().getAssets(), assetPath));
    }

    private void readArray(TypedArray arr) {

        if (isInEditMode()) {
            return;
        }

        int fontInt = arr.getInt(R.styleable.UniversalFontTextView_universalFont, -1);

        if (fontInt == -1) {
            String fontString = arr.getString(R.styleable.UniversalFontTextView_customFont);
            setFont(fontString);
        } else {
            FontHelper.Font font = FontMap.getFontForKey(fontInt);
            if (font != null) {
                setFont(font);
            }
        }
    }
}
