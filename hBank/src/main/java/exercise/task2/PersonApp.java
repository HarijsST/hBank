package exercise.task2;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("John", "Wick");
        Person secondPerson = new Person("James", "Bond");
        System.out.println("Hello, " + person.getName() + " " + person.getSurname() + "!");
        System.out.println("Hello, " + secondPerson.getName() + " " + secondPerson.getSurname() + "!");
    }
}
