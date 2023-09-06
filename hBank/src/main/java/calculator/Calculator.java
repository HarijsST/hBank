package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    private final Scanner scanner = new Scanner(System.in);
    private int firstNumber;
    private int secondNumber;

    private List<String> history = new ArrayList<>();

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }

    public void start() {
        action();
    }

    public void inputNumbers() {
        System.out.println("Ievadīt pirmo skaitli");
        int number1 = getInputTillIsANumber();
        setFirstNumber(number1);
        System.out.println("Ievadīt otro skaitli");
        int number2 = getInputTillIsANumber();
        setSecondNumber(number2);
    }

    public void action() {
        int parsedValue;
        boolean isAction = true;
        while (isAction) {
            printMenu();
            parsedValue = getInputTillIsANumber();
            switch (parsedValue) {
                case 1 -> System.out.println("Rezultats ir " + sum());
                case 6 -> isAction = false;
                default -> System.out.println("Sadaļa izstrādes stadijā");
            }
            System.out.println(history);
        }
    }

    private int getInputTillIsANumber() {
        String input;
        int parsedInput = 0;
        boolean isValid = false;
        while (!isValid) {
            input = scanner.nextLine();
            if (isNumeric(input)) {
                parsedInput = Integer.parseInt(input);
                isValid = true;
            } else {
                System.out.println("Ievaditais nav skaitlis, ievadi vēlreiz");
            }
        }
        return parsedInput;
    }

    public boolean isNumeric(String value) {
        if (value == null) {
            return false;
        }
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public int sum() {
        inputNumbers();
        history.add("ACTION: SUM, FIRST: " + getFirstNumber() +
                " SECOND:" + getSecondNumber());
        return getFirstNumber() + getSecondNumber();
    }

    public void printMenu() {
        String action = "Izvēlaties darbību:\n" +
                "1. Saskaitīt\n" +
                "2. Atņemt\n" +
                "3. Reizināt\n" +
                "4. Dalīt\n" +
                "5. Skatīt vēsturi\n" +
                "6. Izdzēst vēsturi\n" +
                "7. Pārtraukt darbu";
        System.out.println(action);
    }
}
