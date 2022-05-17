package oopClass4;

import java.util.Random;

public class Character implements Actions{
    final Random RANDOM = new Random();
    private String name;
    private Attack attack;
    private boolean dead = false;
    private int helthPoints;
    private int magicPoints;


    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int getHelthPoints() {
        return helthPoints;
    }

    public void setHelthPoints(int helthPoints) {
        this.helthPoints = helthPoints;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    @Override
    public void performAttack(Character character) {
        if(!isDead()){
            System.out.println(this.getName() + " dealt " + getAttack().getAmountDamage() + " damage to " + character.getName());
            character.receiveAttack(this, this.getAttack());
        }else {
            System.out.println(getName() + " is dead.");
        }
    }

    @Override
    public void performSpecialAttack(Character character) {
        System.out.println(this.getName() + " doesn't have a special attack");
    }

    @Override
    public void receiveAttack(Character character, Attack attack) {
        System.out.println(character.getName() + " dealt " + attack.getAmountDamage() + " damage to " + this.getName() );
        takeDamage(attack);
    }

    @Override
    public void interact() {
        System.out.println("...");
    }

    @Override
    public void takeDamage(Attack attack) {
        setHelthPoints(getHelthPoints()-attack.getAmountDamage());
        if (getHelthPoints()<=0){
            setDead(true);
            setHelthPoints(0);
        }

    }

    @Override
    public void useMagic(int amountMagicPoints) {
        setMagicPoints(getMagicPoints()-amountMagicPoints);
    }

    @Override
    public String toString() {
        return  "Name: " + getName() + "\n" +
                "HP: " + getHelthPoints() +"\n" +
                "MP: " + getMagicPoints() +"\n" +
                (isDead()?"Dead" : "Alive");
    }
}
