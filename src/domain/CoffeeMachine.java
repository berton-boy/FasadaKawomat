package domain;

public class CoffeeMachine {
    public CoffeeMachine() {
        milkFrother = new MilkFrother();
    }

    private final MilkFrother milkFrother;
    public void makeCoffee(Receipt receipt) {
        System.out.println("Making " + receipt.name());
        interval();
        addCoffee(receipt.coffee());
        interval();
        addSugar(receipt.sugar());
        interval();
        addWater(receipt.water());
        interval();
        milkFrother.addMilk(receipt.milk());
        interval();
        coffeeIsReadyNotification(receipt.name());
    }

    private void addCoffee(int coffee) {
        System.out.println("Adding " + coffee + " g of coffee...");
    }

    private void addSugar(int sugar) {
        if(sugar > 0) {
            System.out.println("Adding " + sugar + " g of sugar...");
        }
    }

    private void addWater(int water) {
        if (water > 0) {
            System.out.println("Adding " + water + " ml of water...");
        }
    }


    private void coffeeIsReadyNotification(String coffeeName) {
        System.out.println("\nYour " + coffeeName +" is ready - enjoy!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private static void interval() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println("An error occured! Please try again...");
        }
    }
}

class MilkFrother {

    void addMilk(int milk) {
        if (milk > 0) {
            System.out.println("Adding " + milk + " ml of milk...");
        }
    }
}

