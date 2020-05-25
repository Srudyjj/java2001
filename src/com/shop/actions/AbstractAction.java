package com.shop.actions;

import com.shop.actions.structure.input.AbstractInputStructure;

public abstract class AbstractAction<T extends AbstractInputStructure> {
    protected T parameters;

    public abstract void operation();
    public abstract void prepareAction(String command);

    public final void runAction() {
        this.operation();
    }
}
