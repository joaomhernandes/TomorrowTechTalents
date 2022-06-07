package oop2Class3.model;

public class Book extends Product {
    private String genre;
    private String writer;
    private String publisher;

    public Book(String name, double price, String genre, String writer, String publisher) {
        super(name, price, ProductType.BOOK);
        this.genre = genre;
        this.writer = writer;
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWriter() {
        return writer;
    }

    private void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    private void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void update(Product product) {
        if(product instanceof Book){
            setName(product.getName());
            setGenre(((Book) product).getGenre());
            setPrice(product.getPrice());
            setType(product.getType());
            setWriter(((Book) product).getWriter());
            setPublisher(((Book) product).getPublisher());
        }
    }

    @Override
    public void productInfo() {
        System.out.printf("""
                Book name: %s
                ID: %d
                Genre: %s
                Writer: %s
                Publisher: %s
                Price: $%.2f
                
                """,
                getName(),getId(),getGenre(),getWriter(),getPublisher(),getPrice());

    }
}
