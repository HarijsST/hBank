package carwarehouse.model;

import java.util.Objects;

public class CarModel {

    // id, brand, model, color, year, type (SUV, Carbriolet ...)

    private long id;

    private String brand;
    private String model;
    private String color;
    private String year;
    private String type;


    public CarModel(long id, String brand, String model, String color, String year, String type) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.type = type;
    }

    public long getId() {
        return id;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarModel carModel = (CarModel) o;
        return id == carModel.id && Objects.equals(brand, carModel.brand) && Objects.equals(model, carModel.model) && Objects.equals(color, carModel.color) && Objects.equals(year, carModel.year) && Objects.equals(type, carModel.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, color, year, type);
    }
}
