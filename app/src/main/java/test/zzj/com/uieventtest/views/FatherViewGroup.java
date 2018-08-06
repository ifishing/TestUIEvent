package test.zzj.com.uieventtest.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class FatherViewGroup extends RelativeLayout
{
    public static String TAG="UIEventTest";

    public FatherViewGroup(Context context)
    {
        super(context);
    }


    public FatherViewGroup(Context context, AttributeSet attrs)
    {
        super(context,attrs);
    }

    public FatherViewGroup(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context,attrs,defStyleAttr);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent event)
    {
        Log.d(TAG,"FatherViewGroup "+" onInterceptTouchEvent "+ "Event "+ event.getAction());
        return super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event)
    {
        Log.d(TAG,"FatherViewGroup "+" dispatchTouchEvent "+ "Event "+ event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        Log.d(TAG,"FatherViewGroup "+" onTouchEvent "+ "Event "+ event.getAction());
        return true;//return super.onTouchEvent(event);
    }
}
