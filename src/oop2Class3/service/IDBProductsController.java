package oop2Class3.service;

import oop2Class3.model.Product;

import java.util.List;

public interface IDBProductsController <T extends Product>{

    void registerProduct(T product);
    List<T> getProductsList();
    T findById(long id);
    void deleteProduct(long id);
    void updateProduct(long id, T product);


}
