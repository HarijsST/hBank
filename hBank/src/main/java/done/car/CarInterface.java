package done.car;

import java.util.Objects;

public class CarInterface {

    public static void main(String[] args) {
        String brand = Car.brand;
        String brand1 = Car.getBrand();

        Car whiteCar = new Car("white");
        Car.setBrand("Mazda");

        Car blueCar = new Car("blue");
        new Car("green");
        new Car("Yellow");
        new Car("Gold");
        new Car();


        Car.setBrand("Suzuki");

        System.out.println("Klases brand:" + whiteCar.getBrand());
        System.out.println("Klases brand:" + blueCar.getBrand());

//        car.setColor("White");
//        car2.setColor("Blue");

        whiteCar.getWheels(); // 4
        blueCar.getWheels(); //4

        whiteCar.setWheels(6);
        whiteCar.getWheels(); // 6
        blueCar.getWheels(); // 4

        Car.setBrand("Toyota");
        whiteCar.getBrand(); // Toyota
        blueCar.getBrand(); // Toyota

        System.out.println("1 auto krāsa: " + whiteCar.getColor());
        System.out.println("1 auto krāsa: " + blueCar.getColor());


        System.out.println("Cars created: " + Car.getCarsCreated());

        // Equals un ==

        System.out.println("----------    Equals un ==   -----------");
        int number1 = 1;
        int number2 = 2;
        System.out.println("Numbers are == " + (number1 == number2));

        String name1 = "age";
        String name2 = new String("age");
        String name3 = "age";
        String name4 = "a";
        String name5 = "ge";
        String name6 = name4 + name5;


        System.out.println(name1 == name2);
        System.out.println("name3 == name6 " + (name3 == name6));
        System.out.println("name3 = " + name3 + " name6 = " + name6);
        System.out.println(Objects.equals(name2, name1));
        System.out.println("age".equals(name3));


        Car mazda = new Car("Violet");
        Car bmw = new Car("Violet");
        System.out.println("mazda == bmw " + (mazda == bmw)); // Atmiņā tie ir 2 dažādi objekti - false
        System.out.println("(mazda.equals(bmw))) " + (mazda.equals(bmw))); // true


        ImmutableCar immutableCar = new ImmutableCar("Tesla");
        String immutableCarName = immutableCar.getName();
        System.out.println(immutableCarName);

        Car car = immutableCar.getCar();
        System.out.println(immutableCar.getCar().getColor());
        System.out.println(car.getColor());
        car.setColor("White");
        System.out.println(immutableCar.getCar().getColor());
        System.out.println(car.getColor());
    }
}
