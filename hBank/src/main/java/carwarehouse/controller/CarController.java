package carwarehouse.controller;

import carwarehouse.model.CarModel;
import carwarehouse.service.CarService;

import java.util.List;

public class CarController {
    private final CarService carService = new CarService();

    public void printAllCars() {
        List<CarModel> allCars = carService.getAllCars();
        for (CarModel carModel : allCars) {
            System.out.println(carModel);
        }
        //Streams API
        //carService.getAllCars().forEach(System.out::println);
    }

    // printCarById metode šeit
    // CarModel car = carService.getCarById(id);
    // sout(car);
    public void printCarById(long id){
        CarModel car = carService.getCarById(id);
    }
}
