package car;

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
        System.out.println("Klases brand:" +blueCar.getBrand());

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
    }
}
