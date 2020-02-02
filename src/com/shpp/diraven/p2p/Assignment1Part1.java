package com.shpp.diraven.p2p;

public class Assignment1Part1 extends MyKarel {

    public void run() throws Exception {
        go_to_newspaper();
        pick_newspaper();
        go_to_start();
    }

    private void go_to_newspaper() throws Exception {
        turnRight();
        move();
        turnLeft();
        move_until_obstacle_or_beeper();
    }

    private void pick_newspaper() throws Exception {
        pickBeeper();
    }

    private void go_to_start() throws Exception {
        turnBack();
        move_until_obstacle();
        turnRight();
        move_until_obstacle();
        turnRight();
    }
}
