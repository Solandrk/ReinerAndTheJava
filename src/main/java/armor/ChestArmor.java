package armor;

public class ChestArmor extends Armor {
    private ChestArmor(double durability, double k) {
        super(durability, k);
    }

    public static ChestArmor create(double durability,double k) {
        return new ChestArmor(durability, k);
    }
}
