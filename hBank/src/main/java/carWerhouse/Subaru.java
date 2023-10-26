package carWerhouse;

public class Subaru extends CarModels implements Engine{
    public Subaru(String brand, String model, int year, String type, String carCountry) {
        super(brand, model, year, type, carCountry);
    }

    @Override
    public void specification() {
        System.out.println(getBrand() + " " + getModel() + " " + getYear() + " " + getType() + " " + getCarCountry());
        System.out.println("Automašīna aprīkota ar " + insertEngine()+ " motoru");
    }


    @Override
    public String insertEngine() {
        return getSubaruEngine();
    }
}
