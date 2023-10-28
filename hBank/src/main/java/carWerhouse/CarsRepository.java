package carWerhouse;

import java.util.ArrayList;
import java.util.List;

public class CarsRepository  {
    private final List<CarModel> carList = new ArrayList<>();
    public CarsRepository(){
        carList.add(new Bmw("BMW", "745", 2004, "Sedan", "Germany"));
        carList.add(new Subaru("Subaru", "XV", 2020, "SUV", "Japan"));
        carList.add(new Volvo("Volvo", "XC60", 2024, "SUV", "Sweden"));
    }

    public List<CarModel> getCarList() {
        return carList;
    }

    public CarModel getCarByIndex(int index){
        if(index >= 0 && index <= carList.size()){
            return carList.get(index);
        }
        System.out.println("Nepareizs index");
        return null;
    }
    public CarModel addNewCar(CarModel carModel){
        carList.add(carModel);
        return carModel;
    }
    public CarModel updateCarModel(int index, CarModel newCarModel){
        CarModel car = getCarByIndex(index);
        car.setYear(newCarModel.getYear());
        car.setModel(newCarModel.getModel());
        car.setType(newCarModel.getType());
        car.setCarCountry(newCarModel.getCarCountry());
        return car;
    }
    //TODO delete all cars and delete car by index
}