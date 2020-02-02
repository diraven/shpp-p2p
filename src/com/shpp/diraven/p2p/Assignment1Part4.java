package com.shpp.diraven.p2p;

public class Assignment1Part4 extends MyKarel {

    private boolean isWhite = false;
    private boolean isRtl = true;

    public void run() throws Exception {
        processLine();
        while (moveToNextLine()) {
            processLine();
        }
    }

    private void setColor() throws Exception {
        gatherAllBeepers();
        if (!isWhite) {
            putBeeper();
        }
    }

    private void processLine() throws Exception {
        while (!frontIsBlocked()) {
            setColor();
            isWhite = !isWhite;
            move();
        }
        setColor();
    }

    private boolean moveToNextLine() throws Exception {
        if (isRtl) {
            turnLeft();
        } else {
            turnRight();
        }
        if (frontIsBlocked()) {
            return false;
        }
        move();
        if (isRtl) {
            turnLeft();
        } else {
            turnRight();
        }
        isRtl = !isRtl;
        isWhite = !isWhite;
        return true;
    }

}
