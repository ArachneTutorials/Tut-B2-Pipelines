package lesson.arrow.tasks;

import java.util.function.BiFunction;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleUnaryOperator;

public class Tasks {
    // --------------------
    // Code to run your functions
    // --------------------

    // Main function to run your functions.
    // Do not modify.
    public static void main(String[] args) {
        new Tasks().run();
    }

    // Modify this method to test your functions.
    void run() {
        section1();
    }

    // --------------------
    // Tasks
    // --------------------

    void section1() {
        // Task 1
        // Modify the below call to the task1 function so that the lambda
        // returns double its input.
        task1((value) -> 0);

        // Task 2
        // Call the task2 function, and pass it a lambda function as a parameter
        // that takes two string inputs and returns the longer string.
        // If both strings are equal in length, return the first.

        // Task 3
        // Call the task3 function, and pass it a lambda function as a parameter
        // that takes no arguments and returns a random number from 13 to 46.
        // Hint: The Math.random() function returns a random number from 0 to 1.
    }

    // --------------------
    // Helper functions
    // Do not modify
    // --------------------

    void task1(DoubleUnaryOperator op) {
        for(int i = 0; i < 10; i++) {
            double v = Math.random() * 4613;
            printTest("Task 1 test " + (i + 1), op.applyAsDouble(v) == 2 * v);
        }
    }

    void task2(BiFunction<String, String, String> f) {
        printTest("Task 2 test 1", f.apply("short", "Long string").equals("Long string"));
        printTest("Task 2 test 2", f.apply("test", "").equals("test"));
        printTest("Task 2 test 2", f.apply("a", "b").equals("a"));
    }

    void task3(DoubleSupplier supplier) {
        double first = 0;

        for(int i = 0; i < 10; i++) {
            double v = supplier.getAsDouble();

            if(i == 0) first = v;

            printTest("Task 3 test " + (i + 1), v >= 13 && v <= 46 && (i == 0 || v != first));
        }
    }

    void printTest(String label, boolean result) {
        System.out.println(label + ": " + (result ? "success" : "failed"));
    }
}