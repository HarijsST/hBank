public class Bank {
    public static void main(String[] args) {
        Customer person = new Customer();
        person.setName("Jānis");
        person.setSurname("Bērziņš");
        person.setAddress("Brīvibas iela 53 - 13");

        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAddress());

        Customer secondPerson = new Customer();
        person.setName("John");
        person.setSurname("Doe");
        person.setAddress("Milan street 1");
        System.out.println("Taisam konfliktu");
    }
}
