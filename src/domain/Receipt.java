package domain;

public enum Receipt {

    BLACK_COFFEE(5, 15, 0, 0, 130),
    ESPRESSO(7, 10, 0, 0, 30),
    CAPPUCCINO(9, 20, 0, 90, 0),
    AMERICANO(9, 30, 0, 0, 90),
    LATTE(9, 20, 0, 130, 0);

    private final double price;
    private final int coffee;
    private final int sugar;
    private final int milk;
    private final int water;

    Receipt(double price, int coffee, int sugar, int milk, int water) {
        this.price = price;
        this.coffee = coffee;
        this.sugar = sugar;
        this.milk = milk;
        this.water = water;
    }

    public double price() {
        return price;
    }

    int coffee() {
        return coffee;
    }

    int sugar() {
        return sugar;
    }

    int milk() {
        return milk;
    }

    int water() {
        return water;
    }
}
