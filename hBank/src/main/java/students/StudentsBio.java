package students;

public abstract class StudentsBio {
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

    @Override
    public String toString() {
        return "StudentsBio{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", specialty='" + getSpecialty() + '\'' +
                '}';
    }
}
