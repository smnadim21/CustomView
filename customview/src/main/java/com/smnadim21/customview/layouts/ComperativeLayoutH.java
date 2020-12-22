package com.smnadim21.customview.layouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;

import com.smnadim21.customview.R;

public class ComperativeLayoutH extends RelativeLayout {

    Float ratio;

    public ComperativeLayoutH(Context context) {
        super(context);
    }

    public ComperativeLayoutH(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (attrs != null) {
            TypedArray a = getContext()
                    .obtainStyledAttributes(attrs,
                            R.styleable.ComperativeLayoutH,
                            0, 0);

            ratio = a.getFloat(R.styleable.ComperativeLayoutH_ratio, 1.0f);
            Log.e("ratio", ratio + "");

            // setColor(a.getInt(R.styleable.ColorMixer_initialColor, 0xFFA4C639));
            a.recycle();
        }

    }

    public ComperativeLayoutH(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        if (attrs != null) {
            TypedArray a = getContext()
                    .obtainStyledAttributes(attrs,
                            R.styleable.ComperativeLayoutH,
                            0, 0);

            ratio = a.getFloat(R.styleable.ComperativeLayoutH_ratio, 1.0f);
            Log.e("ratio", ratio + "");

            // setColor(a.getInt(R.styleable.ColorMixer_initialColor, 0xFFA4C639));
            a.recycle();
        }


    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ComperativeLayoutH(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

       /* ViewGroup.LayoutParams params = getLayoutParams();
        params.width = getMeasuredHeight();*/

   /*     Log.e("w h >>", widthMeasureSpec + " " + heightMeasureSpec);
        Log.e("w h >>", View.MeasureSpec.getSize(widthMeasureSpec) + " " + View.MeasureSpec.getSize(heightMeasureSpec));*/

        super.onMeasure(MeasureSpec.makeMeasureSpec((int) (MeasureSpec.getSize(heightMeasureSpec) / ratio),MeasureSpec.getMode(heightMeasureSpec)), heightMeasureSpec);

    }
}
