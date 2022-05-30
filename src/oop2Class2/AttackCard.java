package oop2Class2;

public class AttackCard extends Card implements IAttack{
    private int attackPower;
    private int resistence;


    public AttackCard(String name, CardType type, int cost, int attackPower, int resistence) {
        super(name, type, cost);
        this.attackPower = attackPower;
        this.resistence = resistence;
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
    public void flipCard(){
        if(!isFlipped()){
            setFlipped(true);
        }else{
            System.out.println(getCost() + " can't attack this turn, wait for the next turn.");
        }
    }
}
