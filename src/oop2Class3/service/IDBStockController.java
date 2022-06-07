package oop2Class3.service;

import oop2Class3.model.ProductType;
import oop2Class3.model.StockItem;

import java.util.List;

public interface IDBStockController {

    List<StockItem> getStock();
    List<StockItem> getProductsOfAType(ProductType type);
    StockItem getProductById(long id);
    void addProductToStock(long id, int quantity);
    void removeProductFromStock(long id, int quantity);
    void stockItemsInfo(List<StockItem> listOfStockItems);
}
