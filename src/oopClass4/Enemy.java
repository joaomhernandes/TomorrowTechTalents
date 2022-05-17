package oopClass4;

public class Enemy extends Character{
    EnemyType type = EnemyType.NORMAL;


    public Enemy(String name) {
        super(name);
        this.setHelthPoints(RANDOM.nextInt(500) + 501);
    }

    public EnemyType getType() {
        return type;
    }

    public void setType(EnemyType type) {
        this.type = type;
    }

    @Override
    public void performAttack(Character character) {
        if(!isDead()){
            character.receiveAttack(this, this.type.getAttack());
        }else {
            System.out.println(getName() + " is dead.");
        }
    }

    @Override
    public void receiveAttack(Character character, Attack attack) {
        if(!isDead()){
            if(attack.getType().toString().equals(this.type.getWeakness())){
                System.out.println(character.getName() + " dealt " + attack.getAmountDamage()*2 + " damage to " + this.getName() );
                Attack superEfectiveAtack = new Attack(attack.getAmountDamage()*2,attack.getType());
                takeDamage(superEfectiveAtack);
            }else{
                super.receiveAttack(character, attack);
            }
        }else{
            System.out.println(getName() + " is dead... Why are you attacking him??");
        }
    }

    @Override
    public void interact() {
        System.out.println("Why would I answer my enemy???");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Attack: " + getType().getAttack().getAmountDamage() +
                " " + getType().getAttack().getType()+ "\n" ;
    }
}
