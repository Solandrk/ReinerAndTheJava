package organ;

import armor.NeckArmor;

public class NeckOrgan extends Organ {
    public static final String ORGAN_NAME = "neck";

    private NeckOrgan(double hp,double[] details) {
        super(hp, NeckArmor.create(details[0], details[1]));
    }

    public static NeckOrgan create(double hp,double[] details) {
        return new NeckOrgan(hp,details);
    }
}
