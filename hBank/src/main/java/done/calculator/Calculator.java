package done.calculator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    private final Scanner scanner = new Scanner(System.in);
    private double firstNumber;
    private double secondNumber;

    private DecimalFormat decimalFormat = new DecimalFormat("0.00");

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
                case 1 -> System.out.println("Result: " + performCalculation(ActionTypes.SUM));
                case 2 -> System.out.println("Result: " + performCalculation(ActionTypes.SUBTRACTION));
                case 3 -> System.out.println("Result: " + performCalculation(ActionTypes.MULTIPLICATION));
                case 4 -> System.out.println("Result: " + performCalculation(ActionTypes.DIVIDE));
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

    public String performCalculation(ActionTypes actionType) {
        inputNumbers();
        String format = switch (actionType) {
            case SUM -> decimalFormat.format(getFirstNumber() + getSecondNumber());
            case SUBTRACTION -> decimalFormat.format(getFirstNumber() - getSecondNumber());
            case MULTIPLICATION -> decimalFormat.format(getFirstNumber() * getSecondNumber());
            case DIVIDE -> decimalFormat.format(getFirstNumber() / getSecondNumber());
        };
        history.add("ACTION: " + actionType.name() + ", FIRST: " + getFirstNumber() +
                " SECOND: " + getSecondNumber() + " RESULT = " + format);
        return format;
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

    private enum ActionTypes {
        SUM, MULTIPLICATION, SUBTRACTION, DIVIDE
    }
}
