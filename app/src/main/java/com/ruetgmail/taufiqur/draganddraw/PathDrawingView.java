/*package com.ruetgmail.taufiqur.draganddraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nishat on 2/24/2017.
 */
/*
public class PathDrawingView extends View {
    private Paint brush = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Path path = new Path();

    public PathDrawingView(Context context) {
        super(context);
        brush.setStyle(Paint.Style.STROKE);
        brush.setStrokeWidth(5);
    }

    @Override
    protected void onDraw(Canvas c) {
        c.drawPath(path, brush);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(x, y);
                break;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(x, y);
                break;
            default:
                return false;
        }
        invalidate();
        return true;
    }
}*/


package com.ruetgmail.taufiqur.draganddraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nishat on 2/24/2017.
 */
public class PathDrawingView extends View {
    private Paint mBackgroundPaint;
    private Paint brush = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Path path;

    // Used when creating the view in code
    public PathDrawingView(Context context) {
        this(context, null);
    }

    // Used when inflating the view from XML
    public PathDrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // Paint the boxes a nice semitransparent red (ARGB)
        brush.setStyle(Paint.Style.STROKE);
        brush.setStrokeWidth(10);
        // Paint the background off-white
        mBackgroundPaint = new Paint();
        mBackgroundPaint.setColor(0xfff8efe0);
        path = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // Fill the background
        canvas.drawPaint(mBackgroundPaint);
        canvas.drawPath(path, brush);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(x, y);
                break;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(x, y);
                break;
            default:
                return false;
        }
        invalidate();
        return true;
    }
}
