package com.shpp.p2p.cs.opavlenko.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/*
Illusionary contours.
 */
public class Assignment2Part2 extends WindowProgram {
    public void run() {
        int w = getWidth();
        int h = getHeight();
        double step_w = w * 0.333333;
        double step_h = h * 0.333333;
        GOval o1 = new GOval(0, 0, step_w, step_h);
        o1.setFilled(true);
        add(o1);
        GOval o2 = new GOval(step_w * 2, 0, step_w, step_h);
        o2.setFilled(true);
        add(o2);
        GOval o3 = new GOval(0, step_h * 2, step_w, step_h);
        o3.setFilled(true);
        add(o3);
        GOval o4 = new GOval(step_w * 2, step_h * 2, step_w, step_h);
        o4.setFilled(true);
        add(o4);

        GRect r = new GRect(step_w / 2, step_h / 2, step_w * 2, step_h * 2);
        r.setColor(Color.WHITE);
        r.setFilled(true);
        add(r);
    }
}
