package collections;

import done.students.StudentModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

    private final static Map<String, Integer> codesMap = Map.of("LV", 371,
            "LT", 380);

    public static void main(String[] args) {
        //Atslega (key), vertiba (value)
        Map<String, String> vardnica = new HashMap<>();
        vardnica.put("kiegelis", "brick");
        vardnica.put("kurpes", "shoes");
        vardnica.put("kurpes", "shoes");
        vardnica.put("apavi", "shoes");

//        System.out.println(vardnica);
        System.out.println(vardnica.get("kiegelis"));
        System.out.println(vardnica.get("kurpes"));
        System.out.println(vardnica.get("brick"));
        System.out.println(vardnica.get("loremIpsum"));

        System.out.println(vardnica.size()); // 2
        System.out.println(vardnica.containsValue("brick"));

        System.out.println(vardnica.values()); // saraksts (list)
        System.out.println(vardnica.keySet()); // kopa (set)

        System.out.println(vardnica);

        for (String value : vardnica.values()) {
            System.out.println("Anglu tulkojums " + value);
        }

        for (String value : vardnica.keySet()) {
            System.out.println("Latviesu vards " + value);
        }

        for (Map.Entry<String, String> entry : vardnica.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<String, Integer> personalAges = new HashMap<>();
        personalAges.put("Igors", 33);
        personalAges.put("Anna", 44);
        System.out.println("\npersonalAges:");
        System.out.println(personalAges);

        Map<String, List<Double>> studentMarks = new HashMap<>();
        studentMarks.put("John", List.of(3.5, 3.8, 4.2)); // Tiek izdzests
        studentMarks.put("John", List.of(3.3, 3.0, 4.6)); // si bus pedeja veriba
        studentMarks.put("Sarah", List.of(4.5, 4.8, 5.2));
        System.out.println("\nstudentMarks:");
        System.out.println(studentMarks);

        //Sis nav labakais
        Map<StudentModel, List<Double>> studentMarkWithModelAsKey = new HashMap<>();
        studentMarkWithModelAsKey.put(new StudentModel(), List.of(3.5, 5.6, 5.4));
        StudentModel key = new StudentModel();
        studentMarkWithModelAsKey.put(key, key.getStudentRatingList());
        System.out.println("\nstudentMarkWithModelAsKey:");
        System.out.println(studentMarkWithModelAsKey);

        Map<String, StudentModel> studentsByNameMap = new HashMap<>();
        studentsByNameMap.put("Vitalijs", new StudentModel());
        studentsByNameMap.put("Ilona", new StudentModel());
        studentsByNameMap.put("Sanita", new StudentModel());

        System.out.println("\nstudentsByNameMap:");
        System.out.println(studentsByNameMap);
        System.out.println(studentsByNameMap.get("Vitalijs"));

        Map<Integer, StudentModel> studentsById = new HashMap<>();
        studentsById.put(1, new StudentModel());
        studentsById.put(2, new StudentModel());
        studentsById.put(3, new StudentModel());
        System.out.println("\nstudentsById:");
        System.out.println(studentsById);

        System.out.println(codesMap.get("LV"));
        System.out.println(codesMap.get("LV"));
    }

}
