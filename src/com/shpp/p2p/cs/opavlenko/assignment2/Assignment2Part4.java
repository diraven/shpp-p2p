package com.shpp.p2p.cs.opavlenko.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/*
Flag.
 */
public class Assignment2Part4 extends WindowProgram {
    public void run() {
        int w = getWidth();
        int h = getHeight();
        int flag_w = 300;
        int flag_h = 200;
        int section_w = flag_w / 3;
        int section_h = flag_h / 3;

        int start_x = w / 2 - flag_w / 2;
        int start_y = h / 2 - flag_h / 2;

        GRect r1 = new GRect(start_x, start_y, section_w, flag_h);
        r1.setColor(Color.BLACK);
        r1.setFilled(true);
        add(r1);
        GRect r2 = new GRect(start_x + section_w, start_y, section_w, flag_h);
        r2.setColor(Color.YELLOW);
        r2.setFilled(true);
        add(r2);
        GRect r3 = new GRect(start_x + 2 * section_w, start_y, section_w, flag_h);
        r3.setColor(Color.RED);
        r3.setFilled(true);
        add(r3);
    }
}
