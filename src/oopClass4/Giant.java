package oopClass4;

public class Giant extends Enemy{
    public Giant(String name) {
        super(name);
        super.type = EnemyType.GIANT;
    }
    @Override
    public void performAttack(Character character) {
        character.receiveAttack(this, this.type.getAttack());
        System.out.println( character.getName() + " is stunned");
    }

    @Override
    public void interact() {
        System.out.println("I'm sorry");
    }
}
