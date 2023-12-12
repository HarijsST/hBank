package carWerhouse;

import carWerhouse.models.cars.CarModel;

public class CarService {
    public void printAllCars(String format, CarsRepository repo){
        for(CarModel car : repo.getCarList()){
            System.out.printf(format, car.getBrand(), car.getModel(), car.getYear(), car.getType(), car.getCarCountry(), car.getEngine());
            System.out.println();
        }
    }
}
