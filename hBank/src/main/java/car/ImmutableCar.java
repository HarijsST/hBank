package car;

public class ImmutableCar {

    // 1. Visiem laukiem ir jābūt final -              Jā
    // 2. Nav pieejamu publisku set metožu -           Jā
    // 3. (Iet kopā ar pirmo) Kad veidojam objektu,    Jā
    // tad norādam visas vērtības
    // 4. Jānodrošina, ka visi izmantotie objekti      Nē!
    // arī ir nemainīgi!

    private final String name;

    private final Car car = new Car();

    public ImmutableCar(String name) {
        this.name = name;
    }

    public String getName() {
        return new String(name.toString());
    }

    public Car getCar() {
        return car;
    }
}
