package com.shpp.diraven.p2p;

public class Assignment1Part4 extends MyKarel {

    private boolean is_white = false;
    private boolean is_rtl = true;

    public void run() throws Exception {
        processLine();
        while (moveToNextLine()) {
            processLine();
        }
    }

    private void setColor() throws Exception {
        gatherAllBeepers();
        if (!is_white) {
            putBeeper();
        }
    }

    private void processLine() throws Exception {
        while (!frontIsBlocked()) {
            setColor();
            is_white = !is_white;
            move();
        }
        setColor();
    }

    private boolean moveToNextLine() throws Exception {
        if (is_rtl) {
            turnLeft();
        } else {
            turnRight();
        }
        if (frontIsBlocked()) {
            return false;
        }
        move();
        if (is_rtl) {
            turnLeft();
        } else {
            turnRight();
        }
        is_rtl = !is_rtl;
        is_white = !is_white;
        return true;
    }

}
