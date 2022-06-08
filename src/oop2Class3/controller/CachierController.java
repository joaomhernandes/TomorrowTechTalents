package oop2Class3.controller;

import oop2Class3.model.*;
import oop2Class3.service.ICachierController;

public class CachierController implements ICachierController {
    public DBStockController stock = new DBStockController();
    private Cashier cashier = new Cashier();

    @Override
    public boolean purchase(long id, int quantity) {
        StockItem item = stock.getProductById(id);
        if (item != null && item.getQuantity() > 0) {
            if (item.getQuantity() >= quantity) {
                cashier.setCash(cashier.getCash() + (item.getProduct().getPrice() * quantity));
                stock.removeProductFromStock(id, quantity);
                System.out.println("Successful purchase");
                return true;
            }
        }
        return false;
    }

    @Override
    public void inCash() {
        double cash = cashier.getCash();
        System.out.printf("The cashier has $%.2f in cash\n", cash);
    }

    @Override
    public boolean verifyPurchase(long id, int quantity, Custumer custumer) {
        if(stock.getProductById(id) instanceof AdultItem){
            return purchaseAdultProduct(id, quantity, custumer);
        }else{
            return purchase(id,quantity);
        }
    }

    @Override
    public void aplyBookPurchaseDiscount(double amountSpentOnBooks) {
        if(amountSpentOnBooks >= 200){
            amountSpentOnBooks *= 0.15;
            cashier.setCash(cashier.getCash()-amountSpentOnBooks);
        }

    }

    @Override
    public boolean purchaseAdultProduct(long id, int quantity, Custumer custumer) {
        AdultItem adultItem = (AdultItem) stock.getProductById(id);
        if ( adultItem != null && adultItem.getQuantity() > 0) {
            if (custumer.isOfAge()) {
                return purchase(id, quantity);
            }
        }
        return false;
    }

    @Override
    public void purchaseMultiplesItems(long[][] idAndQuantity, Custumer custumer) {
        double amountSpentOnBooks = 0;
        for (int i = 0; i < idAndQuantity.length; i++) {
            long id = idAndQuantity[i][0];
            int quantity = (int) idAndQuantity[i][1];
            if (stock.getProductById(id).getProduct().getType() == ProductType.BOOK) {
                if (verifyPurchase(id, quantity, custumer)) {
                    amountSpentOnBooks++;
                } else {
                    verifyPurchase(id, quantity, custumer);
                }
            }
        }
        if (amountSpentOnBooks >= 200) {
            aplyBookPurchaseDiscount(amountSpentOnBooks);
        }
    }
}
