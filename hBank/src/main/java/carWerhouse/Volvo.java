package carWerhouse;

public class Volvo extends CarModels implements Engine{
    public Volvo(String brand, String model, int year, String type, String carCountry) {
        super(brand, model, year, type, carCountry);
    }

    @Override
    public void specification() {
        System.out.println(getBrand() + " " + getModel() + " " + getYear() + " " + getType() + " " + getCarCountry());
        System.out.println("Automašīna aprīkota ar " + insertEngine()+ " motoru");
    }

    @Override
    public String insertEngine() {
        return getVolvoEngine();
    }
}
