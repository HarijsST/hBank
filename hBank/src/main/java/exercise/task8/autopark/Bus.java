package exercise.task8.autopark;

import java.util.Objects;

public class Bus extends Car{
    public Bus(String color, int year, String make, String model) {
        super(color, year, make, model);
    }
    int passengerCount;

    public Bus(String color, int year, String make, String model, int passengerCount) {
        super(color, year, make, model);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", year='" + getYear() + '\'' +
                ", manufacturer='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", passangerCount=" + passengerCount +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengerCount == bus.passengerCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCount);
    }
}