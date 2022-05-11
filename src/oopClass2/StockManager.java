package oopClass2;

public class StockManager {
    public static void main(String[] args) {
        Stock mainStore = new Stock("Main store");
        mainStore.addProductToStock("TV 40'", "Eletronics","TV",50,"LG");
        mainStore.addProductToStock("Gamming PC","Tech","PC",30,"Alienware");
        mainStore.printProductById(2);
        mainStore.addProductToStock("Gamming PC","Tech","PC",20,"Alienware");
        mainStore.printStock();
        mainStore.updateProductFromStock(2,"Gamming PC","Tech","PC",15,"Samsung");
        mainStore.printProductById(2);
        mainStore.removeProductFromStockById(1);
        mainStore.printStock();

    }
}
