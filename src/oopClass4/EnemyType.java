package oopClass4;

public enum EnemyType {
    NORMAL("generic",new Attack(10,DamageType.NORMAL),"none","Why would I answer my enemy???"),
    VAMPIRE("Vampire",new Attack(20,DamageType.PIERCING),"Piercing","What is a man?"),
    SNAKE("Snake", new Attack(10,DamageType.POISON),"Slam","If you light the flame, the curse ends."),
    GIANT("Giant",new Attack(25,DamageType.SLAM),"fire","I'm sorry");

    private final String type;
    private final Attack attack;
    private final String weakness;
    private final String interaction;

    EnemyType(String type, Attack attack,String weakness, String interaction) {
        this.type = type;
        this.attack = attack;
        this.weakness = weakness;
        this.interaction = interaction;
    }

    public String getType() {
        return type;
    }

    public Attack getAttack() {
        return attack;
    }

    public String getWeakness() {
        return weakness;
    }

    public String getInteraction() {
        return interaction;
    }
}

