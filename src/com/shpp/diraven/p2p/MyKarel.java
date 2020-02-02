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

    protected void move_until_obstacle() throws Exception {
        while (frontIsClear()) {
            move();
        }
    }

    protected void move_until_beeper() throws Exception {
        do {
            move();
        } while (!beepersPresent());
    }
}
