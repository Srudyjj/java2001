package com.shop.actions.structure;

import java.util.Arrays;

public class Basket implements ObjectTransformer {
    private long id;
    private final long[] productsIds = new long[30];
    private int position = 0;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Basket(long id) {
        this.id = id;
    }

    public void addProductId(long id) {
        this.productsIds[position++] = id;
    }

    public long[] getProductsIds() {
        return this.productsIds;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", productsIds=" + Arrays.toString(productsIds) +
                '}';
    }

    @Override
    public String transformToConsoleOutput() {
        return this.toString();
    }
}
