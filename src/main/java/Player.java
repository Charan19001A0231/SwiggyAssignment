import java.util.Random;
public class Player {
    int health;
    int strength;
    int attack;
    Random random;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }

    int getHealth() {
        return health;
    }

    int attack() {

        int res=random.nextInt(6)+1;
        return res; // 6-sided die Roll
    }

    int defend() {

        int res=random.nextInt(6)+1;
        return res; // 6-sided die Roll
    }

    void reduceHealth(int damage) {
        health -= damage;
    }

    boolean isAlive() {
        return health > 0;
    }
}
