package organ;

import armor.LegArmor;

public class LegOrgan extends Organ {
    public static final String ORGAN_NAME = "leg";

    private LegOrgan(double hp,double[] details) {
        super(hp, LegArmor.create(details[0],details[1]));
    }

    public static LegOrgan create(double hp,double[] details) {
        return new LegOrgan(hp,details);
    }
}
