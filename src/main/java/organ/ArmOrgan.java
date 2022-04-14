package organ;

import armor.ArmArmor;

public class ArmOrgan extends Organ {

    public static final String ORGAN_NAME = "arm";

    private ArmOrgan(double hp,double[] details) {
        super(hp, ArmArmor.create(details[0],details[1]));
    }
    
    public static ArmOrgan create(double hp,double[] details) {
        return new ArmOrgan(hp,details);
    }
}
