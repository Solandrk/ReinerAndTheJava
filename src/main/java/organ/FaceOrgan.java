package organ;
import armor.FaceArmor;

public class FaceOrgan extends Organ {

    public static final String ORGAN_NAME = "face";

    private FaceOrgan(double hp,double[] details) {
        super(hp, FaceArmor.create(details[0],details[1]));
    }

    public static FaceOrgan create(double hp,double[] details) {

        return new FaceOrgan(hp,details);

    }
}
