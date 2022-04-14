package armor;

public class LegArmor extends Armor {
    private LegArmor(double durability, double k) {
        super(durability, k);
    }

    public static LegArmor create(double durability,double k) {
        return new LegArmor(durability, k);
    }
}
