package com.company;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Instant start = Instant.now();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 5000; i++) {
            s.append("A");
        }
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(timeElapsed);
    }


}

// Valid that the data type of input is Integer
/*
While (!input.hasNextInt( )) {
            input.nextLine( );
            System.out.print("Invalid integer; please enter an integer: ");
        }
 */