import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.println("Sveicināti HBank!");
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
        System.out.println(menu);
        int select;
        boolean bool = true;
        Scanner sc = new Scanner(System.in);
        select = sc.nextInt();
        while(bool == true) {
            switch (select) {
                case 1:
                    System.out.println("Jūs izvēlējāties \"Izveidot jaunu klientu\"");
                    newUser();
                    System.out.println(menu);
                    select = sc.nextInt();
                    bool = true;
                    break;
                case 2:
                    System.out.println("Pievienot klientam jaunu kontu");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu);
                    select = sc.nextInt();
                    bool = true;
                    break;
                case 3:
                    System.out.println("Izvadīt visus klientus");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu);
                    select = sc.nextInt();
                    bool = true;
                    break;
                case 4:
                    System.out.println("Izvadīt visus klienta kontus");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu);
                    select = sc.nextInt();
                    bool = true;
                    break;
                case 5:
                    System.out.println("Nomainīt klienta datus");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu);
                    select = sc.nextInt();
                    bool = true;
                    break;
                case 6:
                    System.out.println("Nomainīt klienta konta datus");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu);
                    select = sc.nextInt();
                    bool = true;
                    break;
                case 7:
                    System.out.println("Izdzēst klientu");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu);
                    select = sc.nextInt();
                    bool = true;
                    break;
                case 8:
                    System.out.println("Izdzēst klienta kontu");
                    System.out.println("Sadaļa atrodas izstrādes stadijā.");
                    System.out.println(menu);
                    select = sc.nextInt();
                    bool = true;
                    break;
                case 9:
                    System.out.println("Jūs izvēlējāties pārtraukt darbu - paldies un uz redzēšanos!");
                    bool = false;
                    break;
                default:
                    System.out.println("Ievadītā izvēlne nepastāv.");
                    System.out.println(menu);
                    select = sc.nextInt();
                    bool = true;
            }
        }
    }

    public static void error(String menu, int select, boolean bool, Scanner sc){ // Nestrādā
        System.out.println("Sadaļa atrodas izstrādes stadijā.");
        System.out.println(menu);
        select = sc.nextInt();
    }
    public static void newUser(){
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
        String personalCode = scan.nextLine();
        String personalCodeF = personalCode.substring(0,6) + "-" + personalCode.substring(6);
        person.setPersonalCode(personalCodeF);

        System.out.println("Klienta vārds uzvārds: " + person.getName() + " " + person.getSurname());
        System.out.println("Klienta adrese: " + person.getAddress());
        System.out.println("Klienta personas kods: " + person.getPersonalCode());

        System.out.println("Paldies! Jauns klients izveidots.");
    }
}
