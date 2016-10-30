package com.example.sergey.graphics;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;

public class MainActivity extends Activity implements OnTouchListener {

    private Paint p1, p2, p3, p4;
    private int mywidth = 0, myheight = 0;
    private float x;
    private float y;
    private int counter = 0;
    private int rotate = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mm = new Desk(this);
        setContentView(mm);
        mm.setOnTouchListener(this);
        setContentView(mm);


    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        x = event.getX();
        y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: // нажатие
                mm.invalidate();// - заставляет программу перерисовать экран (вызвать onDraw).
                break;
        }
        return true;
    }

    class Desk extends View {

        public Desk(Context context) {
            super(context);
            p1 = new Paint();
            p2 = new Paint();
            p3 = new Paint();
            p4 = new Paint();
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            mywidth = w;
            myheight = h;
            super.onSizeChanged(w, h, oldw, oldh);
//            mm.invalidate();// - заставляет программу перерисовать экран (вызвать onDraw).
//            rotate = ~rotate;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int rowCount = 0;
            int counterDecisive=0;
            canvas.drawARGB(80, 102, 204, 255);
            p1.setColor(Color.BLACK);
            p2.setColor(Color.WHITE);
            p4.setColor(Color.argb(80, 102, 204, 255));
            int x2 = mywidth / 8;
            int y2 = (myheight)/ 10;
            for (int y1 = 0; y1 < (myheight); y1 += (myheight) / 10) {
                for (int x1 = 0; x1 < mywidth; x1 += mywidth / 8) {
                    if ((rowCount > 7) && (rowCount < 72)) {
                        if (counterDecisive % 2 == 0) canvas.drawRect(x1, y1, x2, y2, p2);
                        else canvas.drawRect(x1, y1, x2, y2, p1);
                    }
                    x2 += (mywidth) / 8;
                    rowCount++;
                    counterDecisive++;
                }
//                if (rotate == 0) {
                    counterDecisive--;
//                }
                y2 += (myheight)/ 10;
            }
            p3.setColor(Color.RED);
            p3.setTextSize(50);
            p3.setTextAlign(Paint.Align.CENTER);
            canvas.drawText("coordinates: " + Math.round(x) + ", " + Math.round(y) + "; number of clicks: " + counter++, mywidth-550, myheight-100, p3);// - выводит строку s в позиции x, y кистью p.
        }
    }

    Desk mm;
}

