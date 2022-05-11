package oopClass2;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private static int sequential = 1;
    private final int id;
    String name;
    private final List<Product> PRODUCT_LIST = new ArrayList<>();

    public Stock( String name) {
        this.id = sequential++;
        this.name = name;
    }


    public void addProductToStock(String name, String section, String type, int quantity, String brand){
        boolean productAlreadyExist = false;
        for(Product productTemp: PRODUCT_LIST) {
            if (productTemp.getName().equalsIgnoreCase(name)  && productTemp.getBrand().equalsIgnoreCase(brand))  {
                updateProductFromStock(productTemp.getId(),quantity);
                productAlreadyExist = true;
                break;
            }
        }
        if (!productAlreadyExist){
            Product product = new Product(name, section, type, quantity, brand);
            PRODUCT_LIST.add(product);
            System.out.println("The product "+ product.getName() +" was successfully added to stock!!");
        }
    }

    public void updateProductFromStock(int id, String name, String section, String type, int quantity, String brand) {
        for(Product productTemp: PRODUCT_LIST) {
            if (productTemp.getId() == id) {
                productTemp.setName(name);
                productTemp.setSection(section);
                productTemp.setType(type);
                productTemp.setQuantity(quantity);
                productTemp.setBrand(brand);
                System.out.println("The product " +productTemp.getName() + " was successfully Update!!");
            }
        }
    }
    public void updateProductFromStock(int id, int quantity) {
        for (Product productTemp : PRODUCT_LIST) {
            if (productTemp.getId() == id) {
                productTemp.setQuantity(productTemp.getQuantity() + quantity);
                System.out.println("The quantity of " +productTemp.getName() + " was successfully added to stock!!");
            }

        }
    }

    public void removeProductFromStockById ( int productId){
        PRODUCT_LIST.removeIf(productTemp -> productTemp.getId() == productId);
        System.out.println("The product was successfully removed from stock!!");
    }

    public void printStock () {
        StringBuilder products = new StringBuilder();
        for (Product product : PRODUCT_LIST) {
            products.append(product).append("\n");
        }
        System.out.println("Stock{" +
                "ID: " + id +
                ", Name: " + name +
                ", Products: \n" + products +
                '}');
    }
    public void printProductById ( int id){
        for (Product productTemp : PRODUCT_LIST) {
            if (productTemp.getId() == id) {
                System.out.println(productTemp);
            }
        }
    }


    @Override
    public String toString () {
        StringBuilder products = new StringBuilder();
        for (Product product : PRODUCT_LIST) {
            products.append(product).append("\n");
        }
        return "Stock{" +
                "ID: " + id +
                ", Name: '" + name + '\'' +
                ", Products:  \n" + products +
                '}';
    }

}
