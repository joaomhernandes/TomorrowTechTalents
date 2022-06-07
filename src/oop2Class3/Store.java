package oop2Class3;

import oop2Class3.controller.CachierController;
import oop2Class3.controller.DBProductsController;
import oop2Class3.controller.DBStockController;
import oop2Class3.model.Book;
import oop2Class3.model.Movie;
import oop2Class3.model.Product;
import oop2Class3.model.ProductType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static <T extends Product> void main(String[] args) {
        Book livro = new Book("Livro",25.99,"Terror","Desconhecido","Icarus");
        Movie filme = new Movie("Filme",59.99,"Fantasia", List.of("Pedro","Paulo"),List.of("José","Manuel"),"Ponta");


        CachierController cachierController = new CachierController();
        DBStockController stock = cachierController.stock;
        stock.dbProductsController.registerProduct(livro);
        stock.dbProductsController.registerProduct(filme);
        stock.dbProductsController.getProductsList();
        stock.dbProductsController.updateProduct(10000, new Book("Livreto",15.99,"Drama","Desconhecido","Tomoe"));
        stock.dbProductsController.getProductsList();
        stock.dbProductsController.findById(10000).productInfo();
        /*stock.dbProductsController.deleteProduct(10000);*/
        /*System.out.println(stock.dbProductsController.findById(10000));*/

        stock.addProductToStock(10000,500);
        stock.addProductToStock(10001,100);
        stock.getProductById(10000).stockItemInfo();
        stock.stockItemsInfo(stock.getProductsOfAType(ProductType.BOOK));
        stock.stockItemsInfo(stock.getStock());
        /*stock.removeProductFromStock(10000,100);*/
        stock.getProductById(10000).stockItemInfo();
        stock.getProductById(20000);
        /*stock.removeProductFromStock(10001,101);*/
        cachierController.inCash();
        cachierController.purchase(10000,500);
        cachierController.inCash();
        cachierController.purchase(10000,500);

    }
}
