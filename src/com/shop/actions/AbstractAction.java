package com.shop.actions;

import com.shop.actions.structure.ObjectTransformer;

public abstract class AbstractAction<T> {
    protected String[] data;
    protected T inputStructure;

    public final String[] getData() {
        return data;
    }

    public void setData(String... data) {
        this.data = data;
    }

    public T getInputStructure() {
        return inputStructure;
    }

    public void setInputStructure(T inputStructure) {
        this.inputStructure = inputStructure;
    }

    public abstract void prepareAction();

    public abstract ObjectTransformer operation();

    public final ObjectTransformer runAction() {
        prepareAction();
        return operation();
    }

}
