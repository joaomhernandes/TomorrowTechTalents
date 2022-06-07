package oop2Class3;

import oop2Class3.controller.DBProductsController;
import oop2Class3.model.Book;
import oop2Class3.model.Movie;
import oop2Class3.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static <T extends Product> void main(String[] args) {
        Book livro = new Book("Livro",25.99,"Terror","Desconhecido","Icarus");
        Movie filme = new Movie("Filme",59.99,"Fantasia", List.of("Pedro","Paulo"),List.of("José","Manuel"),"Ponta");
        DBProductsController dbProductsController = new DBProductsController<>();
        dbProductsController.registerProduct(livro);
        dbProductsController.registerProduct(filme);

        dbProductsController.getProductsList();
        dbProductsController.updateProduct(10000, new Book("Livreto",15.99,"Drama","Desconhecido","Tomoe"));
        dbProductsController.getProductsList();
        dbProductsController.findById(10000).productInfo();
        dbProductsController.deleteProduct(10000);
        System.out.println(dbProductsController.findById(10000));

    }
}
