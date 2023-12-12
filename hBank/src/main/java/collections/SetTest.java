package collections;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {
        ArrayList<String> objects1 = new ArrayList<String>();
        ArrayList<String> objects2 = new ArrayList<>();
        ArrayList<String> objects3 = new ArrayList<>();
//        objects3 = new LinkedList<>();  //Nestrada, jo 2 konkretas implementcijas

        //Labak darit shadi ->
        List<String> strings = new ArrayList<>();
        strings = new LinkedList<>();

        // Set (Kopas)
        // Nevar but dublikati
        // Ja ir hashcode, varam izmantot hashset
        // Ir ligums - ja ir hashCode, jabut obligati equals
        Set<String> countries = new HashSet<>();
        countries.add("Latvia");
        countries.add("Latvia");
        countries.add("Germany");

        System.out.println("Latvia".hashCode());
        System.out.println("Latvia".hashCode());
        //Var but diviem dazhadiem objektiem vienads hashCode
        //Bet tas nenozime, ka tie ir vienadi
        // Objekti ir vienadi, kad tie ir vienadi ar equals!

        System.out.println(countries);

        for (String country : countries) {
            System.out.println("Hello " + country);
        }
        // Kopaam nav get metodes!
    }
}
