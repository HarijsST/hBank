package carwarehouse.model;

import java.util.Objects;

public class CarModel {

    // id, brand, model, color, year, type (SUV, Carbriolet ...)

    private long id;

    private String brand;

    public CarModel(long id, String brand) {
        this.id = id;
        this.brand = brand;
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

    @Override
    public String toString() {
        return "CarModel{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarModel carModel = (CarModel) o;
        return id == carModel.id && Objects.equals(brand, carModel.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand);
    }
}
