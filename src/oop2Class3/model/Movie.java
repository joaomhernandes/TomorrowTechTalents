package oop2Class3.model;

import java.util.List;

public class Movie extends Product{
    private String genre;
    private List<String> directors;
    private List<String> producers;
    private String studio;

    public Movie(String name, double price, String genre, List<String> directors, List<String> producers, String studio) {
        super(name, price, ProductType.MOVIE);
        this.genre = genre;
        this.directors = directors;
        this.producers = producers;
        this.studio = studio;
    }

    public String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getDirectors() {
        return directors;
    }

    private void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    public List<String> getProducers() {
        return producers;
    }

    private void setProducers(List<String> producers) {
        this.producers = producers;
    }

    public String getStudio() {
        return studio;
    }

    private void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public void update(Product product) {
        if(product instanceof Movie) {
            setName(product.getName());
            setPrice(product.getPrice());
            setGenre(((Movie) product).getGenre());
            setDirectors(((Movie) product).getDirectors());
            setProducers(((Movie) product).getProducers());
            setStudio(((Movie) product).getStudio());
        }
    }

    @Override
    public void productInfo() {
        System.out.printf("""
                Movie name: %s
                ID: %d
                Genre: %s
                Directors: %s
                Producers: %s
                Studio: %s
                Price: $%.2f
                """,
                getName(),getId(),getGenre(),getDirectors().toString(),getProducers().toString(),getStudio(),getPrice());
    }
}
