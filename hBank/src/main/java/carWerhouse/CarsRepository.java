package carWerhouse;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarsRepository  {
    private final List<CarModel> carList = new ArrayList<>();
    public CarsRepository(){
        carList.add(new Bmw("BMW", "745", 2004, "Sedan", "Germany"));
        carList.add(new Subaru("Subaru", "XV", 2020, "SUV", "Japan"));
        carList.add(new Volvo("Volvo", "XC60", 2024, "SUV", "Sweden"));
    }

    public String listToFile() throws IOException {
        FileWriter fileWriter = new FileWriter("D:/file.txt");
        for (CarModel cars : getCarList()) {
            fileWriter.write(cars.getBrand() + " " + cars.getModel() + " " + cars.getYear() + " " + cars.getType() + " " + cars.getCarCountry() + " " + cars.getEngine() + System.lineSeparator());
        }
        fileWriter.close();
        return "Successfuly complate";
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

    public String deleteAllCars(){
        carList.clear();
        return "List is clear";
    }

    public CarModel deleteCarByIndex(int index){
        CarModel car = getCarByIndex(index);
        carList.remove(index);
        return car;
    }
    public String startEngine(int index){
        getCarByIndex(index).start();
        return "Engine is started";
    }
}