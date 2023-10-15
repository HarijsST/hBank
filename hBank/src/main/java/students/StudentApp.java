package students;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        StudentRepository students = new StudentRepository("Jānis", "Kļava", 18, "Biology");

        StudentRepository students2 = new StudentRepository();

        StudentRepository students3 = new StudentRepository("Inese", "Saule", 31, "Medic");

        List<String> studentList = new ArrayList<>();
        studentList.add(String.valueOf(students));
        studentList.add(String.valueOf(students2));
        studentList.add(String.valueOf(students3));

        for(String ss : studentList){
            System.out.println(ss);
        }
    }
}
