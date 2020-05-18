package com.shop.actions;

public class AddToBasket extends AbstractAction {
    @Override
    public void operation() {
        System.out.println("AddToBasket");
    }

    @Override
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }
}
