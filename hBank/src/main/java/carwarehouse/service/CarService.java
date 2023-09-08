package carwarehouse.service;

import carwarehouse.model.CarModel;
import carwarehouse.repository.CarRepository;

import java.util.List;

public class CarService {

    private CarRepository carRepository;

    public CarService() {
        this.carRepository = new CarRepository();
    }

    public List<CarModel> getAllCars() {
        return carRepository.getAllCars();
    }

    //getCarById (Read)

    //getCarsByBrand (Read)

    //addNewRandomCar (Create)

    //deleteCarById (Delete)

    //deleteAllCars (Repo
    public void deleteAllCars() {
        carRepository.deleteAllCars();
    }

    //updateCarBrandByCarId (Update)
    // Finds a car by ID and changes the cars brand
}
