package com.smnadim21.customview.fluid;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;

import androidx.annotation.RequiresApi;

public class FluidEditText extends androidx.appcompat.widget.AppCompatEditText {
    public FluidEditText(Context context) {
        super(context);
    }

    public FluidEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FluidEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getHeight() > 0) {
            this.setTextSize(((getHeight() / getTextSizeFactor())));
        }
    }

    float getTextSizeFactor() {
        int width = Resources.getSystem().getDisplayMetrics().widthPixels;
        int height = Resources.getSystem().getDisplayMetrics().heightPixels;
        return ((float) height / width) * 2.5f * getLineCount();
    }
}