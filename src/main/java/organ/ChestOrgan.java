package organ;

import armor.ChestArmor;

public class ChestOrgan extends Organ {
    public static final String ORGAN_NAME = "chest";

    private ChestOrgan(double hp,double[] details) {
        super(hp, ChestArmor.create(details[0],details[1]));
    }

    public static ChestOrgan create(double hp,double[] details) {
        return new ChestOrgan(hp,details);
    }
}
