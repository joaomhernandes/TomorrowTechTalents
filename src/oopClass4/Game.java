package oopClass4;

public class Game {
    public static void main(String[] args) {
        Player joao = new Player("João");
        Vampire dracula = new Vampire("Drácula");
        Giant giant = new Giant("Alexandre o grande");
        Snake snake = new Snake("Anaconda");
        Enemy enemy = new Enemy("Peão 1");

        joao.interact();
        dracula.interact();
        giant.interact();
        snake.interact();
        enemy.interact();
        System.out.println(joao);
        System.out.println(dracula);
        System.out.println(giant);
        System.out.println(snake);
        System.out.println(enemy);

        joao.performAttack(dracula);
        joao.performSpecialAttack(dracula);
        giant.performAttack(joao);
        snake.performAttack(enemy);
        snake.performAttack(joao);

        System.out.println(joao);
        System.out.println(dracula);
        System.out.println(giant);
        System.out.println(snake);
        System.out.println(enemy);

        joao.takeHelthPotion();
        joao.takeMagicPotion();
        System.out.println(joao);



    }
}
