package com.fruit_shop;

public class Main {
    public static void main(String[] args) {
        Apple[] apples = {new Apple(2),
                new Apple(0.5),
                new Apple(4),
                new Apple(1)};
        Pear[] pears = {
                new Pear(2),
                new Pear(0.3),
                new Pear(1),
                new Pear(3),
                new Pear(5),
        };
        Apricot[] apricots = {
                new Apricot(1),
                new Apricot(5),
                new Apricot(2),
                new Apricot(5),
                new Apricot(0.666),
                new Apricot(1)
        };

        double applesTotalPrice = Fruit.totalPrice(apples);
        System.out.println("Total apples price: " + applesTotalPrice);

        double pearsTotalPrice = Fruit.totalPrice(pears);
        System.out.println("Total pears price: " + pearsTotalPrice);

        double apricotsTotalPrice = Fruit.totalPrice(apricots);
        System.out.println("Total apricots price: " + apricotsTotalPrice);

        System.out.println("Total price: " + (applesTotalPrice + pearsTotalPrice + apricotsTotalPrice));

    }


}
