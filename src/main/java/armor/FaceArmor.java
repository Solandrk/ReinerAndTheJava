package armor;

public class FaceArmor extends Armor {
    private FaceArmor(double durability, double k) {
        super(durability, k);
    }

    public static FaceArmor create(double durability,double k) {
        return new FaceArmor(durability, k);
    }
}
