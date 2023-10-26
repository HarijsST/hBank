package carwarehouse_example.repository;

import carwarehouse_example.model.CarModel;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private final List<CarModel> carModels = new ArrayList<>(); //Datubāzes simulācija

    public CarRepository() {
        carModels.add(new CarModel(1, "Cars", "XC90", "Red", "2023", "SUV"));
        carModels.add(new CarModel(2, "Cars", "XC90", "Red", "2023", "SUV"));
        carModels.add(new CarModel(3, "Cars", "XC90", "Red", "2023", "SUV"));
        carModels.add(new CarModel(4, "Cars", "XC90", "Red", "2023", "SUV"));
        carModels.add(new CarModel(5, "Cars", "XC90", "Red", "2023", "SUV"));
        carModels.add(new CarModel(6, "Cars", "XC90", "Red", "2023", "SUV"));
    }

    public List<CarModel> getAllCars() {
        return carModels;
    }

    public void deleteAllCars() {
        carModels.clear();
    }

    public CarModel getCarById(long id) {
        //Streams API - filter, map, colletors, orElseThrow, orElse
        return carModels.stream()
                .filter(carModel -> id == carModel.getId())
                .findAny()
                .orElse(null);
    }
}
