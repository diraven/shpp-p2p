package com.shpp.p2p.cs.opavlenko.assignment2;

import com.shpp.cs.a.console.TextProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Square equation.
 */
public class Assignment2Part1 extends TextProgram {
    public void run() {
        int a, b, c;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            print("Please enter a: ");
            a = Integer.parseInt(reader.readLine());
            print("Please enter b: ");
            b = Integer.parseInt(reader.readLine());
            print("Please enter c: ");
            c = Integer.parseInt(reader.readLine());

            double d = b * b - 4 * a * c;
            if (d < 0) {
                print("There are no real roots");
            } else if (d == 0) {
                print("There is one root: ");
                println(-b / 2 * a);
            } else {
                print("There are two roots: :");
                print(-b - Math.sqrt(d) / 2 * a);
                print(", ");
                println(-b + Math.sqrt(d) / 2 * a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
