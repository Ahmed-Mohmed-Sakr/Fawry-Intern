package org.tasks.week4.Unit_Testing.Using_JUnit_02;

public class Accumulator {

    private int value = 0;
    private static int max = 10;

    public int accumulate(int value) {
        this.value += value;
        if (this.value > max) {
            this.value %= max;
        }
        return this.value;
    }

}
