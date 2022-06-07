package oop2Class3.model;

import java.util.List;

public class MusicAlbum extends Product{
    private String genre;
    private List<String> musisians;
    private List<String> stamps;

    public MusicAlbum(String name, double price, String genre, List<String> musisians, List<String> stamps) {
        super(name, price, ProductType.MUSIC_ALBUM);
        this.genre = genre;
        this.musisians = musisians;
        this.stamps = stamps;
    }

    public String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getMusisians() {
        return musisians;
    }

    private void setMusisians(List<String> musisians) {
        this.musisians = musisians;
    }

    public List<String> getStamps() {
        return stamps;
    }

    private void setStamps(List<String> stamps) {
        this.stamps = stamps;
    }

    @Override
    public void update(Product product) {
        if(product instanceof MusicAlbum){
            setName(product.getName());
            setPrice(product.getPrice());
            setGenre(((MusicAlbum) product).getGenre());
            setMusisians(((MusicAlbum) product).getMusisians());
            setStamps(((MusicAlbum) product).getStamps());
        }
    }

    @Override
    public void productInfo() {
        System.out.printf("""
                Album name: %s
                ID: %d
                Genre: %s
                Musisians/Bands: %s
                Stamps: %s
                Price: $%.2f
                """,
                getName(),getId(),getGenre(),getMusisians().toString(),getStamps().toString(),getPrice());
    }
}
