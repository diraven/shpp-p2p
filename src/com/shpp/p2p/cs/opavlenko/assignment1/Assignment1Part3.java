package com.shpp.p2p.cs.opavlenko.assignment1;

public class Assignment1Part3 extends MyKarel {

    public void run() throws Exception {
        prepare();
        converge();
        cleanUp();
    }

    /*
    Puts two beepers on the edges of the world.
     */
    private void prepare() throws Exception {
        putBeeper();
        moveUntilObstacle();
        putBeeper();
        turnAround();
        move();
    }

    /*
    Moves beepers one by one until they meet in the center.
     */
    private void converge() throws Exception {
        while (!beepersPresent()) {
            moveBack();
            pickBeeper();
            move();
            putBeeper();
            move();
            moveUntilObstacleOrBeeper();
            turnAround();
            move();
        }
    }

    /*
    Removes extra beeper.
     */
    private void cleanUp() throws Exception {
        moveBack();
        pickBeeper();
    }
}
