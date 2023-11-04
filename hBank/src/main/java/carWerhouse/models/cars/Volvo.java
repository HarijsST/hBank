package carWerhouse.models.cars;

import carWerhouse.models.engine.VolvoEngine;

public class Volvo extends CarModel {
    public Volvo(String brand, String model, int year, String type, String carCountry) {
        super(brand, model, year, type, carCountry);
    }

    @Override
    public void specification() {
        System.out.println(getBrand() + " " + getModel() + " " + getYear() + " " + getType() + " " + getCarCountry());
        System.out.println("Automašīna aprīkota ar " + engine.toString() + " motoru");
    }

    @Override
    public void insertEngine() {
        this.engine = new VolvoEngine();
    }
}
