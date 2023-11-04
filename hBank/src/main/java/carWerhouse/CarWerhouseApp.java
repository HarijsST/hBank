package carWerhouse;

import java.io.IOException;
import java.util.HashMap;

public class CarWerhouseApp {
    public static void main(String[] args) throws IOException {
        CarsRepository carsRepository = new CarsRepository();

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
        System.out.println(carsRepository.getCarList().get(carsRepository.getCarList().size()-1));
        System.out.println(carsRepository.getCarByIndex(1));
        System.out.println(carsRepository.getCarByIndex(5));
        System.out.println(carsRepository.addNewCar(bmw));
        System.out.println(carsRepository.updateCarModel(1, car));
        System.out.println(carsRepository.deleteCarByIndex(1));
        System.out.println(carsRepository.getCarList());*/

        System.out.println(carsRepository.startEngine(2));
        CarService carService = new CarService();
        System.out.println("---------------------------------------------------------------------------");
        String format = "%10s %10s %10s %10s %10s %20s";
        System.out.printf(format, "BRAND", "MODEL", "YEAR", "TYPE", "COUNTRY", "ENGINE" + "\n");
        System.out.println("---------------------------------------------------------------------------");
        carService.printAllCars(format, carsRepository);
    }
}
