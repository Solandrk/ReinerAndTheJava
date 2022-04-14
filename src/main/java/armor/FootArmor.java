package armor;

public class FootArmor extends Armor {
    private FootArmor(double durability, double k) {
        super(durability, k);
    }

    public static FootArmor create(double durability,double k) {
        return new FootArmor(durability, k);
    }
}
