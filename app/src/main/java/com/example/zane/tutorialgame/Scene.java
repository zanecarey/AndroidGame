package com.example.zane.tutorialgame;

import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * Created by Zane on 10/15/2017.
 */

public interface Scene {
    public void update();
    public void draw(Canvas canvas);
    public void terminate();
    public void receiveTouch(MotionEvent event);
}
