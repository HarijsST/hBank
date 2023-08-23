import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Sveicināti HBank!");
        // Par menu - te der padomāt, varbūt var izveidot metodi, kas šo izvada
        String menu = "Izvēlaties darbību:\n" +
                "1. Izveidot jaunu klientu\n" +
                "2. Pievienot klientam jaunu kontu\n" +
                "3. Izvadīt visus klientus\n" +
                "4. Izvadīt visus klienta kontus\n" +
                "5. Nomainīt klienta datus\n" +
                "6. Nomainīt klienta konta datus\n" +
                "7. Izdzēst klientu\n" +
                "8. Izdzēst klienta konta\n" +
                "9. Pārtraukt darbu";
        System.out.println(menu); // Iespējams, ka arī iet iekšā ciklā
        int select;
        boolean isRunning = true; //Mainīgā nosaukums(!) takeInput, isRunning
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt(); // Visticamāk šim jāiet iekšā zem while
        while (isRunning) {
            // šeit būs menu
            // šeit būs select ievade
            switch (select) {
                case 1:
                    System.out.println("Jūs izvēlējāties \"Izveidot jaunu klientu\"");
                    newUser();
                    System.out.println(menu); // Šis jau būs cikla sākumā, ņemam ārā
                    select = sc.nextInt(); // Šis jau būs cikla sākumā, ņemam ārā
                    isRunning = true; // Šis nav vajadzīgs
                    break;
                case 2:
                    System.out.println("Pievienot klientam jaunu kontu");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu); // Šis jau būs cikla sākumā, ņemam ārā
                    select = sc.nextInt(); // Šis jau būs cikla sākumā, ņemam ārā
                    isRunning = true; // Šis nav vajadzīgs
                    break;
                case 3:
                    System.out.println("Izvadīt visus klientus");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    printAllCustomers();
                    System.out.println(menu); // Šis jau būs cikla sākumā, ņemam ārā
                    select = sc.nextInt(); // Šis jau būs cikla sākumā, ņemam ārā
                    isRunning = true; // Šis nav vajadzīgs
                    break;
                case 4:
                    System.out.println("Izvadīt visus klienta kontus");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu); // Šis jau būs cikla sākumā, ņemam ārā
                    select = sc.nextInt(); // Šis jau būs cikla sākumā, ņemam ārā
                    isRunning = true; // Šis nav vajadzīgs
                    break;
                case 5:
                    System.out.println("Nomainīt klienta datus");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu); // Šis jau būs cikla sākumā, ņemam ārā
                    select = sc.nextInt(); // Šis jau būs cikla sākumā, ņemam ārā
                    isRunning = true; // Šis nav vajadzīgs
                    break;
                case 6:
                    System.out.println("Nomainīt klienta konta datus");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu); // Šis jau būs cikla sākumā, ņemam ārā
                    select = sc.nextInt(); // Šis jau būs cikla sākumā, ņemam ārā
                    isRunning = true; // Šis nav vajadzīgs
                    break;
                case 7:
                    System.out.println("Izdzēst klientu");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu); // Šis jau būs cikla sākumā, ņemam ārā
                    select = sc.nextInt(); // Šis jau būs cikla sākumā, ņemam ārā
                    isRunning = true; // Šis nav vajadzīgs
                    break;
                case 8:
                    System.out.println("Izdzēst klienta kontu");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu); // Šis jau būs cikla sākumā, ņemam ārā
                    select = sc.nextInt(); // Šis jau būs cikla sākumā, ņemam ārā
                    isRunning = true; // Šis nav vajadzīgs
                    break;
                case 9:
                    System.out.println("Jūs izvēlējāties pārtraukt darbu - paldies un uz redzēšanos!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Ievadītā izvēlne nepastāv.");
                    System.out.println(menu); // Šis jau būs cikla sākumā, ņemam ārā
                    select = sc.nextInt(); // Šis jau būs cikla sākumā, ņemam ārā
                    isRunning = true;
            }
        }
    }

    public static void error(String menu, int select, boolean bool, Scanner sc) { // Nestrādā // Nav jēgas, ņemam ārā
        System.out.println("Sadaļa atrodas izstrādes stadijā.");
        System.out.println(menu);
        select = sc.nextInt();
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
        String personalCodeF = personalCode.substring(0, 6) + "-" + personalCode.substring(6);
        person.setPersonalCode(personalCodeF);

        customers.add(person);

        System.out.println("Klienta vārds uzvārds: " + person.getName() + " " + person.getSurname());
        System.out.println("Klienta adrese: " + person.getAddress());
        System.out.println("Klienta personas kods: " + person.getPersonalCode());

        System.out.println("Paldies! Jauns klients izveidots.");
    }

    private void printAllCustomers() {
        for (Customer customer : customers) {
            System.out.println("Klienta vārds uzvārds: " + customer.getName() + " " + customer.getSurname());
            System.out.println("Klienta adrese: " + customer.getAddress());
            System.out.println("Klienta personas kods: " + customer.getPersonalCode());
        }
    }
}
