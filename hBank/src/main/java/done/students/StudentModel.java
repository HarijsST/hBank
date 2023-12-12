package done.students;

import java.util.ArrayList;
import java.util.List;

public class StudentModel {
    private String name;
    private String surname;

    private List<Double> studentRatingList;

    public StudentModel(String name, String surname, List<Double> studentRatingList) {
        this.name = name;
        this.surname = surname;
        this.studentRatingList = studentRatingList;
    }

    public StudentModel(){

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Double> getStudentRatingList() {
        return studentRatingList;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentRatingList=" + studentRatingList +
                '}';
    }

    public double avgRating(){
        double counter = 0;
        for(int i = 0; i < getStudentRatingList().size(); i++){
            counter = counter + getStudentRatingList().get(i);
        }
        return counter  / getStudentRatingList().size();
    }
}
