package carWerhouse;

public class CarService {
    public void printAllCars(String s, CarsRepository repo){
        for(CarModel cars : repo.getCarList()){
            System.out.format(cars.getBrand() + " " + cars.getModel() + " " + cars.getYear() + " " + cars.getType() + " " + cars.getCarCountry() + " " + cars.getEngine());
            System.out.println();
        }
    }
}
