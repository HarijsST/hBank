package students;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository extends StudentsBio{

    StudentRepository(String name, String surname, int age, String specialty){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.specialty = specialty;
    }

    StudentRepository(){
        this.name = "Mārtiņš";
        this.surname = "Balodis";
        this.age = 21;
        this.specialty = "Math";
    }

    public void display(){
        System.out.println("Vārds uzvārds: " + name +  " " + surname + "\n" + "Vecums: " + age + "\n" + "Specialitāte: " + specialty);
    }


    public StudentRepository(List<String> stu){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.specialty = specialty;
    }


}
