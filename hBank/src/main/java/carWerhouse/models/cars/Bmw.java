package carWerhouse.models.cars;

import carWerhouse.models.engine.BmwEngine;

public class Bmw extends CarModel {

    public Bmw(String brand, String model, int year, String type, String carCountry) {
        super(brand, model, year, type, carCountry);
    }

    @Override
    public void specification() {
        System.out.println(getBrand() + " " + getModel() + " " + getYear() + " " + getType() + " " + getCarCountry());
        System.out.println("Automašīna aprīkota ar " + getEngine() + " motoru");
    }
    public void insertEngine(){
        this.engine = new BmwEngine();
    }
}