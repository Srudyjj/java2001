package com.shop.actions;

public abstract class AbstractAction {
    public abstract void operation();

    public final void runAction() {
        this.operation();
    }
}
