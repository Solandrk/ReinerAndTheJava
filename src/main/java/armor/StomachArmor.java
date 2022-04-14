package armor;

public class StomachArmor extends Armor {
    private StomachArmor(double durability, double k) {
        super(durability, k);
    }

    public static StomachArmor create(double durability,double k) {
        return new StomachArmor(durability, k);
    }
}
