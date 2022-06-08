package oop2Class3.model;

public class AdultItem extends StockItem{
    private final boolean isAnAdultProduct;

    public boolean isAnAdultProduct() {
        return isAnAdultProduct;
    }

    public AdultItem(Product product, int quantity) {
        super(product, quantity);
        this.isAnAdultProduct = true;

    }
    @Override
    public void stockItemInfo() {
        super.stockItemInfo();
        System.out.println("This is an adult product!");
    }
}
