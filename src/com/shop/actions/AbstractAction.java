package com.shop.actions;

public abstract class AbstractAction {
    protected String parameters;

    public abstract void operation();
    public abstract void setParameters(String parameters);

    public final void runAction(String parameters) {
        this.setParameters(parameters);
        this.operation();
    }
}
