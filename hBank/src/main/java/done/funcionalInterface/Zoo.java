package done.funcionalInterface;

import done.car.Car;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Zoo {



    public static void main(String[] args) {
        Consumer<String> consumer = (name) -> System.out.println(name);

        // Sintakse -   objekts::metode
        //              klase::metode
        Consumer<String> consumerWithMethodReference = System.out::println;

        Consumer<Supplier<String>> supplierConsumer = (supplier) -> System.out.println(supplier.get());

        Function<String, Car> carSupplier = (color) -> new Car(color);
        Car car = carSupplier.apply("Blue");
        System.out.println(car);

        Supplier<String> carColorSupplier = car::getColor;

        consumer.accept("Hello world");
        consumer.accept("asdsad");
        consumer.accept("1");

        Supplier<String> supplier = () -> {
            int i = new Random().nextInt(99);
            return "John" + i;
        };

        consumer.accept(supplier.get());
        consumer.accept(supplier.get());
        consumer.accept(supplier.get());

        supplierConsumer.accept(supplier);
        supplierConsumer.accept(supplier);
        supplierConsumer.accept(supplier);

        Function<Integer, Integer> increment = (someNumber) -> someNumber + 1;
        System.out.println(increment.apply(5));
        System.out.println(increment.apply(10));
        System.out.println(increment.apply(15));

        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a+b;
        System.out.println(sum.apply(5, 5));
        System.out.println(sum.apply(10, 5));
        System.out.println(sum.apply(15, 3));

//        HasSound cat = new Cat();
//        HasSound dog = new Dog();
//        cat.doSound();
//        dog.doSound();
//        HasSound camel = () -> System.out.println("Came spits loudly");
//        HasSound chimp = () -> System.out.println("Shashhsdasj!");
//
//        camel.doSound();
//        chimp.doSound();

        // Kas ir lambda??
        // Tā ir metode :)
        // Ja anonīma klase ir klase metodē
        // Tad lambda ir metode metodē
        // Sintakse
        // (parametri) -> {kods}
        // piemērs

        // void sleep();
        // () -> System.out.prinln("Sleeping") //

        // String getName()
        // () -> "John";        Lambda // Supplier / Piegādātājs

        // void setName(String name)
        // (String name) -> System.out.prinln(name); //Consumer // Patērētājs

        // String addPrefix(String originalName)
        // (originalName) -> "Mr.".concat(originalName) // Funkcija

    }
}
