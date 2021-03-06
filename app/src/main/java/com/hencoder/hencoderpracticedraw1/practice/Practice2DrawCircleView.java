package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
    private Paint mPaint = new Paint();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        int width = getWidth();
        int height = getHeight();
        mPaint.setColor(Color.BLACK);
        mPaint.setAntiAlias(true);
        canvas.drawCircle(width / 4, height / 4, 150, mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(width / 4 * 3, height / 4, 150, mPaint);

        mPaint.setStrokeWidth(50);
        canvas.drawCircle(width / 4 * 3, height / 4 * 3, 150, mPaint);

        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(width / 4, height / 4 * 3, 150, mPaint);
    }
}
