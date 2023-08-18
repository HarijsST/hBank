public class Bank {
    public static void main(String[] args) {
        Customer person = new Customer();
        person.name = "Jānis";
        person.surname = "Bērziņš";
        person.address = "Brīvības iela 56 - 13";
        System.out.println("Vārds: " + person.name);
        System.out.println("Uzvārds: " + person.surname);
        System.out.println("Adrese: " + person.address);
        System.out.println("Hi!");
    }
}
