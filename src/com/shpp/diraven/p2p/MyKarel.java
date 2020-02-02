package com.shpp.diraven.p2p;

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

    /*
    Keeps moving forward until there is an obstacle in front of Karel or beeper on the same cell as Karel.
     */
    protected void moveUntilObstacleOrBeeper() throws Exception {
        while (true) {
            if (!frontIsClear()) {
                break;
            }
            move();
            if (beepersPresent()) {
                break;
            }
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
