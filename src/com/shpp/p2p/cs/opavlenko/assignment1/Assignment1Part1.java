package com.shpp.p2p.cs.opavlenko.assignment1;

public class Assignment1Part1 extends MyKarel {

    public void run() throws Exception {
        goToNewspaper();
        pickNewspaper();
        goToStart();
    }

    private void goToNewspaper() throws Exception {
        turnRight();
        move();
        turnLeft();
        moveUntilObstacleOrBeeper();
    }

    private void pickNewspaper() throws Exception {
        pickBeeper();
    }

    private void goToStart() throws Exception {
        turnAround();
        moveUntilObstacle();
        turnRight();
        moveUntilObstacle();
        turnRight();
    }
}
