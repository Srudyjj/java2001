package com.shop.actions.structure;

import java.util.Arrays;

public class Category implements ObjectTransformer {
    private long id;
    private String name;
    private long[] productIds;

    public Category(long id, String name, long[] productIds) {
        this.id = id;
        this.name = name;
        this.productIds = productIds;
    }

    public Category() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long[] getProductsIds() {
        return productIds;
    }

    public void setProductsIds(long[] productIds) {
        this.productIds = productIds;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productsIds=" + Arrays.toString(productIds) +
                '}';
    }

    @Override
    public String transformToConsoleOutput() {
        return this.toString();
    }
}
