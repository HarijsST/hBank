package carWerhouse;

public abstract class CarModels {
    private String brand;
    private String model;
    private int year;
    private String type;
    private String carCountry;

    public CarModels(String brand, String model, int year, String type, String carCountry) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.type = type;
        this.carCountry = carCountry;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCarCountry() {
        return carCountry;
    }

    public void setCarCountry(String carsCountry) {
        this.carCountry = carCountry;
    }

    @Override
    public String toString() {
        return "CarModels{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", type='" + getType() + '\'' +
                ", carsCountry='" + getCarCountry() + '\'' +
                '}';
    }

    public abstract void specification();
}
