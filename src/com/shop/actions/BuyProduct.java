package com.shop.actions;

public class BuyProduct extends AbstractAction {
    @Override
    public void operation() {
        System.out.println("BuyProduct");
    }

    @Override
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }
}
