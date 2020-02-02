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
        boolean beeperFound = beepersPresent();
        restartLine();
        return beeperFound;
    }

    private void restartLine() throws Exception {
        turnAround();
        moveUntilObstacle();
        turnAround();
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
