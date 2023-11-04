package carWerhouse.models.cars;

import carWerhouse.models.engine.Engine;

public abstract class CarModel {
    private final String brand;
    private String model;
    private int year;
    private String type;
    private String carCountry;
    protected Engine engine;
    public CarModel(String brand, String model, int year, String type, String carCountry) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.type = type;
        this.carCountry = carCountry;
        insertEngine();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCarCountry(String carCountry) {
        this.carCountry = carCountry;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }


    public String getType() {
        return type;
    }


    public String getCarCountry() {
        return carCountry;
    }
    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return getBrand() + ' ' +
                getModel() + ' ' +
                getYear() + ' ' +
                getType() + ' ' +
                getCarCountry() + ' ' +
                getEngine();
    }

    public abstract void specification();
    public abstract void insertEngine();

    public boolean start(){
        getEngine().start();
        return true;
    }
}
