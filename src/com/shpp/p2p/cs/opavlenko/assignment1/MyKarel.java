package com.shpp.p2p.cs.opavlenko.assignment1;

import com.shpp.karel.KarelTheRobot;

public class MyKarel extends KarelTheRobot {

    /*
    Allows to turn left multiple times with just one call.
     */
    protected void turnLeftTimes(int times) throws Exception {
        for (int i = 0; i < times; i++) {
            turnLeft();
        }
    }

    protected void turnRight() throws Exception {
        turnLeftTimes(3);
    }

    protected void turnAround() throws Exception {
        turnLeftTimes(2);
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
}
