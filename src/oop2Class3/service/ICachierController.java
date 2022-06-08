package oop2Class3.service;

import oop2Class3.model.Custumer;

public interface ICachierController {

    boolean purchase(long id, int quantity);
    void inCash();
    boolean verifyPurchase(long id,int quantity, Custumer custumer);
    void aplyBookPurchaseDiscount(double amountSpentOnBooks);
    boolean purchaseAdultProduct(long id, int quantity, Custumer custumer);
    void purchaseMultiplesItems(long[][] idAndQuantity, Custumer custumer);
}
