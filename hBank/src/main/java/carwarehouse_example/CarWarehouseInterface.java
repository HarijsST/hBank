package carwarehouse_example;

import carwarehouse_example.controller.CarController;
import carwarehouse_example.utils.CarWareHouseHelper;

import java.util.Scanner;

public class CarWarehouseInterface {

    private final CarController carController = new CarController();

    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        int parsedValue;
        boolean isAction = true;
        while (isAction) {
            printMenu();
            parsedValue = CarWareHouseHelper.getInputTillIsANumber(scanner);
            switch (parsedValue) {
                case 1 -> carController.printAllCars();
                // case 2 -> carController.printCarById();
                case 7 -> isAction = false;
                default -> System.out.println("Enter number 1 - 7");
            }
        }
    }

    // 1. Pabeigt darbu pie CarModel
    // 2. Pa vienam veidot jaunu metodi repo -> service -> controllieri -> jauns case
    // 3. deleteAllCars, printCarById

    public void printMenu() {
        String action = """
                Izvēlaties darbību:
                1. Izvadit visas masinas
                7. Pārtraukt darbu""";
        System.out.println(action);
    }
}
