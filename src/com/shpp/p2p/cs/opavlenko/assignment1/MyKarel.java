package com.shpp.p2p.cs.opavlenko.assignment1;

import com.shpp.karel.KarelTheRobot;

public class MyKarel extends KarelTheRobot {

    protected void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    protected void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    protected void moveUntilObstacle() throws Exception {
        while (frontIsClear()) {
            move();
        }
    }

    protected void moveBack() throws Exception {
        turnAround();
        move();
        turnAround();
    }

    /*
    Keeps moving forward until there is an obstacle in front of Karel or beeper on the same cell as Karel.
     */
    protected void moveUntilObstacleOrBeeper() throws Exception {
        while (frontIsClear() && !beepersPresent()) {
            move();
        }
    }

    /*
    Collects all beepers from under the Karel.
     */
    protected void gatherAllBeepers() throws Exception {
        while (beepersPresent()) {
            pickBeeper();
        }
    }

    /*
    Collects all beepers while also moving.
     */
    protected void cleanMove() throws Exception {
        move();
        gatherAllBeepers();
    }
}
