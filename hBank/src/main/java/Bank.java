import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Sveicināti HBank!");
        int select;
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        while (isRunning) {
            printMenu();
            select = sc.nextInt();

            // Pārlikt uz String value = sc.nextLine()
            // Pārbaudīt vai tas ir skaitlis vai nē
            // Ja tas ir skaitlis - turpinam un uzliekam to vērtību uz mainīgo select
            // Ja tas nav skaitlis - tad šo select pārliekam uz tādu vērtību, kas aizietu uz default
            //Integer.parseInt("d");

            switch (select) {
                case 1 -> newUser();
                case 2 -> printSectionNotImplemented("Pievienot klientam jaunu kontu");
                case 3 -> printAllCustomers();
                case 4 -> printSectionNotImplemented("Izvadīt visus klienta kontus");
                case 5 -> printSectionNotImplemented("Nomainīt klienta datus");
                case 6 -> printSectionNotImplemented("Nomainīt klienta konta datus");
                case 7 -> deleteCustomer();
                case 8 -> printSectionNotImplemented("Izdzēst klienta kontu");
                case 9 -> {
                    System.out.println("Jūs izvēlējāties pārtraukt darbu - paldies un uz redzēšanos!");
                    isRunning = false;
                }
                default -> System.out.println("Ievadītā izvēlne nepastāv");
            }
        }
    }

    public static void newUser() {
        System.out.println("Jūs izvēlējāties \"Izveidot jaunu klientu\"");

        Scanner sc = new Scanner(System.in);
        Customer person = new Customer();

        System.out.println("Ievadiet klienta vārdu:");
        String name = sc.nextLine();
        String nameFormatted = getValueWithFirstCapitalLetter(name);
        person.setName(nameFormatted);

        System.out.println("Ievadiet klienta uzvārdu:");
        String surname = sc.nextLine();
        String surnameFormatted = getValueWithFirstCapitalLetter(surname);
        person.setSurname(surnameFormatted);

        System.out.println("Ievadiet klienta adresi:");
        String address = sc.nextLine();
        person.setAddress(address);

        System.out.println("Ievadiet klienta personas kodu:");
        String personalCode = sc.nextLine();
        validatePersonalCode(personalCode);
        person.setPersonalCode(personalCode);

        customers.add(person);

        System.out.println(person);
        System.out.println("Paldies! Jauns klients izveidots.");
    }

    private static String getValueWithFirstCapitalLetter(String value) {
        return value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
    }

    private static void printSectionNotImplemented(String message) {
        System.out.println(message);
        System.out.println("Sadaļa atrodas izstrādes stadijā");
    }

    private static void validatePersonalCode(String personalCode) {
        // Šo pagaidām noparkojam, vēlāk atgriezīsimies
//        boolean pc = true;
//        String personalCode = "";
//        while (pc) {
//            personalCode = scan.nextLine();
//            if (!personalCode.matches("[0-9]+")) {
//                System.out.println("Personas kods ievadīts nekorekti \n" + "Lūdzu ievadīt personas kodu");
//                continue;
//            }
//            pc = false;
//        }
//        String personalCodeF = personalCode.substring(0, 6) + "-" + personalCode.substring(6, 11);
    }

    private static void printAllCustomers() {
        System.out.println("Izvadīt visus klientus");
        for (Customer customer : customers) {
            System.out.println("Klienta vārds uzvārds: " + customer.getName() + " " + customer.getSurname());
            System.out.println("Klienta adrese: " + customer.getAddress());
            System.out.println("Klienta personas kods: " + customer.getPersonalCode());
        }
    }

    private static void deleteCustomer() {
        System.out.println("Izdzēst klientu");
        Scanner sc2 = new Scanner(System.in);
        boolean takeInput = true;
        while (takeInput) {
            System.out.println("Ievadīt kritēriju pēc kura vēlaties dzēst klientu. \n" + "1. Pēc vārda \n" + "2. Pēc uzvārda \n" + "3. Pēc adreses \n" + "4. Pēc personas koda \n" + "5. Atgriezties uz sākumu");
            int criterion = sc2.nextInt();
            Customer custToDelete = null;
            switch (criterion) {
                case 1:
                    System.out.println("Ievadīt klienta vārdu");
                    Scanner sc3 = new Scanner(System.in);
                    String inputName = sc3.nextLine();
                    //getCustomersByName
                    for (Customer customer : customers) {
                        if (customer.getName().equals(inputName))
                            custToDelete = customer;
                    }

                    if (custToDelete == null) {
                        System.out.println("Šāds klients netika atrasts");
                    } else {
                        customers.remove(custToDelete);
                    }
                    System.out.println("Klients ir izdzēsts");
                    break;
                case 2:
                    System.out.println("Ievadīt klienta uzvārdu");
                    Scanner sc4 = new Scanner(System.in);
                    String inputSurname = sc4.nextLine();

                    //getCustomersBySurname
                    for (Customer customer : customers) {
                        if (customer.getSurname().equals(inputSurname))
                            custToDelete = customer;
                    }
                    if (custToDelete == null) {
                        System.out.println("Šāds klients netika atrasts");
                    } else {
                        customers.remove(custToDelete);
                    }

                    break;
                case 3:
                    System.out.println("Ievadīt klienta adresi");
                    Scanner sc5 = new Scanner(System.in);
                    String inputAddress = sc5.nextLine();
                    List<Customer> customersFound = getCustomersByAddress(inputAddress);
                    deleteCustomersByList(customersFound); // šo varēsi visur izmantot

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

    private static void deleteCustomersByList(List<Customer> customersFound) {
        for (int i = 0; i < customersFound.size(); i++) {
            customers.remove(customersFound.remove(i));
        }
    }

    private static List<Customer> getCustomersByAddress(String inputAddress) {
        List<Customer> customersFound = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getSurname().equals(inputAddress))
                customersFound.add(customer);
        }
        return customersFound;
    }

    public static void printMenu() {
        String action = "Izvēlaties darbību:\n" +
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