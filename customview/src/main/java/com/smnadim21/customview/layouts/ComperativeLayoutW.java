package com.smnadim21.customview.layouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;

import com.smnadim21.customview.R;

public class ComperativeLayoutW extends RelativeLayout {

    Float ratio;

    public ComperativeLayoutW(Context context) {
        super(context);
    }

    public ComperativeLayoutW(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ComperativeLayoutW(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (attrs != null) {
            TypedArray a = getContext()
                    .obtainStyledAttributes(attrs,
                            R.styleable.ComperativeLayoutW,
                            0, 0);

            ratio = a.getFloat(R.styleable.ComperativeLayoutW_ratio, 1.0f);

            // setColor(a.getInt(R.styleable.ColorMixer_initialColor, 0xFFA4C639));

            a.recycle();
        }

    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ComperativeLayoutW(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

       /* ViewGroup.LayoutParams params = getLayoutParams();
        params.width = getMeasuredHeight();*/

        super.onMeasure(widthMeasureSpec, (int) (widthMeasureSpec * ratio));


    }
}
