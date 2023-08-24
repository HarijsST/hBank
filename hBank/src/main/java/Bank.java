import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Bank {

    static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        String action = "";
        System.out.println("Sveicināti HBank!");
        int select;
        boolean isRunning = true; //Mainīgā nosaukums(!) takeInput, isRunning
        Scanner sc = new Scanner(System.in);
        while (isRunning) {
            menu(action);
            select = sc.nextInt(); // šeit būs select ievade
            switch (select) {
                case 1:
                    System.out.println("Jūs izvēlējāties \"Izveidot jaunu klientu\"");
                    newUser();
                    break;
                case 2:
                    System.out.println("Pievienot klientam jaunu kontu");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    break;
                case 3:
                    System.out.println("Izvadīt visus klientus");
                    printAllCustomers();
                    break;
                case 4:
                    System.out.println("Izvadīt visus klienta kontus");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    break;
                case 5:
                    System.out.println("Nomainīt klienta datus");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    break;
                case 6:
                    System.out.println("Nomainīt klienta konta datus");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    break;
                case 7:
                    System.out.println("Izdzēst klientu");
                    deleteCustomer();
                    break;
                case 8:
                    System.out.println("Izdzēst klienta kontu");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    break;
                case 9:
                    System.out.println("Jūs izvēlējāties pārtraukt darbu - paldies un uz redzēšanos!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Ievadītā izvēlne nepastāv.");
                    isRunning = true;
            }
        }
    }

    public static void newUser() {
        Scanner sc = new Scanner(System.in);
        Customer person = new Customer();
        System.out.println("Ievadiet klienta vārdu:");
        String name = sc.next();
        String nameF = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        person.setName(nameF);

        System.out.println("Ievadiet klienta uzvārdu:");
        String surname = sc.next();
        String surnameF = surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
        person.setSurname(surnameF);

        System.out.println("Ievadiet klienta adresi:");
        Scanner sci = new Scanner(System.in); // Nesapratu kādēļ šeit vajag vēl vienu Scanneri veidot
        String address = sci.nextLine();
        person.setAddress(address);

        System.out.println("Ievadiet klienta personas kodu:");
        Scanner scan = new Scanner(System.in);
        boolean pc = true;
        String personalCode = "";
        while (pc) {
            personalCode = scan.nextLine();
            if (!personalCode.matches("[0-9]+")) {
                System.out.println("Personas kods ievadīts nekorekti \n" + "Lūdzu ievadīt personas kodu");
                continue;
            }
            pc = false;
        }
        String personalCodeF = personalCode.substring(0, 6) + "-" + personalCode.substring(6, 11);
        person.setPersonalCode(personalCodeF);

        customers.add(person);

        System.out.println("Klienta vārds uzvārds: " + person.getName() + " " + person.getSurname());
        System.out.println("Klienta adrese: " + person.getAddress());
        System.out.println("Klienta personas kods: " + person.getPersonalCode());

        System.out.println("Paldies! Jauns klients izveidots.");
    }

    private static void printAllCustomers() {
        for (Customer customer : customers) {
            System.out.println("Klienta vārds uzvārds: " + customer.getName() + " " + customer.getSurname());
            System.out.println("Klienta adrese: " + customer.getAddress());
            System.out.println("Klienta personas kods: " + customer.getPersonalCode());
        }
    }

    private static void deleteCustomer() {
        Scanner sc2 = new Scanner(System.in);
        boolean takeInput = true;
        while (takeInput) {
            System.out.println("Ievadīt kritēriju pēc kura vēlaties dzēst klientu. \n" + "1. Pēc vārda \n" + "2. Pēc uzvārda \n" + "3. Pēc adreses \n" + "4. Pēc personas koda \n" + "5. Atgriezties uz sākumu");
            int criterion = sc2.nextInt();
            switch (criterion) {
                case 1:
                    System.out.println("Ievadīt klienta vārdu");
                    Scanner sc3 = new Scanner(System.in);
                    String inputName = sc3.nextLine();
                    Customer custToDelete = null;
                    for(Customer customer:customers){
                        if(customer.getName().equals(inputName))
                            custToDelete = customer;
                    }

                    if(custToDelete==null)
                        System.out.println("Šāds klients netika atrasts");
                    else
                        customers.remove(custToDelete);
                    System.out.println("Klients ir izdzēsts");
                    break;
                case 2:
                    System.out.println("Ievadīt klienta uzvārdu");
                    Scanner sc4 = new Scanner(System.in);
                    String inputSurname = sc4.nextLine();
                    for (Customer customer : customers) {
                        if (customer.getSurname().equals(inputSurname)) {
                            customers.remove(customer.getName());
                            customers.remove(customer.getSurname());
                            customers.remove(customer.getAddress());
                            customers.remove(customer.getPersonalCode());
                            System.out.println(customers);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ievadīt klienta adresi");
                    Scanner sc5 = new Scanner(System.in);
                    String inputAddress = sc5.nextLine();
                    for (Customer customer : customers) {
                        if (customer.getAddress().equals(inputAddress)) {


                            System.out.println(customers);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ievadīt klienta personas kodu");
                    Scanner sc6 = new Scanner(System.in);
                    String inputPersonalCode = sc6.nextLine();
                    for (Customer customer : customers) {
                        if (customer.getPersonalCode().equals(inputPersonalCode)) {
                            customers.remove(customer.getName());
                            customers.remove(customer.getSurname());
                            customers.remove(customer.getAddress());
                            customers.remove(customer.getPersonalCode());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Atgriezties uz sākumu");
                    takeInput = false;
                default:
                    System.out.println("Ievadītais kritērijs nepastāv.");
            }
        }
    }

    public static void menu(String action){
       action = "Izvēlaties darbību:\n" +
                "1. Izveidot jaunu klientu\n" +
                "2. Pievienot klientam jaunu kontu\n" +
                "3. Izvadīt visus klientus\n" +
                "4. Izvadīt visus klienta kontus\n" +
                "5. Nomainīt klienta datus\n" +
                "6. Nomainīt klienta konta datus\n" +
                "7. Izdzēst klientu\n" +
                "8. Izdzēst klienta konta\n" +
                "9. Pārtraukt darbu";
        System.out.println(action);
    }
}