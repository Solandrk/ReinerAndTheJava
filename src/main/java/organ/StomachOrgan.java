package organ;

import armor.StomachArmor;

public class StomachOrgan extends Organ {

    public static final String ORGAN_NAME = "stomach";

    private StomachOrgan(double hp,double[] details) {
        super(hp, StomachArmor.create(details[0],details[1]));
    }

    public static StomachOrgan create(double hp,double[] details) {
        return new StomachOrgan(hp,details);
    }
}
