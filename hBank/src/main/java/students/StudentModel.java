package students;

public class StudentModel {
    String name;
    String surname;
    int age;
    String specialty;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

    StudentModel(String name, String surname, int age, String specialty){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.specialty = specialty;
    }

    StudentModel(){
        this.name = "Vārds";
        this.surname = "Uzvārds";
        this.age = -1;
        this.specialty = "Specialitāte";
    }
}
