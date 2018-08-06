package test.zzj.com.uieventtest.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class GrandViewGroup extends RelativeLayout
{
    public static String TAG="UIEventTest";

    public GrandViewGroup(Context context)
    {
        super(context);
    }


    public GrandViewGroup(Context context, AttributeSet attrs)
    {
        super(context,attrs);
    }

    public GrandViewGroup(Context context, AttributeSet attrs,int defStyleAttr)
    {
        super(context,attrs,defStyleAttr);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent event)
    {
        Log.d(TAG,"GrandViewGroup "+" onInterceptTouchEvent "+ "Event "+ event.getAction());
        return super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event)
    {
        Log.d(TAG,"GrandViewGroup "+" dispatchTouchEvent "+ "Event "+ event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        Log.d(TAG,"GrandViewGroup "+" onTouchEvent "+ "Event "+ event.getAction());
        return super.onTouchEvent(event);
    }
}
