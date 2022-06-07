package oop2Class3.model;

public class StockItem <T extends Product>{
    private T product;
    private int quantity;

    public StockItem(T product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public T getProduct() {
        return product;
    }

    public void setProduct(T product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void stockItemInfo(){
        this.product.productInfo();
        System.out.println("Quantity: " + this.getQuantity());
    }
}
