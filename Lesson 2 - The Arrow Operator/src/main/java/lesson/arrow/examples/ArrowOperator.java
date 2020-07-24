package lesson.arrow.examples;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;

import arachne.lib.pipeline.DoublePipe;

public class ArrowOperator {

    DoubleBinaryOperator syntax = (param1, param2) -> param1 + param2;

    double add(double param1, double param2) {
        return param1 + param2;
    }

    DoubleBinaryOperator syntax2 = (double param1, double param2) -> param1 + param2;

    DoubleConsumer syntax3 = (value) -> System.out.println(value);

    DoubleSupplier syntax4 = () -> 4613;

    DoubleBinaryOperator syntax5 = (param1, param2) -> {
        double product = param1 * param2;
        double difference = param1 - param2;

        return product + difference;
    };

    DoublePipe pipe = new DoublePipe(0);

    void setup() {
        // Using ::
        pipe.setFilter(this::isPositive);

        // Using ->
        pipe.setFilter((value) -> value > 0);
    }

    boolean isPositive(double value) {
        return value > 0;
    }
}
