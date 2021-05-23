package lesson.pipelines.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.Solenoid;

public class IntakeHardware {
    public WPI_TalonFX rollerMotor = new WPI_TalonFX(0);
	public Solenoid extendIntakeSolenoid = new Solenoid(0);
}
