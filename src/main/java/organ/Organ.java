package organ;

import armor.Armor;
import interfaces.Damageable;

public abstract class Organ implements Damageable {
    protected double hp;
    protected Armor armor;

    public Organ(double hp, Armor armor) {
        this.hp = hp;
        this.armor = armor;
    }

    public double getHp() {
        return hp;
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public boolean takeDamage(double force) {

        if(getArmor().getDurability() > 0)
        {
            hp -= (force * calcResist(getArmor().getDurability()))/100;
            armor.takeDamage(force);

        }else hp -= force;
        if(hp <= 0)
        {
            hp =0;
            return true;
        }
        return false;
    }

    private double calcResist(double x) {
        return 100 - x/2;
    }

    public int isDestroyed() {
        if(hp <= 0) return 1 ;
        else return 0;
    }
    @Override
    public String toString()
    {
        return "Hp : " + hp +" -- " + armor.toString();
    }
}
