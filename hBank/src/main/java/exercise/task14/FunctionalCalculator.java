package exercise.task14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalCalculator {
    public static BiFunction<Double, Double, Double> sum(){
        return (a, b) -> a + b;
    }

    public static BiFunction<Double, Double, Double> subtract(){
        return (a, b) -> a - b;
    }

    public static BiFunction<Double, Double, Double> multiply(){
        return (a, b) -> a * b;
    }

    public static BiFunction<Double, Double, Double> divide(){
        return (a, b) -> a / b;
    }

    public static Function<Double, Double> square(){
        return (a) -> a * a;
    }
}
