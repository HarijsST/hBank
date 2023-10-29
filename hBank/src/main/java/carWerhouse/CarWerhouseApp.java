package carWerhouse;

import java.io.IOException;
import java.util.HashMap;

public class CarWerhouseApp {
    public static void main(String[] args) throws IOException {
        CarsRepository cr = new CarsRepository();

/*        CarModel car = new Bmw("BMW", "X6", 2023, "SUV", "Germany");
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
        System.out.println(cr.getCarList().get(cr.getCarList().size()-1));
        System.out.println(cr.getCarByIndex(1));
        System.out.println(cr.getCarByIndex(5));
        System.out.println(cr.addNewCar(bmw));
        System.out.println(cr.updateCarModel(1, car));
        System.out.println(cr.deleteCarByIndex(1));
        System.out.println(cr.getCarList());*/

        System.out.println(cr.startEngine(2));
        CarService cs = new CarService();
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%10s %10s %10s %10s %10s %10s", "BRAND", "MODEL", "YEAR", "TYPE", "COUNTRY", "ENGINE");
        System.out.println();
        System.out.println("------------------------------------------------------------------");
        cs.printAllCars("%10s %0s %10s %10s %10s %10s", new CarsRepository());
        cr.listToFile();
    }
}
