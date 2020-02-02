package com.shpp.diraven.p2p;

public class Assignment1Part2 extends MyKarel {

    public void run() throws Exception {
        turnLeft();
        if (isLineHasBeepers()) {
            fillLine();
        }

        while (nextLine()) {
            if (isLineHasBeepers()) {
                fillLine();
            }
        }
    }

    private boolean isLineHasBeepers() throws Exception {
        moveUntilObstacleOrBeeper();
        boolean beeper_found = beepersPresent();
        restartLine();
        return beeper_found;
    }

    private void restartLine() throws Exception {
        turnBack();
        moveUntilObstacle();
        turnBack();
    }

    private void fillLine() throws Exception {
        while (frontIsClear()) {
            if (!beepersPresent()) {
                putBeeper();
            }
            move();
        }
        if (!beepersPresent()) {
            putBeeper();
        }
        restartLine();
    }

    private boolean nextLine() throws Exception {
        turnRight();
        if (frontIsBlocked()) {
            return false;
        }
        move();
        turnLeft();
        return true;
    }
}
