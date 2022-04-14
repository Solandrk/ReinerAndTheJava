package armor;

import interfaces.Damageable;

public abstract class Armor implements Damageable {
    protected double durability;
    protected double k;
    protected double amDamage;
    protected double trueForce; /** trueForce --> in motaghaye baraie senario astefade mishavad ke damagi be organ dar sorat vojod armor vared nashavad*/
    public Armor(double durability, double k) {
        this.durability = durability;
        this.k = k;
    }

    public double getDurability() {
        return durability;
    }

    public double getK() {
        return k;
    }

    public void setDurability(double durability)
    {
        this.durability = durability;
    }
    public void setK(double k)
    {
        this.k = k;
    }
    public double getTrueForce()
    {
        return trueForce;
    }
    @Override
    public boolean takeDamage(double force) {
        /** amDamage --> har bar force be armor vared shavad. baghimandeye force bar k (force % k) be amDamage miresad .
           va in meghdar dar force bardi ke be
           armor vard mishavad azafe mishavad
         */
        durability -= (force +amDamage)/k;
        amDamage = force % k;
        if(durability < 0)
            trueForce = Math.abs(durability) * k;
        return (durability <= 0);
    }

    @Override
    public String toString()
    {
        return " durability : " + durability + "\t K : "+ k + "\n";
    }

    public boolean isExist()
    {
        if (durability >= 0)
            return  true;
        else return false;
    }
}
