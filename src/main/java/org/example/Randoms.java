package org.example;

import java.util.*;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();

    public int min;
    int max;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            int val;
            boolean isList = true;

            @Override
            public Integer next() {
                return val;
            }

            @Override
            public boolean hasNext() {
                if (min > max) throw new IllegalArgumentException("Invalid range");
                while (true) {
                    val = min + Math.abs(random.nextInt()) % (max - min + 1);
                    return true;
                }
            }

        };
    }
}