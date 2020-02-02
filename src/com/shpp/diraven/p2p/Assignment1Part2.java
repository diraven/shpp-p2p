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

    /*
    Checks if vertical line Karel is on has any beepers on it. Returns Karel to the start of the line after the
    check.

    @return true if beepers present on the line.
     */
    private boolean isLineHasBeepers() throws Exception {
        moveUntilObstacleOrBeeper();
        boolean beeperFound = beepersPresent();
        restartLine();
        return beeperFound;
    }

    /*
    Returns Karel to the original position at the start of the line.
     */
    private void restartLine() throws Exception {
        turnAround();
        moveUntilObstacle();
        turnAround();
    }

    /*
    Fills the line with beepers and returns Karel to the starting position on the line.
     */
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

    /*
    Moves Karel to the next line. Returns true on success and false otherwise.
     */
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
