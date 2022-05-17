package oopClass4;

public interface Actions {


    public void performAttack(Character character);
    public void performSpecialAttack(Character character);
    public void receiveAttack(Character character, Attack attack);
    public void interact();
    public void takeDamage(Attack attack);
    public void useMagic(int amountMagicPoints);


}
