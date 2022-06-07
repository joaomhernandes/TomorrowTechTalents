package oop2Class3.model;

import oop2Class3.service.IProduct;

public abstract class Product implements IProduct {
    private static long idGenerator = 10000;
    private long id;
    private String name;
    private double price;
    private ProductType type;


    public Product(String name, double price, ProductType type) {
        this.id = idGenerator;
        idGenerator++;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    protected void setType(ProductType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type.type +
                '}';
    }
}
