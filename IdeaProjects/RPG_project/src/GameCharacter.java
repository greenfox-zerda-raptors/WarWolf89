/**
 * Created by almasics on 2016.12.08..
 */
public class GameCharacter extends GameObject {


    int health;
    int damage;
    boolean isAlive = true;

    public GameCharacter(String filename, int posX, int posY, int health, int damage, boolean isAlive) {
        super(filename, posX, posY);
        this.posX = posX;
        this.posY = posY;
        this.health = health;
        this.damage = damage;
        this.isAlive = isAlive;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
