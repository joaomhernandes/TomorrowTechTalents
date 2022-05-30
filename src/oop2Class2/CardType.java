package oop2Class2;

public enum CardType {
    ATTACK("attack"),
    SPECIAL_ATTACK("special attack");

    private final String description;

    CardType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
