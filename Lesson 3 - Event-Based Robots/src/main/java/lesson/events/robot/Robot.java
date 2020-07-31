package lesson.events.robot;

import arachne.lib.ArachneRobot;
import arachne.lib.game.GameState;
import arachne.lib.systems.Subsystem;

public class Robot extends ArachneRobot {
    public static void main(String[] args) {
        startRobot(Robot::new);
    }

    public EventSubsystem subsystem;

    @Override
    protected void initialize() {
        subsystem = Subsystem.create(EventSubsystem::new);
    }

    @Override
    protected void execute(GameState state) {
        subsystem.run();
    }
}
