package org.tasks.week4.Unit_Testing.Using_Runnable_Interface_01;

public class Accumulator {

    private int value = 0;
    private static final int max = 10;

    public int accumulate(int value) {
        this.value += value;
        if (this.value > max) {
            this.value %= max;
        }
        return this.value;
    }

}
