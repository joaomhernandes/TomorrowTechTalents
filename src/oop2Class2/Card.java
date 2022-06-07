package oop2Class2;

public abstract class Card {
    private String name;
    private CardType type;
    private int cost;
    private boolean flipped = false;

    public String getName() {
        return name;
    }

    public String getType() {
        return type.getDescription();
    }

    public int getCost() {
        return cost;
    }

    public boolean isFlipped() {
        return flipped;
    }

    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    public Card(String name, CardType type, int cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }
    public abstract void flipCard();

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", cost=" + cost +
                ", flipped=" + flipped +
                '}';
    }
}
