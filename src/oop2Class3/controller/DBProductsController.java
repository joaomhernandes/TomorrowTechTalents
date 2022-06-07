package oop2Class3.controller;

import oop2Class3.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DBProductsController <T extends Product>{
    private final List<T> productsList;

    public DBProductsController() {
        this.productsList = new ArrayList<>();
    }

    public void registerProduct(T product) {
        if(productsList.contains(product)){
            System.out.println("Product already registered");
        }else{
            productsList.add(product);
        }
    }

    public List<T> getProductsList() {
        for (Product produtct:productsList){
            produtct.productInfo();
        }
        return productsList;
    }

    public T findById(long id) {
        for (T product : productsList){
            if (product.getId() == id){
                return product;
            }
        }
        System.out.println("Product not found");
        return null;
    }

    public void deleteProduct(long id) {
        T product = findById(id);
        if(product != null){
            productsList.remove(product);
        }
    }

    public void updateProduct(long id, T product) {
         T item = findById(id);
        if (item != null){
            item.update(product);
        }
    }
}
