public class Bank {
    public static void main(String[] args) {
        Customer person = new Customer();
        person.setName("Jānis");
        person.setSurname("Bērziņš");
        person.setAddress("Brīvibas iela 53 - 13");

        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAddress());
    }
}
