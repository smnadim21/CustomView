package com.smnadim21.customview.fluid;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FluidTextView extends androidx.appcompat.widget.AppCompatTextView {
    public FluidTextView(@NonNull Context context) {
        super(context);
    }

    public FluidTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FluidTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
        return ((float) height / width) * 2f * getLineCount();
    }
}