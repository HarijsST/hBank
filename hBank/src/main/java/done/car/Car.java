package done.car;

import java.util.Objects;

public class Car {

    public static String brand = "Volvo";

    private static int carsCreated = 0;

    public static int getCarsCreated() {
        return carsCreated;
    }

    public String color = "Red";

    public int wheels = 4;

    public Car(String color) {
        this.color = color;
        System.out.println("Esam konstruktorā: " + color);
        carsCreated = carsCreated + 1;
    }

    public Car() {
        System.out.println("Esam konstruktorā: " + color);
        carsCreated = carsCreated + 1;
    }

    public Car(CarTypes carTypes) {
        System.out.println(carTypes);
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String newBrand) {
        brand = newBrand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheels == car.wheels && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, wheels);
    }

    public enum CarTypes {
        VOLVO,
        MAZDA,
        BMW;
    }
}
