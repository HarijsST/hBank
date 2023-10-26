package carWerhouse;

public class CarWerhouseApp {
    public static void main(String[] args) {
        CarModels car = new Bmw("BMW", "745", 2004, "Sedan", "Germany");
        CarModels car2 = new Subaru("Subaru", "XV", 2020, "SUV", "Japan");
        CarModels car3 = new Volvo("Volvo", "XC60", 2024, "SUV", "Japan");

        car.specification();
        car2.specification();
        car3.specification();
    }
}
