package com.flower_shop;

public class Main {
    public static void main(String[] args) {

        Bouquet bouquet1 = new Bouquet(new Tulip(), new Tulip(), new Tulip(), new Tulip(), new Tulip(), new Tulip(), new Tulip(), new Chamomile(), new Chamomile(), new Chamomile(), new Chamomile(), new Chamomile(), new Chamomile(), new Chamomile(), new Chamomile());
        System.out.println(bouquet1.getPrice());

        Bouquet bouquet2 = new Bouquet(new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose(), new Rose());
        System.out.println(bouquet2.getPrice());

        Bouquet bouquet3 = new Bouquet(new Carnation(), new Carnation(), new Carnation(), new Carnation(), new Carnation(), new Carnation(), new Carnation());
        System.out.println(bouquet3.getPrice());

        System.out.println("Total quantity: " + Flower.getQuantity());
    }
}

