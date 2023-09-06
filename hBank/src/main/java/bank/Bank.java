package bank;

import calculator.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bank {

    //Piezīmes
    //(CTRL + ALT + L) Format
    //Gang of Four (Desing patterns)

    static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.inputNumbers();
        calc.action();

        /*System.out.println("Sveicināti HBank!");
        int select;
        String value;
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        while (isRunning) {
            printMenu();
            value = sc.nextLine();
            if (isNumeric(value)) {
                select = Integer.parseInt(value);
            } else {
                System.out.println("Ievadiet skaitli no 1 - 9");
                select = 0;
            }
            *//**
             * Uzdevums!!!!!!!
             * 1. Pabeigt createClientAccount
             * 2. Pieslīpēt deleteCustomer
             * 3. Implementēt "Izvadīt visus klienta kontus"
             *//*

            switch (select) {
                case 1 -> newUser();
                case 2 -> createClientAccount(sc);
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
                default -> System.out.println("Šāda izvēlne nepastāv");
            }
        }*/
    }

    public static void createClientAccount(Scanner sc) {
        // 1. Paprasīt lietotājam, kuru Customer viņš vēlas izmantojot personas kodu
        // 2. Paņemam sarakstu ar visiem lietotājiem un atrast to, kuram personas kods atbilst
        // 2(Turpinājums) vai arī izveidojam metodi, kas mums atrod lietotāju pēč personas koda
        // 3. Paprasam lietotājam konta detaļas - bilance un kredītlimits
        // 3(Turpinājums) id uzģenerējam paši
        // 4. Izveidojam kontu
        // 4.1 Pievienojam Customer klase jaunu metodi ar nosaukumu "void addAccount(Account account)"
        // 5. Pievienojam jaunizveidoto kontu klāt Customer objektam


        String acc = "";
        // Valsts kods un Bankas kods vienmēr paliks nemainīgi
        final String countryCode = "LV", bankCode = "BANK";
        // 2 kontrolcipari, kurus automātiski uzģenerēs banka
        Random rand = new Random();
        int checkDigit = rand.nextInt(9, 100);
        String automaticGeneratedCode = String.valueOf(Integer.parseInt(String.valueOf(checkDigit)));
        // Izveidojam klientam konta Nr. no 13 skaitļiem
        int emptyDigits = 0;
        boolean isAccValid = true;
        String counter = "";
        while (isAccValid) {
            System.out.printf("Ievadīt klienta jaunizveidoto konta Nr.");
            String value = sc.nextLine();
            if (isNumeric(value)) {
                acc = value;
                isAccValid = false;
            } else {
                System.out.println("Klienta jaunizveidotajs konts ievadīts neprecīzi");
                isAccValid = true;
            }
            emptyDigits = 12 - acc.length();
            for (int i = 0; i <= emptyDigits; i++) {
                counter = counter + i;
            }
        }
        String accountNumber = new StringBuilder()
                .append(countryCode)
                .append(automaticGeneratedCode)
                .append(bankCode)
                .append(counter)
                .append(acc)
                .toString();
        System.out.println("Klienta konts ir izveidots: " + accountNumber);
        Account account = new Account();
        account.setAccountNumber(accountNumber);
        // customers.add(account);
    }

    public static boolean isNumeric(String value) {
        if (value == null) {
            return false;
        }
        try {
            int parsedValue = Integer.parseInt(value);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void newUser() {
        System.out.println("Jūs izvēlējāties \"Izveidot jaunu klientu\"");

        Scanner sc = new Scanner(System.in);
        Customer person = new Customer();

        Random createRandomId = new Random();
        int Nr = createRandomId.nextInt();
        person.setId(Nr);

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
            System.out.println("ID: " + customer.getId());
            System.out.println("Klienta vārds uzvārds: " + customer.getName() + " " + customer.getSurname());
            System.out.println("Klienta adrese: " + customer.getAddress());
            System.out.println("Klienta personas kods: " + customer.getPersonalCode());
        }
    }

    private static void deleteCustomer() {
        //Šo metodi vajadžētu patīrīt
        // 1. Varbūt viens Scanners objets
        // 2. Pārlikt visus case lai ir pēc tāda principa kā aprakstīts case "3"
        System.out.println("Izdzēst klientu");
        List<Customer> customersFound = new ArrayList<>();
        boolean takeInput = true;
        while (takeInput) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ievadīt kritēriju pēc kura vēlaties dzēst klientu. \n" + "1. Pēc vārda \n" + "2. Pēc uzvārda \n" + "3. Pēc adreses \n" + "4. Pēc personas koda \n" + "5. Atgriezties uz sākumu");
            int criterion = sc.nextInt();
            Customer custToDelete = null;
            switch (criterion) {
                case 1:
                    System.out.println("Ievadīt klienta vārdu");
                    String inputName = sc.nextLine();
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
                    String inputSurname = sc.nextLine();

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
                    deleteCustomerByAdress(sc, customersFound);
                    break;
                case 4:
                    deleteCustomerByPersonalCode(sc, customersFound);
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

    private static void deleteCustomerByPersonalCode(Scanner sc, List<Customer> customersFound){
        System.out.println("Ievadīt klienta personas kodu");
        String inputPersonalCode = sc.nextLine();
        customersFound = getCustomersByPersonalCode(inputPersonalCode);
        deleteCustomersByList(customersFound);
    }

    private static void deleteCustomerByAdress(Scanner sc, List<Customer> customersFound){
        System.out.println("Ievadīt klienta adresi");
        String inputAddress = sc.nextLine();
        customersFound = getCustomersByAddress(inputAddress);
        deleteCustomersByList(customersFound); // šo varēsi visur izmantot
    }

    private static List<Customer> getCustomersByAddress(String inputAddress) {
        List<Customer> customersFound = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getAddress().equals(inputAddress))
                customersFound.add(customer);
        }
        return customersFound;
    }

    private static List<Customer> getCustomersByPersonalCode(String inputPersonalCode) {
        List<Customer> customersFound = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getPersonalCode().equals(inputPersonalCode))
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