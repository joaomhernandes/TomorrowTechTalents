package oop2Class3.controller;

import oop2Class3.model.Cashier;
import oop2Class3.model.StockItem;
import oop2Class3.service.ICachierController;

public class CachierController implements ICachierController {
    public DBStockController stock = new DBStockController();
    private Cashier cashier = new Cashier();

    @Override
    public void purchase(long id, int quantity) {
        StockItem item = stock.getProductById(id);
        if ( item != null && item.getQuantity() > 0){
            if(item.getQuantity()>=quantity){
                cashier.setCash(cashier.getCash()+(item.getProduct().getPrice()*quantity));
                stock.removeProductFromStock(id,quantity);
                System.out.println("Successful purchase");
            }else{
                cashier.setCash(cashier.getCash()+(item.getProduct().getPrice()*item.getQuantity()));
                System.out.println("I'm sorry, we only have " +item.getQuantity()+ " items of this products");
                stock.removeProductFromStock(id,item.getQuantity());
                System.out.println("Successful purchase");
            }
        }else{
            System.out.println("Purchase not made due to lack of product in stock.");
        }
    }

    @Override
    public void inCash() {
        double cash = cashier.getCash();
        System.out.printf("The cashier has $%.2f in cash\n", cash);
    }
}
