package com.shpp.diraven.p2p;

public class Assignment1Part2 extends MyKarel {

    public void run() throws Exception {
        turnLeft();
        if (is_line_has_beepers()) {
            fill_line();
        }

        while (next_line()) {
            if (is_line_has_beepers()) {
                fill_line();
            }
        }
    }

    private boolean is_line_has_beepers() throws Exception {
        move_until_obstacle_or_beeper();
        boolean beeper_found = beepersPresent();
        restart_line();
        return beeper_found;
    }

    private void restart_line() throws Exception {
        turnBack();
        move_until_obstacle();
        turnBack();
    }

    private void fill_line() throws Exception {
        while (frontIsClear()) {
            if (!beepersPresent()) {
                putBeeper();
            }
            move();
        }
        if (!beepersPresent()) {
            putBeeper();
        }
        restart_line();
    }

    private boolean next_line() throws Exception {
        turnRight();
        if (frontIsBlocked()) {
            return false;
        }
        move();
        turnLeft();
        return true;
    }
}
