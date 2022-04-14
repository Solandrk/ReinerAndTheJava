package armor;

public class ArmArmor extends Armor {

    private ArmArmor(double durability, double k) {
        super(durability, k);
    }
    
    public static ArmArmor create(double durability,double k) {
        return new ArmArmor(durability, k);
    }
}
