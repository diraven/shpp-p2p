package com.shpp.p2p.cs.pavlenko.assignment1;

public class Assignment1Part4 extends MyKarel {

    /*
    Specifies if current cell should be white (true) or black (false).
     */
    private boolean isWhite = false;
    /*
    Specifies if current movement direction is left-to-right (true) or right-to-left (false)
     */
    private boolean isRtl = true;

    public void run() throws Exception {
        processLine();
        while (moveToNextLine()) {
            processLine();
        }
    }

    /*
    Sets either black (1 beeper) or white (no beeper) color to the cell Karel is in.
     */
    private void setColor() throws Exception {
        gatherAllBeepers();
        if (!isWhite) {
            putBeeper();
        }
    }

    /*
    Traverse the line and put beepers where necessary.
     */
    private void processLine() throws Exception {
        while (!frontIsBlocked()) {
            setColor();
            isWhite = !isWhite;
            move();
        }
        setColor();
    }

    /*
    Traverse to the next line available.

    @return true on success and false otherwise.
     */
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
