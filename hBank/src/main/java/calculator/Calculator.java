package calculator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    private final Scanner scanner = new Scanner(System.in);
    private double firstNumber;
    private double secondNumber;

    private DecimalFormat decimalFormat = new DecimalFormat("0.00");

    // 1. Līmenis - Vai mēs varam nomainīt uz citu objektu? Nē
    // 2. Līmenis - Vai mēs varam nomainīt saturu? Jā
    // Šis nav nemaināms objekts (Immutable)

    private final List<String> history = new ArrayList<>();

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

    @Override
    public String toString() {
        return "Calculator{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }

    public void inputNumbers() {
        System.out.println("Enter first number");
        double number1 = getInputTillIsANumber();
        setFirstNumber(number1);
        System.out.println("Enter second number");
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
                case 1 -> System.out.println("Result: " + sum());
                case 2 -> System.out.println("Result: " + subtraction());
                case 3 -> System.out.println("Result: " + multiplication());
                case 4 -> System.out.println("Result: " + divide());
                case 5 -> printHistory();
                case 6 -> removeHistory();
                case 7 -> isAction = false;
                default -> System.out.println("Enter number 1 - 7");
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
                System.out.println("It`s not a number, enter number 1 - 7");
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
                System.out.println("It`s not a number, enter number 1 - 7");
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
        addHistoryEvent("SUM");
        return decimalFormat.format(getFirstNumber() + getSecondNumber());
    }

    public String subtraction() {
        inputNumbers();
        addHistoryEvent("SUBTRACTION");
        return decimalFormat.format(getFirstNumber() - getSecondNumber());
    }

    public String multiplication() {
        inputNumbers();
        addHistoryEvent("MULTIPLICATION");
        return decimalFormat.format(getFirstNumber() * getSecondNumber());
    }

    public String divide() {
        inputNumbers();
        String format = decimalFormat.format(getFirstNumber() / getSecondNumber());
        addHistoryEvent("DIVIDE");
        return format;
    }

    private void addHistoryEvent(String action) {
        if (action == "SUM") {
            history.add("ACTION: SUM, FIRST: " + getFirstNumber() +
                    " SECOND: " + getSecondNumber() + " RESULT = " + decimalFormat.format(getFirstNumber() + getSecondNumber()));
        } else if (action == "SUBTRACTION") {
            history.add("ACTION: SUBTRACTION, FIRST: " + getFirstNumber() +
                    " SECOND: " + getSecondNumber() + " RESULT = " + decimalFormat.format(getFirstNumber() - getSecondNumber()));
        } else if (action == "MULTIPLICATION") {
            history.add("ACTION: MULTIPLICATION, FIRST: " + getFirstNumber() +
                    " SECOND: " + getSecondNumber() + " RESULT = " + decimalFormat.format(getFirstNumber() * getSecondNumber()));
        } else if (action == "DIVIDE") {
            history.add("ACTION: DIVIDE, FIRST: " + getFirstNumber() +
                    " SECOND: " + getSecondNumber() + " RESULT = " + decimalFormat.format(getFirstNumber() / getSecondNumber()));
        }
    }

    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("History is empty");
        } else {
            for (String allHistory : history) {
                System.out.println(allHistory);
            }
        }
    }

    public void removeHistory() {
        if (history.isEmpty()) {
            System.out.println("History is empty");
        } else {
            history.clear();
            System.out.println("Data from history is deleted");
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
