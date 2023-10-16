package salaryCalculator.utils;

import java.util.Scanner;

public class UserInputHelper {
    static Scanner scanner = new Scanner(System.in);
    public static boolean isNumeric(String value) {
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

    public static int getInputTillIsANumber() {
        String input;
        int parsedInput = 0;
        boolean isValid = false;
        while (!isValid) {
            input = scanner.nextLine();
            if (isNumeric(input)) {
                parsedInput = Integer.parseInt(input);
                isValid = true;
            } else {
                System.out.println("It`s not a number, enter number");
            }
        }
        return parsedInput;
    }
}
