package lesson.events.examples;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import arachne.lib.listeners.Signal;
import arachne.lib.pipeline.BooleanPipe;
import arachne.lib.pipeline.DoublePipe;
import arachne.lib.pipeline.Pipe;

public class ListenersAndSignals {
    void listeners() {
        DoublePipe number = new DoublePipe(0);

        number.attachListener(
            (oldValue, newValue) ->
                System.out.println(newValue > oldValue ? "Increased" : "Decreased")
        );

        number.accept(46);
        number.accept(13);
    }

    void signals() {
        // Basic signal
        Signal signal = new Signal();
        signal.attach(() -> System.out.println("Signal fired"));
        signal.fire();

        // Signal to pipe
        TalonFX motor = new TalonFX(0);

        signal
        .asDoubleSource(0.4613)
        .attach((speed) -> motor.set(ControlMode.PercentOutput, speed));

        // Pipe to signal
        Pipe<String> message = new Pipe<String>("");
        message.toSignalIf((value) -> true);
        message.toSignalIf((oldValue, newValue) -> true);

        BooleanPipe booleanPipe = new BooleanPipe(false);
        booleanPipe.toSignal();
    }
}
