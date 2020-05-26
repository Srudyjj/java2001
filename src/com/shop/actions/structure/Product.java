package com.shop.actions.structure;

public class Product {

    private long id;
    private String name;
    private float price;
    private int rating;

    public String getName() {
        return name;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Product(long id,String name, float price, int rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
