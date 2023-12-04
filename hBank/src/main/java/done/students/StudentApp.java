package done.students;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StudentApp {
    public static void main(String[] args) {
        List<Double> studentRatingList = List.of(3.5, 2.1, 1.3);
        List<Double> abc = new CopyOnWriteArrayList<>();
        StudentModel studentModel = new StudentModel("Janis", "Bērziņš", studentRatingList);

        List<Double> studentRatingList2 = new ArrayList<>();
        studentRatingList2.add(1.3);
        studentRatingList2.add(3.1);
        studentRatingList2.add(5.0);
        StudentModel studentModel2 = new StudentModel("Laila", "Sniedziņa", studentRatingList2);


        List<StudentModel> students = new ArrayList<>();
        students.add(studentModel);
        students.add(studentModel2);
        for(StudentModel studentModel1 : students){
            System.out.println(studentModel1.getName() + " " + studentModel1.getSurname());
            System.out.println(studentModel1.avgRating());
        }
    }
}
