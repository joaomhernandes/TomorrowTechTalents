package oop2Class3.model;

public enum ProductType {
    BOOK("Book"),
    GAME("Game"),
    MOVIE("Movie"),
    MUSIC_ALBUM("Music Album"),
    TOY("Toy");

    final String type;

    ProductType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
