package oopClass4;

public class Snake extends Enemy{
    public Snake(String name) {
        super(name);
        super.type = EnemyType.SNAKE;
    }

    @Override
    public void performAttack(Character character) {
        character.receiveAttack(this, this.type.getAttack());
        System.out.println( character.getName() + " is poisoned");
    }

    @Override
    public void interact() {
        System.out.println("If you light the flame, the curse ends.");
    }
}
