package test.zzj.com.uieventtest.views;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;

public class LogImageView extends AppCompatImageView
{
    public static String TAG="UIEventTest";

    public LogImageView(Context context)
    {
        super(context);
    }


    public LogImageView(Context context, AttributeSet attrs)
    {
        super(context,attrs);
    }

    public LogImageView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context,attrs,defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event)
    {
        Log.d(TAG,"LogImageView "+" dispatchTouchEvent "+ "Event "+ event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        Log.d(TAG,"LogImageView "+" onTouchEvent "+ "Event "+ event.getAction());
        return super.onTouchEvent(event);
    }

}
