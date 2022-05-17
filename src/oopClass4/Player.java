package oopClass4;

import java.util.Random;

public class Player extends Character{
    private boolean poisoned = false;
    private boolean stunned = false;
    private boolean bleeding = false;
    private Attack savedAttack;
    private int[] turns = {3,1,3};



    public Player(String name) {
        super(name);
        setAttack(new Attack((RANDOM.nextInt(6)+1 + RANDOM.nextInt(6)+1), DamageType.NORMAL));
        super.setHelthPoints(RANDOM.nextInt(250) + 251);
        super.setMagicPoints(RANDOM.nextInt(100) + 101);
    }

    private void setSavedAttack(Attack savedAttack) {
        this.savedAttack = savedAttack;
    }

    private Attack getSavedAttack() {
        return this.savedAttack;
    }

    private boolean isPoisoned() {
        return poisoned;
    }

    private void setPoisoned(boolean poisoned) {
        this.poisoned = poisoned;
    }

    private boolean isStunned() {
        return stunned;
    }

    private void setStunned(boolean stunned) {
        this.stunned = stunned;
    }

    private boolean isBleeding() {
        return bleeding;
    }

    private void setBleeding(boolean bleeding) {
        this.bleeding = bleeding;
    }


    public Attack setSpecialAttack() {
        if(getMagicPoints() >= 20){
            setMagicPoints(getMagicPoints()-20);
            Attack specialAttack;
            int specialAttackType = RANDOM.nextInt(4)+1;
            switch (specialAttackType) {
                case 1 -> {
                    specialAttack = new Attack((RANDOM.nextInt(10) + 11), DamageType.PIERCING);
                    return specialAttack;
                }
                case 2 -> {
                    specialAttack = new Attack((RANDOM.nextInt(10) + 11), DamageType.SLAM);
                    return specialAttack;
                }
                case 3 -> {
                    specialAttack = new Attack((RANDOM.nextInt(10) + 11), DamageType.POISON);
                    return specialAttack;

                }
                case 4 -> {
                    specialAttack = new Attack((RANDOM.nextInt(10) + 11 ), DamageType.FIRE);
                    return specialAttack;
                }
                default -> {
                    specialAttack = new Attack(0,DamageType.NORMAL);
                    return specialAttack;
                }
            }
        }else{
            return new Attack(0,DamageType.NORMAL);
        }

    }

    @Override
    public void performAttack(Character character) {
        if(!isDead()) {
            if (getAttack().getAmountDamage() != 0) {
                character.receiveAttack(this, this.getAttack());
            }else {
                System.out.println(getName() + " is stunned and can't attack!");
            }
            poisoned();
            bleeding();
            stunned();
        }else {
            System.out.println(getName() + " is dead.");
        }
    }

    @Override
    public void performSpecialAttack(Character character) {
        if(!isDead()) {
            if (getAttack().getAmountDamage() != 0) {
                Attack specialAttack = setSpecialAttack();
                if (specialAttack.getAmountDamage() == 0){
                    System.out.println(this.getName() + " doesn't have enough magic points");
                    character.receiveAttack(this, specialAttack);
                }else{
                    System.out.println(this.getName() + " dealt " + specialAttack.getAmountDamage() + " damage to " + character.getName() );
                    character.takeDamage(specialAttack);
                    useMagic(20);
                }
            }else {
                System.out.println(getName() + " is stunned and can't attack!");
            }
            poisoned();
            bleeding();
            stunned();
        }else {
            System.out.println(getName() + " is dead.");
        }
    }

    @Override
    public void receiveAttack(Character character, Attack attack) {
        switch (attack.getType()) {
            case NORMAL -> {
                super.receiveAttack(character, attack);
            }
            case PIERCING -> {
                super.receiveAttack(character, attack);
                if(!isBleeding()){
                    setBleeding(true);
                }
            }
            case SLAM -> {
                super.receiveAttack(character, attack);
                if(!isStunned()){
                    setStunned(true);
                }
            }
            case POISON -> {
                super.receiveAttack(character, attack);
                if(!isPoisoned()){
                    setPoisoned(true);
                }
            }
        }
        super.receiveAttack(character, attack);

    }

    private void bleeding() {
        if (isBleeding() && turns[0]>=0){
            Attack bleedingDamage = new Attack(RANDOM.nextInt(10)+1,DamageType.PIERCING);
            System.out.println(this.getName() + " is poisoned and receives " + bleedingDamage.getAmountDamage() + " damage");
            turns[0]--;
            takeDamage(bleedingDamage);
        }else {
            turns[0] = 3;
        }
    }

    private void stunned() {
        if (isStunned() && turns[1] > 0) {
            if (RANDOM.nextInt(100) + 1 < 50) {
                setSavedAttack(getAttack());
                setAttack(new Attack(0,DamageType.NORMAL));
            }
            setAttack(getSavedAttack());
            turns[1]--;
        }else {
            turns[1] = 1;
        }
    }

    private void poisoned() {
        if (isPoisoned() && turns[2]>=0){
            Attack poisonDamage = new Attack(RANDOM.nextInt(6)+1,DamageType.POISON);
            System.out.println(this.getName() + " is poisoned and receives " + poisonDamage.getAmountDamage() + " damage");
            turns[2]--;
            takeDamage(poisonDamage);
        }else {
            turns[2] = 3;
        }
    }
    public void takeHelthPotion(){
        setHelthPoints(getHelthPoints() + RANDOM.nextInt(50)+26);
    }
    public void takeMagicPotion(){
        setMagicPoints(getMagicPoints() + RANDOM.nextInt(60)+41);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Attack: " + getAttack().getAmountDamage() +
                " " + getAttack().getType()+ "\n" +
                (isPoisoned()?"Poisoned\n":"")+
                (isBleeding()?"Bleeding\n":"")+
                (isStunned()?"Stunned\n":"");
    }
}
