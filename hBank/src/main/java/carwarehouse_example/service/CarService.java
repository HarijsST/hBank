package carwarehouse_example.service;

import carwarehouse_example.model.CarModel;
import carwarehouse_example.repository.CarRepository;

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
    public CarModel getCarById(long id) {
        return carRepository.getCarById(id);
    }


    //updateCarBrandByCarId (Update)
    // Finds a car by ID and changes the cars brand
}
