package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {
    private Paint mPaint = new Paint();
    private Path mPath = new Path();
    private RectF mRectF = new RectF();

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    {
        mPath.addArc(200, 200, 400, 400, -225, 225);
        mPath.arcTo(400, 200, 600, 400, 180, 225, false);
        mPath.lineTo(400, 542);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        mPaint.setColor(Color.BLACK);
        canvas.drawPath(mPath, mPaint);

//        mPaint.setColor(Color.RED);
//        mRectF.set(200,200,400,400);
//        canvas.drawOval(mRectF,mPaint);
//        mRectF.set(400,200,600,400);
//        mPaint.setColor(Color.GREEN);
//        canvas.drawOval(mRectF,mPaint);


    }
}
