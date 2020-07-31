package lesson.events.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import arachne.lib.immutables.DoublePair;
import arachne.lib.pipeline.BooleanPipe;
import arachne.lib.pipeline.DoublePipe;
import arachne.lib.scheduler.ScheduledBooleanSource;
import arachne.lib.scheduler.ScheduledSource;
import arachne.lib.systems.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class EventSubsystem extends Subsystem {
    // --------------------
    // Hardware
    // --------------------

    // Task 1: Create hardware variables
    // - Xbox controller in port 0 for input
    // - Talon SRXs with IDs 0 to 5 for drive motors (left side has IDs 0, 2, 4)
    // - Victor SPX with ID 1 for the intake motor
    // - Solenoid in port 6 for grabber

    // --------------------
    // Pipelines
    // --------------------

    // Task 2: Create output pipelines for the system
    // Do not attach the pipelines
    // - Left and right outputs for the drivetrain
    // - Output for the intake motor
    // - Output for the grabber

    // --------------------
    // Input functions
    // --------------------

    // Task 3: Create functions to handle instructions to the system
    // These should take a value from which we determine what values to send to output pipes
    void drive(DoublePair linearAndRotate) {
        double linear = linearAndRotate.getFirst();
        double rotate = linearAndRotate.getSecond();

        // TODO Pass values to left and right output pipes
    }

    void intake(boolean activate) {
        // Start/stop intake
        // Extend/retract grabber
    }

    void outtake(boolean activate) {
        // Start/stop intake
    }

    // --------------------
    // Initialization and binding
    // --------------------

    // Task 4: In the below function, set up the hardware
    // Each side of the drivetrain should be slaved to a single motor
    // The right side of the drivetrain should be inverted so positive motor speeds drive forwards
    void initializeHardware() {

    }

    // Task 5: Attach pipelines
    void initializeHardwareBindings() {
        // Task 5.1: Inputs
        // Use ScheduledSources to attach controller buttons and axes to input functions
        // Note: The value to pass to drive() is tricky, use new DoublePair(first, second) to initialise a value

        // Task 5.2: Outputs
        // Attach outputs from pipes to motors and solenoids
    }

    // --------------------
    // Subsystem code
    // Do not modify
    // --------------------
    @Override
    protected void initialize() {
        initializeHardware();
        initializeHardwareBindings();
    }
}
