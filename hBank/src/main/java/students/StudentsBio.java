package students;

public abstract class StudentsBio {
    String name;
    String surname;
    int age;
    String specialty;

    @Override
    public String toString() {
        return "StudentsBio{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
