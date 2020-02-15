package com.shpp.p2p.cs.opavlenko.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/*
One more optical illusion.
 */
public class Assignment2Part5 extends WindowProgram {

    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    public void run() {
        int w = getWidth();
        int h = getHeight();

        double offset_x = (w - NUM_COLS * (BOX_SIZE + BOX_SPACING)) / 2;
        double offset_y = (h - NUM_COLS * (BOX_SIZE + BOX_SPACING)) / 2;

        for (int i = 0; i < NUM_COLS; i++) {
            for (int j = 0; j < NUM_ROWS; j++) {
                GRect r1 = new GRect(
                        offset_x + (BOX_SIZE + BOX_SPACING) * i,
                        offset_y + (BOX_SIZE + BOX_SPACING) * j,
                        BOX_SIZE,
                        BOX_SIZE
                );
                r1.setColor(Color.BLACK);
                r1.setFilled(true);
                add(r1);
            }
        }
    }
}
