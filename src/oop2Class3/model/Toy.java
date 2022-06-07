package oop2Class3.model;

public class Toy extends Product{
    private String toyType;

    public Toy(String name, double price, String toyType) {
        super(name, price, ProductType.TOY);
        this.toyType = toyType;
    }

    public String getToyType() {
        return toyType;
    }

    private void setToyType(String toyType) {
        this.toyType = toyType;
    }

    @Override
    public void update(Product product) {
        if(product instanceof Toy){
            setName(product.getName());
            setPrice(product.getPrice());
            setToyType(((Toy) product).toyType);
        }
    }

    @Override
    public void productInfo() {
        System.out.printf("""
                Toy name: %s
                ID: %d
                Type: %s
                Price: $%.2f
                
                """,
                getName(),getId(),getToyType(),getPrice());
    }
}
