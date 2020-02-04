package com.shpp.p2p.cs.opavlenko.assignment1;

public class Assignment1Part2 extends MyKarel {

    public void run() throws Exception {
        fill();
        while (frontIsClear()) {
            next();
            fill();
        }
    }

    /*
    Moves bot to the next column.
     */
    private void next() throws Exception {
        for (int i = 0; i < 4; i++) {
            move();
        }
    }

    /*
    Fills the line with beepers and returns Karel to the starting position on the line.
     */
    private void fill() throws Exception {
        turnLeft();
        while (frontIsClear()) {
            if (!beepersPresent()) {
                putBeeper();
            }
            move();
        }
        if (!beepersPresent()) {
            putBeeper();
        }
        turnAround();
        moveUntilObstacle();
        turnLeft();
    }
}
