package oopClass4;

public class Vampire extends Enemy{
    public Vampire(String name) {
        super(name);
        super.type = EnemyType.VAMPIRE;
    }

    @Override
    public void performAttack(Character character) {
        character.receiveAttack(this, this.type.getAttack());
        System.out.println(character.getName() + " is bleeding");

    }

    @Override
    public void interact() {
        System.out.println("What is a man?");
    }
}
