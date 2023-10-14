package done.persons;

import java.util.ArrayList;
import java.util.List;

public class PersonApp {
    public static void main(String[] args) {
        PersonRepository repository = new PersonRepository();
        System.out.println(repository.getName());
        System.out.println(repository.getCarNames());
        System.out.println(repository.getFirstCarName());

        PersonRepository repository2 = new PersonRepository("Jimmy");
        System.out.println(repository2.getName());
        System.out.println(repository2.getCarNames());
        System.out.println(repository2.getFirstCarName());

        List<String> carNames = new ArrayList<>();
        carNames.add("BMW");
        carNames.add("Mazda");
        PersonRepository repository3 = new PersonRepository(carNames);
        System.out.println(repository3.getCarNames());
    }
}
