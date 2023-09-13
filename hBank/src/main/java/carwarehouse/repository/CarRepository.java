package carwarehouse.repository;

import carwarehouse.model.CarModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRepository {

    private final List<CarModel> carModels = new ArrayList<>(); //Datubāzes simulācija

    public CarRepository() {
        carModels.add(new CarModel(1, "Volvo", "XC90", "Red", "2023", "SUV"));
        carModels.add(new CarModel(2, "Volvo", "XC90", "Red", "2023", "SUV"));
        carModels.add(new CarModel(3, "Volvo", "XC90", "Red", "2023", "SUV"));
        carModels.add(new CarModel(4, "Volvo", "XC90", "Red", "2023", "SUV"));
        carModels.add(new CarModel(5, "Volvo", "XC90", "Red", "2023", "SUV"));
        carModels.add(new CarModel(6, "Volvo", "XC90", "Red", "2023", "SUV"));
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
