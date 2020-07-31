package lesson.events.examples;

import arachne.lib.scheduler.ScheduledDoubleSource;
import arachne.lib.scheduler.ScheduledSignal;
import arachne.lib.systems.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class ScheduledSourceSubsystem extends Subsystem {
    @Override
    protected void initialize() {
        Joystick joystick = new Joystick(0);

        // Double source
        ScheduledDoubleSource source = new ScheduledDoubleSource(0, joystick::getX);
        addBinding(source);
        source.attach(System.out::println);

        // Equivalent code
        addBinding(new ScheduledDoubleSource(0, joystick::getX))
        .attach(System.out::println);

        XboxController controller = new XboxController(1);

        // Signal
        addBinding(new ScheduledSignal(controller::getAButton))
        .attach(() -> { /* Start some sequence */ });
    }
}