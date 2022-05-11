package oopClass2;

public class Product {
    private static int sequential = 1;
    private final int id;
    private String name;
    private String section;
    private String type;
    private int quantity;
    private String brand;


    public Product(String name, String section, String type, int quantity, String brand) {
        this.id = sequential++;
        this.name = name;
        this.section = section;
        this.type = type;
        this.quantity = quantity;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return  "Id: " + id +
                ", Name: " + name +
                ", Section: " + section +
                ", Type: " + type +
                ", Quantity: " + quantity +
                ", Brand: " + brand ;
    }
}
