package oopClass4;

public enum DamageType {
    NORMAL("Normal"),
    PIERCING("Piercing"),
    SLAM("Slam"),
    POISON("Poison"),
    FIRE("Fire")
    ;

    private final String TYPE;

    DamageType(String TYPE) {
        this.TYPE = TYPE;
    }

    @Override
    public String toString() {
        return TYPE ;
    }
}
