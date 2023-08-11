package org.tasks.week4.Unit_Testing.Using_Runnable_Interface_01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TestRunner testRunner = new TestRunner();



        Runnable test1 = new Runnable() {
            @Override
            public void run() {
                Accumulator accumulator = new Accumulator();
                int result = accumulator.accumulate(3);

                if (result != 3) {
                    throw new RuntimeException("Test 1 failed");
                }
            }
        };




        testRunner.test("Test with no initial value", test1);

        testRunner.test("Test with no initial value repeated", test1);


        Runnable test2 = new Runnable() {
            @Override
            public void run() {
                Accumulator accumulator = new Accumulator();
                accumulator.accumulate(3);
                int result = accumulator.accumulate(4);

                if (result != 7) {
                    throw new RuntimeException("Test 2 failed");
                }
            }
        };

        testRunner.test("Test with initial value", test2);


        Runnable test3 = new Runnable() {
            @Override
            public void run() {
                Accumulator accumulator = new Accumulator();
                accumulator.accumulate(3);
                accumulator.accumulate(4);
                int result = accumulator.accumulate(4);

                if (result != 1) {
                    throw new RuntimeException("Test 3 failed, expected: " + 1 + " but actual: " + result);
                }
            }
        };

        testRunner.test("Test with value more than max", test3);


        testRunner.printSummary();

    }
}