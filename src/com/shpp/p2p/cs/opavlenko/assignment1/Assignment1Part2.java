package com.shpp.p2p.cs.opavlenko.assignment1;

public class Assignment1Part2 extends MyKarel {

    public void run() throws Exception {
        fillLine();

        while (frontIsClear()) {
            for (int i = 0; i < 4; i++) {
                move();
            }
            fillLine();
        }
    }

    /*
    Fills the line with beepers and returns Karel to the starting position on the line.
     */
    private void fillLine() throws Exception {
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
