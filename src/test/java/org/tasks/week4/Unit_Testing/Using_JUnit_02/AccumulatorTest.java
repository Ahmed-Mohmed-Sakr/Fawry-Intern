package org.tasks.week4.Unit_Testing.Using_JUnit_02;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccumulatorTest {

    public AccumulatorTest() {
        System.out.println("AccumulatorTest()");
    }


    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach");
    }

    Accumulator accumulator = new Accumulator();

    @Test
    void testWithoutInitialValue() {
        int result = accumulator.accumulate(3);

        if (result != 3) {
            throw new RuntimeException("Test 1 failed");
        }
    }

    @Test
    void testWithInitialValue() {
        accumulator.accumulate(3);
        int result = accumulator.accumulate(4);

        if (result != 7) {
            throw new RuntimeException("Test 2 failed");
        }
    }

    @Test
    void testWithValueMoreThanMax() {
        accumulator.accumulate(3);
        accumulator.accumulate(4);
        int result = accumulator.accumulate(4);

        if (result != 1) {
            throw new RuntimeException("Test 3 failed, expected: " + 1 + " but actual: " + result);
        }
    }


}
