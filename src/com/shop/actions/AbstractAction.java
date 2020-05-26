package com.shop.actions;

import com.shop.actions.output.ObjectTransformer;

public abstract class AbstractAction<T> {
    protected String data;
    protected T inputStructure;

    public final String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setInputStructure(T inputStructure) {
        this.inputStructure = inputStructure;
    }

    public abstract ObjectTransformer operation();
    public abstract void prepareAction();

    public final ObjectTransformer runAction() {
        prepareAction();
        return operation();
    }
}
