import domain.CoffeeMachine;
import domain.Receipt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final CoffeeMachine coffeeMachine = new CoffeeMachine();
        final Receipt[] receipts = Receipt.values();

        while (true) {
            printCoffees();
            int selection = selectCoffee(scanner);
            if (isExitSelected(selection)) {
                break;
            }
            if(isIncorrectOptionSelected(receipts, selection)) {
                System.out.println("Wrong item selected!");
                continue;
            }
            coffeeMachine.makeCoffee(receipts[selection-1]);
        }
        scanner.close();
    }
    private static boolean isIncorrectOptionSelected(Receipt[] receipts, int selection) {
        return  selection > receipts.length || selection < 0;
    }

    private static boolean isExitSelected(int selected) {
        return selected == 0;
    }

    private static void printCoffees() {
        System.out.println("Welcome to the Coffee Machine! \nAvailable Coffees: \n");
        int idx = 1;
        for (Receipt receipt : Receipt.values()) {
            System.out.println(idx++ + " " + receipt.name() + " " + receipt.price() +"$");
        }
        System.out.println("\nType in the number of your choice (0 to QUIT): ");
    }

    private static int selectCoffee(Scanner scanner) {
        return scanner.nextInt();
    }
}
