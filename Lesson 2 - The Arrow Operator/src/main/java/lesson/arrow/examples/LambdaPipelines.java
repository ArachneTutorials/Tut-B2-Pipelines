package lesson.arrow.examples;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import arachne.lib.io.GettableDouble;
import arachne.lib.io.SettableBoolean;
import arachne.lib.pipeline.DoublePipe;
import arachne.lib.pipeline.Pipe;
import edu.wpi.first.wpilibj.Solenoid;

public class LambdaPipelines {
    void setup() {

        DoublePipe doublePipe = new DoublePipe(0);
        Solenoid solenoid = new Solenoid(0);

        doublePipe
        .attachTranslator((value) -> value > 0 ? "Positive" : "Not positive")
        .attach(System.out::println);

        doublePipe
        .attachTranslatorToBoolean((value) -> value > 0)
        .attach(solenoid::set);

        solenoid.close();
    }

    @SuppressWarnings("unused")
    void examples() {
        Solenoid solenoid = new Solenoid(0);
        TalonFX motor = new TalonFX(0);

        GettableDouble gettable = () -> 4613;
        gettable.get();

        SettableBoolean settable = (value) -> solenoid.set(!value);
        settable.accept(false);

        Pipe<String> pipe = new Pipe<String>("");
        pipe.setFilter((value) -> value.length() > 0);
        pipe.setModifier((value) -> "Value: " + value);

        pipe
        .attachTranslatorToDouble((value) -> value.length())
        .attach((value) -> motor.set(ControlMode.PercentOutput, value / 10));

        solenoid.close();
    }
}
