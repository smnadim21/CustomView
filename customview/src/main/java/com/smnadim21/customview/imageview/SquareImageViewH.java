package com.smnadim21.customview.imageview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class SquareImageViewH extends ImageView {
    public SquareImageViewH(Context context) {
        super(context);
    }

    public SquareImageViewH(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageViewH(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public SquareImageViewH(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(heightMeasureSpec, heightMeasureSpec);
    }
}
