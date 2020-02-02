package com.shpp.diraven.p2p;

public class Assignment1Part3 extends MyKarel {

    public void run() throws Exception {
        int worldWidth = getWorldWidth();
        markCenter(worldWidth);
    }

    private int getWorldWidth() throws Exception {
        int worldWidth = 1;
        while (!frontIsBlocked()) {
            move();
            worldWidth++;
        }
        turnAround();
        return worldWidth;
    }

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
