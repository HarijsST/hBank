package carWerhouse;

import java.util.HashMap;

public class CarWerhouseApp {
    public static void main(String[] args) {
        CarModel car = new Bmw("BMW", "X6", 2023, "SUV", "Germany");
        CarModel car2 = new Subaru("Subaru", "XV", 2020, "SUV", "Japan");
        CarModel car3 = new Volvo("Volvo", "XC60", 2024, "SUV", "Sweden");

        car.insertEngine();
        car2.insertEngine();
        car3.insertEngine();
        car.specification();
        car2.specification();
        car3.specification();

        Bmw bmw = new Bmw("BMW", "745", 2007, "Sedan", "Germany");
        bmw.insertEngine();
        bmw.specification();
        bmw.getEngine().start();
        System.out.println(bmw.getEngine().isStarted());
        CarsRepository cr = new CarsRepository();
        System.out.println(cr.getCarList().get(cr.getCarList().size()-1));
        System.out.println(cr.getCarByIndex(1));
        System.out.println(cr.getCarByIndex(5));
        System.out.println(cr.addNewCar(bmw));
        System.out.println(cr.updateCarModel(1, car));
        System.out.println(cr.getCarList());
    }
}
