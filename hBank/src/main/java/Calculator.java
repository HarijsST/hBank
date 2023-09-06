import java.util.Scanner;

public class Calculator {
    int firstNumber, secondNumber;
    Scanner scan = new Scanner(System.in);

    public int getFirstNumber() {return firstNumber;}
    public void setFirstNumber(int firstNumber) {this.firstNumber = firstNumber;}
    public int getSecondNumber() {return secondNumber;}
    public void setSecondNumber(int secondNumber) {this.secondNumber = secondNumber;}

    @Override
    public String toString() {
        return "Calculator{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }

    public void inputNumbers() {
        Calculator calc = new Calculator();
        System.out.println("Ievadīt pirmo skaitli");
        int number1 = scan.nextInt();
        calc.setFirstNumber(number1);
        System.out.println("Ievadīt otro skaitli");
        int number2 = scan.nextInt();
        calc.setSecondNumber(number2);
        System.out.println(calc.firstNumber);
        System.out.println(calc.secondNumber);
        System.out.println(calc.firstNumber + calc.secondNumber);

    }

    public void action(){
        int select;
        boolean isAction = true;
        while(isAction){
            printMenu();
            select = scan.nextInt();
            switch (select){
                case 1 -> sum();
                default -> System.out.println("Sadaļa izstrādes stadijā");
            }

        }
    }
    public int sum(){
        return calc.getFirstNumber() + calc.getSecondNumber();
    }

    public static void printMenu() {
        String action = "Izvēlaties darbību:\n" +
                "1. Saskaitīt\n" +
                "2. Atņemt\n" +
                "3. Reizināt\n" +
                "4. Dalīt\n" +
                "5. Skatīt vēsturi\n" +
                "6. Pārtraukt darbu";
        System.out.println(action);
    }
}
