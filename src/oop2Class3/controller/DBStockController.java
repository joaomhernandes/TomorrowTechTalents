package oop2Class3.controller;

import oop2Class3.model.Product;
import oop2Class3.model.ProductType;
import oop2Class3.model.StockItem;
import oop2Class3.service.IDBProductsController;
import oop2Class3.service.IDBStockController;

import java.util.ArrayList;
import java.util.List;

public class DBStockController implements IDBStockController {

    private List<StockItem> stockItemList;
    public DBProductsController dbProductsController = new DBProductsController();

    public DBStockController() {
        this.stockItemList = new ArrayList<>();
    }


    @Override
    public List<StockItem> getStock() {
        return this.stockItemList;
    }

    @Override
    public List<StockItem> getProductsOfAType(ProductType type) {
        List<StockItem> itemsOfAType = new ArrayList<>();
        for (StockItem stockItem:stockItemList) {
            if(stockItem.getProduct().getType() == type){
                itemsOfAType.add(stockItem);
            }
        }
        System.out.println("Currently the stock has " + itemsOfAType.size() + " items of the type " +type.getType() );
        return itemsOfAType;
    }

    @Override
    public StockItem getProductById(long id) {
        for (StockItem stockItem:stockItemList) {
            if(stockItem.getProduct().getId() == id){
                return stockItem;
            }
        }
        System.out.println("Item not found in stock.");
        return null;
    }

    @Override
    public void addProductToStock(long id, int quantity) {
        StockItem item = getProductById(id);
        if (item == null) {
            Product product = dbProductsController.findById(id);
            if (product != null) {
                StockItem stockItem = new StockItem<>(product, quantity);
                stockItemList.add(stockItem);
            }
        }else{
            item.setQuantity(item.getQuantity() + quantity);
        }
    }

    @Override
    public void removeProductFromStock(long id, int quantity) {
        StockItem item = getProductById(id);
        if(item != null){
            if(item.getQuantity()>=quantity){
                item.setQuantity(item.getQuantity() - quantity);
            }else{
                System.out.println("Insufficient quantity in stock. Quantity in stock: " + item.getQuantity());
            }
        }else{
            System.out.println("Item not found in stock.");
        }
    }

    @Override
    public void stockItemsInfo(List<StockItem> listOfStockItems) {
        for (StockItem stockItem:stockItemList) {
            stockItem.stockItemInfo();
        }
    }
}
