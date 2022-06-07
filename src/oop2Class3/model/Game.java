package oop2Class3.model;

public class Game extends Product{
    private String genre;
    private String distributor;
    private String studio;

    public Game(String name, double price, String genre, String distributor, String studio) {
        super(name, price, ProductType.GAME);
        this.genre = genre;
        this.distributor = distributor;
        this.studio = studio;
    }

    public String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDistributor() {
        return distributor;
    }

    private void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getStudio() {
        return studio;
    }

    private void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public void update(Product product) {
        if (product instanceof Game){
            setName(product.getName());
            setPrice(product.getPrice());
            setGenre(((Game) product).getGenre());
            setDistributor(((Game) product).getDistributor());
            setStudio(((Game) product).getStudio());
        }
    }

    @Override
    public void productInfo() {
        System.out.printf("""
                Game name: %s
                ID: %d
                Genre: %s
                Distributor: %s
                Studio: %s
                Price: $%.2f
                """,
                getName(),getId(),getGenre(),getDistributor(),getStudio(),getPrice());
    }
}
