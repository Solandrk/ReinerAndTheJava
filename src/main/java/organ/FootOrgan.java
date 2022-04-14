package organ;

import armor.FootArmor;

public class FootOrgan extends Organ{
    public static final String ORGAN_NAME = "foot";

    private FootOrgan(double hp,double[] details) {
        super(hp, FootArmor.create(details[0],details[1]));
    }

    public static FootOrgan create(double hp,double[] details) {
        return new FootOrgan(hp,details);
    }
}
