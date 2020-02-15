package com.shpp.p2p.cs.opavlenko.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/*
Caterpillar.
*/
public class Assignment2Part6 extends WindowProgram {

    private static final int NUM_SEGMENTS = 5;
    //Segments horizontal offset.
    private static final double OFFSET_X = 0.6;
    //Segments vertical offset against each other.
    private static final double OFFSET_Y = 0.15;
    private static final int SEGMENT_WIDTH = 100;
    private static final int SEGMENT_HEIGHT = 100;
    //Offset for the whole caterpillar.
    private static final int GLOBAL_OFFSET_X = 20;
    private static final int GLOBAL_OFFSET_Y = 20;

    public void run() {
        // Alternating multiplier to offset each even segment.
        int APPLY_OFFSET = 1;

        for (int i = 0; i < NUM_SEGMENTS; i++) {
            GOval o1 = new GOval(
                    GLOBAL_OFFSET_X + (OFFSET_X * SEGMENT_WIDTH) * i,
                    GLOBAL_OFFSET_Y + (OFFSET_Y * SEGMENT_HEIGHT) * APPLY_OFFSET,
                    SEGMENT_WIDTH,
                    SEGMENT_HEIGHT);
            o1.setColor(Color.BLACK);
            o1.setFillColor(Color.GREEN);
            o1.setFilled(true);
            add(o1);

            APPLY_OFFSET = APPLY_OFFSET * -1;
        }
    }
}
