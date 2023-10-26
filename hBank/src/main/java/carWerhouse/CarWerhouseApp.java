package carWerhouse;

public class CarWerhouseApp {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("BMW", "745", 2004, "Sedan", "Germany");
        Subaru subaru = new Subaru("Subaru", "XV", 2020, "SUV", "Japany");
        Volvo volvo = new Volvo("Volvo", "XC60", 2024, "SUV", "Japan");

        bmw.specification();
        subaru.specification();
        volvo.specification();
    }
}
