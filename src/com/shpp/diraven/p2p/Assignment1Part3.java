package com.shpp.diraven.p2p;

public class Assignment1Part3 extends MyKarel {

    public void run() throws Exception {
        int worldWidth = getWorldWidth();
        markCenter(worldWidth);
    }

    /*
    Walks the world from end to end and counts steps.

    @return steps taken.
     */
    private int getWorldWidth() throws Exception {
        int worldWidth = 1;
        while (!frontIsBlocked()) {
            move();
            worldWidth++;
        }
        turnAround();
        return worldWidth;
    }

    /*
    Go half the world and put beeper there. Put two beepers if world length is even.
     */
    private void markCenter(int worldWidth) throws Exception {
        for (int i = 0; i < worldWidth / 2; i++) {
            move();
        }
        putBeeper();
        if (worldWidth % 2 == 0) {
            turnAround();
            move();
            putBeeper();
        }
    }
}
