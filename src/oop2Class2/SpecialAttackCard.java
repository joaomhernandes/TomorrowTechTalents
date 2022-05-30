package oop2Class2;

public class SpecialAttackCard extends Card implements ISpecialAttack{

    private int attackPower;
    private int resistence;
    private String specialAttackEffect;

    public SpecialAttackCard(String name, CardType type, int cost, int attackPower, int resistence, String specialAttackEffect) {
        super(name, type, cost);
        this.attackPower = attackPower;
        this.resistence = resistence;
        this.specialAttackEffect = specialAttackEffect;
    }

    @Override
    public String getSpecialAttackEffect() {
        return this.specialAttackEffect;
    }

    @Override
    public int getPowerAttack() {
        return this.attackPower;
    }

    @Override
    public int getResistance() {
        return this.resistence;
    }
    @Override
    public void flipCard() {
        if(!isFlipped()){
            setFlipped(true);
        }
    }

    public void performeSpecialAttack() {
        System.out.println(getSpecialAttackEffect());
    }
}
