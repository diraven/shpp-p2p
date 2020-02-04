package com.shpp.p2p.cs.opavlenko.assignment1;

public class Assignment1Part4 extends MyKarel {

    public void run() throws Exception {
        // Assume starting position of the bot to be facing north to make it easier to check if next line is available.
        turnLeft();

        // Fill first line (it's always available, since bot is standing there).
        fill();

        // Repeat as long as next line is available.
        while (frontIsClear()) {
            // Go to the next line.
            next();

            // Shift bot's position by one cell.
            turnRight();
            cleanMove();
            turnLeft();

            // Fill the rest of the line.
            fill();

            // If one more line available - go to it and fill it.
            if (frontIsClear()) {
                next();
                fill();
            }
        }
    }

    /*
    Fills one line starting from the position bot is on, when finished - also resets bot to the starting position.
     */
    private void fill() throws Exception {
        // Put the first beeper.
        turnRight();
        putBeeper();

        // Put one beeper every 2 cells cleaning everything extra up as it goes.
        while (frontIsClear()) {
            cleanMove();
            if (frontIsClear()) {
                cleanMove();
                putBeeper();
            }
        }

        // Return bot to the starting position on the line.
        turnAround();
        moveUntilObstacle();
        turnRight();
    }

    /*
    Moves bot to the next line.
     */
    private void next() throws Exception {
        cleanMove();
    }
}
