package students;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        StudentModel students = new StudentModel("Jānis", "Kļava", 18, "Biology");
        StudentModel students2 = new StudentModel("Mārtiņs", "Balodis", 21, "Math");
        StudentModel students3 = new StudentModel("Inese", "Saule", 31, "Medic");
        StudentModel students4 = new StudentModel();
        StudentModel students5 = new StudentModel();

        List<StudentModel> studentList = new ArrayList<>();
        studentList.add(students);
        studentList.add(students2);
        studentList.add(students3);
        studentList.add(students4);
        studentList.add(students5);


        for(StudentModel sm : studentList){
            System.out.println(sm.getName() + " " + sm.getSurname() + " " + sm.getAge() + " " + sm.getSpecialty());
        }
    }
}
