package carWerhouse;

import carWerhouse.models.cars.Bmw;
import carWerhouse.models.cars.CarModel;
import carWerhouse.models.cars.Subaru;
import carWerhouse.models.cars.Volvo;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarsRepository  {
    private final List<CarModel> carList = new ArrayList<>();
    public CarsRepository(){
        carList.add(new Bmw("BMW", "745", 2004, "Sedan", "Germany"));
        carList.add(new Subaru("Subaru", "XV", 2020, "SUV", "Japan"));
        carList.add(new Volvo("Volvo", "XC60", 2024, "SUV", "Sweden"));
    }

    public void listToFile() throws IOException {
        Path path = Path.of("hBank/src/main/resources/file.txt");
        FileWriter fileWriter = new FileWriter(path.toString());
        for (CarModel cars : getCarList()) {
            fileWriter.write(cars.getBrand() + " " + cars.getModel() + " " + cars.getYear() +
                    " " + cars.getType() + " " + cars.getCarCountry() + " " + cars.getEngine() + System.lineSeparator());
        }
        fileWriter.close();
    }

    public List<CarModel> fileToList() throws FileNotFoundException {
        File file = new File("hBank/src/main/resources/file.txt");
        Scanner scanner = new Scanner(file);
        List<CarModel> secondCarList = new ArrayList<>();
        while (scanner.hasNextLine()){
            String[] carDetails = scanner.nextLine().split(" ");
            CarModel carModel = switch (carDetails[0]) {
                case "BMW" ->
                        new Bmw(carDetails[0], carDetails[1], Integer.parseInt(carDetails[2]), carDetails[3], carDetails[4]);
                case "Subaru" ->
                        new Subaru(carDetails[0], carDetails[1], Integer.parseInt(carDetails[2]), carDetails[3], carDetails[4]);
                case "Volvo" ->
                        new Volvo(carDetails[0], carDetails[1], Integer.parseInt(carDetails[2]), carDetails[3], carDetails[4]);
                default -> null;
            };
            secondCarList.add(carModel);
        }
        return secondCarList;
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
        return carList.remove(index);
    }
    public String startEngine(int index){
        getCarByIndex(index).start();
        return "Engine is started";
    }
}