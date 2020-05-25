package com.shop.actions;

public class BuyProduct extends AbstractAction {
    @Override
    public void operation() {
        System.out.println("BuyProduct");
    }

    @Override
    public void prepareAction(String parameters) {
        this.parameters = null;
    }
}
