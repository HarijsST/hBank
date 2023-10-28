package carWerhouse;

public class Subaru extends CarModel {
    public Subaru(String brand, String model, int year, String type, String carCountry) {
        super(brand, model, year, type, carCountry);
    }

    @Override
    public void specification() {
        System.out.println(getBrand() + " " + getModel() + " " + getYear() + " " + getType() + " " + getCarCountry());
        System.out.println("Automašīna aprīkota ar " + engine.toString() + " motoru");
    }

    @Override
    public void insertEngine() {
        this.engine = new SubaruEngine();

    }
}
