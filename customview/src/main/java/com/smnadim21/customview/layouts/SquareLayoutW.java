package com.smnadim21.customview.layouts;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;

public class SquareLayoutW extends RelativeLayout {

    public SquareLayoutW(Context context) {
        super(context);
    }

    public SquareLayoutW(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareLayoutW(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public SquareLayoutW(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

       /* ViewGroup.LayoutParams params = getLayoutParams();
        params.width = getMeasuredHeight();*/


        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
  /*      if (widthMeasureSpec < heightMeasureSpec)
            super.onMeasure(widthMeasureSpec, widthMeasureSpec);
        else
            super.onMeasure(heightMeasureSpec, heightMeasureSpec);
    }*/

    }
}
