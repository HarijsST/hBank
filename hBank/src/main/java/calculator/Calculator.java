package calculator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    private final Scanner scanner = new Scanner(System.in);
    private double firstNumber;
    private double secondNumber;

    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    private List<String> history = new ArrayList<>();

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Calculator(){

    }
    @Override
    public String toString() {
        return "Calculator{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }

    public void inputNumbers() {
        System.out.println("Ievadīt pirmo skaitli");
        double number1 = getInputTillIsANumber();
        setFirstNumber(number1);
        System.out.println("Ievadīt otro skaitli");
        double number2 = getInputTillIsANumber();
        setSecondNumber(number2);
    }

    public void start() {
        int parsedValue;
        boolean isAction = true;
        while (isAction) {
            printMenu();
            parsedValue = getInputTillIsANumberForStart();
            switch (parsedValue) {
                case 1 -> System.out.println("Rezultats ir " + sum());
                case 2 -> System.out.println("Rezultats ir " + subtraction());
                case 3 -> System.out.println("Rezultats ir " + multiplication());
                case 4 -> System.out.println("Rezultats ir " + divide());
                case 5 -> printHistory();
                case 6 -> removeHistory();
                case 7 -> isAction = false;
                default -> System.out.println("Sadaļa izstrādes stadijā");
            }
        }
    }

    private int getInputTillIsANumberForStart() {
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
    private double getInputTillIsANumber() {
        String input;
        double parsedInput = 0;
        boolean isValid = false;
        while (!isValid) {
            input = scanner.nextLine();
            if (isNumeric(input)) {
                parsedInput = Double.parseDouble(input);
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
            Double.parseDouble(value);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public String sum() {
        inputNumbers();
        addHistoryEventFromSum();
        return decimalFormat.format(getFirstNumber() + getSecondNumber());
    }

    public String subtraction() {
        inputNumbers();
        addHistoryEventFromSubtraction();
        return decimalFormat.format(getFirstNumber() - getSecondNumber());
    }

    public String multiplication() {
        inputNumbers();
        addHistoryEventFromMultiplication();
        return decimalFormat.format(getFirstNumber() * getSecondNumber());
    }

    public String divide() {
        inputNumbers();
        addHistoryEventFromDivide();
        return decimalFormat.format(getFirstNumber() / getSecondNumber());
    }

    public void addHistoryEventFromSum(){
        history.add("ACTION: SUM, FIRST: " + getFirstNumber() +
                " SECOND: " + getSecondNumber() + " RESULT = " + decimalFormat.format(getFirstNumber() + getSecondNumber()));
    }

    public void addHistoryEventFromSubtraction(){
        history.add("ACTION: SUM, FIRST: " + getFirstNumber() +
                " SECOND: " + getSecondNumber() + " RESULT = " + decimalFormat.format(getFirstNumber() - getSecondNumber()));
    }

    public void addHistoryEventFromMultiplication(){
        history.add("ACTION: SUM, FIRST: " + getFirstNumber() +
                " SECOND: " + getSecondNumber() + " RESULT = " + decimalFormat.format(getFirstNumber() * getSecondNumber()));
    }
    public void addHistoryEventFromDivide(){
        history.add("ACTION: SUM, FIRST: " + getFirstNumber() +
                " SECOND: " + getSecondNumber() + " RESULT = " + decimalFormat.format(getFirstNumber() / getSecondNumber()));
    }
    public void printHistory(){
        if(history.isEmpty()){
            System.out.println("Vēsturē nav saglabātu datu");
        }else{
            for(String allHistory : history){
                System.out.println(allHistory);
            }
        }
    }
    public void removeHistory() {
        if(history.isEmpty()){
            System.out.println("Vēsturē nav saglabātu datu");
        }else{
            history.clear();
            System.out.println("Vēstures dati ir dzēsti");
        }
    }

    public void printMenu() {
        String action = """
                Izvēlaties darbību:
                1. Saskaitīt
                2. Atņemt
                3. Reizināt
                4. Dalīt
                5. Skatīt vēsturi
                6. Izdzēst vēsturi
                7. Pārtraukt darbu""";
        System.out.println(action);
    }
}
