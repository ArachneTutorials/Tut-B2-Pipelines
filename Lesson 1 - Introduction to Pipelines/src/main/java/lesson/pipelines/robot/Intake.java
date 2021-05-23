package lesson.pipelines.robot;

import arachne.lib.pipeline.BooleanPipe;
import arachne.lib.pipeline.BooleanSource;
import arachne.lib.pipeline.DoublePipe;
import arachne.lib.pipeline.DoubleSource;
import arachne.lib.systems.Subsystem;

public class Intake extends Subsystem {
    private BooleanPipe extendIntake = new BooleanPipe(false);
	private DoublePipe roller = new DoublePipe(0);

    private static double ROLLER_SPEED = 0.8;

	public void intake(boolean activate) {
		if(activate) {
			extendIntake.accept(true);
			roller.accept(ROLLER_SPEED);
		}
		else {
			extendIntake.accept(false);
			roller.accept(0);
		}
	}

    public BooleanSource getExtendIntakeOutput() {
        return extendIntake;
    }

    public DoubleSource getRollerOutput() {
        return roller;
    }
}
