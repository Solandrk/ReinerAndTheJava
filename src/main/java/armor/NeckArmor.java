package armor;

public class NeckArmor extends Armor {
    private NeckArmor(double durability, double k) {
        super(durability, k);
    }

    public static NeckArmor create(double durability,double k) {
        return new NeckArmor(durability, k);
    }
}
