package oopClass4;

public class Attack {
    private int amountDamage;
    private DamageType type;

    public Attack(int amountDamage, DamageType type) {
        this.amountDamage = amountDamage;
        this.type = type;
    }

    public int getAmountDamage() {
        return amountDamage;
    }

    public DamageType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Attack{" +
                "amountDamage=" + amountDamage +
                ", type=" + type +
                '}';
    }
}
