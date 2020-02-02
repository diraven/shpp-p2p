package com.shpp.diraven.p2p;

import com.shpp.karel.KarelTheRobot;

public class MyKarel extends KarelTheRobot {
    protected void turnLeftTimes(int times) throws Exception {
        for (int i = 0; i < times; i++) {
            turnLeft();
        }
    }

    protected void turnRight() throws Exception {
        turnLeftTimes(3);
    }

    protected void turnBack() throws Exception {
        turnLeftTimes(2);
    }

    protected void moveUntilObstacle() throws Exception {
        while (frontIsClear()) {
            move();
        }
    }

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
}
