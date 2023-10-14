package done.persons;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    private String name;

    private List<String> carNames = new ArrayList<>();

    public PersonRepository() {
        this.name = "Paul";
        carNames.add("Volvo");
        carNames.add("Žigulis");
    }

    public PersonRepository(String name) {
        this.name = name;
        carNames.add("Volvo");
        carNames.add("Žigulis");
    }

    public PersonRepository(List<String> carNames) {
        this.name = "Kaut kas";
        this.carNames = carNames;
    }

    public String getName() {
        return name;
    }

    public List<String> getCarNames() {
        return carNames;
    }

    public String getFirstCarName(){
        return carNames.get(0);
    }
}
