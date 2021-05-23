package lesson.pipelines.tasks;

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
    // Note: task2() cannot be tested without physical hardware.
    void run() {
        task1();
    }

    // --------------------
    // Tasks
    // --------------------

    // In the below function, create a DoublePipe, attach the "task1Verify" function to its output,
    // then feed the pipe a value of 4613.
    void task1() {
        // TODO Your code goes here
    }

    // In the lesson.pipelines.robot package, 2 new complex datatypes have been defined.
    //
    // The Intake datatype has 3 functions:
    //  - intake(boolean activate) starts or stops the intake based on a boolean parameter
    //  - getExtendIntakeOutput() returns a BooleanSource representing whether the intake solenoid should extend
    //  - getRollerOutput() returns a DoubleSource representing the percentage output that the roller should spin at
    //
    // The IntakeHardware datatype has 2 variables:
    //  - rollerMotor is a WPI_TalonFX representing the motor on the intake
    //  - extendIntakeSolenoid is a Solenoid representing a pneumatic actuator on the intake
    //
    // In the below function,
    //  1. Create an Intake and an IntakeHardware using constructors with no parameters.
    //  2. Attach the subsystem's sources to their correct hardware outputs, as if you were programming the bindings.
    void task2() {
        // TODO Your code goes here
    }

    // --------------------
    // Helper functions
    // Do not modify
    // --------------------

    void task1Verify(double input) {
        if(input == 4613) {
            System.out.println("Your input was correct.");
        }
        else {
            System.out.println("Your input was " + input + ", expected was 4613.");
        }
    }
}