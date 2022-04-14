package titans;

import organ.*;

public class ArmoredTitan {

    private FaceOrgan faceOrgan;
    private NeckOrgan neckOrgan;
    private ArmOrgan rightArmOrgan;
    private ArmOrgan leftArmOrgan;
    private ChestOrgan chestOrgan;
    private StomachOrgan stomachOrgan;
    private LegOrgan rightLegOrgan;
    private LegOrgan leftLegOrgan;
    private FootOrgan rightFootOrgan;
    private FootOrgan leftFootOrgan;
    private ArmoredTitan(
            FaceOrgan faceOrgan,
            NeckOrgan neckOrgan,
            ArmOrgan rightArmOrgan,
            ArmOrgan leftArmOrgan,
            ChestOrgan chestOrgan,
            StomachOrgan stomachOrgan,
            LegOrgan rightLegArmor,
            LegOrgan leftLegArmor,
            FootOrgan rightFootOrgan,
            FootOrgan leftFootOrgan) {
        this.faceOrgan = faceOrgan;
        this.neckOrgan = neckOrgan;
        this.rightArmOrgan = rightArmOrgan;
        this.leftArmOrgan = leftArmOrgan;
        this.chestOrgan = chestOrgan;
        this.stomachOrgan = stomachOrgan;
        this.rightLegOrgan = rightLegArmor;
        this.leftLegOrgan = leftLegArmor;
        this.rightFootOrgan = rightFootOrgan;
        this.leftFootOrgan = leftFootOrgan;
    }


    public FaceOrgan getFaceOrgan() {
        return faceOrgan;
    }

    public NeckOrgan getNeckOrgan() {
        return neckOrgan;
    }

    public ArmOrgan getRightArmOrgan() {
        return rightArmOrgan;
    }

    public ArmOrgan getLeftArmOrgan() {
        return leftArmOrgan;
    }

    public ChestOrgan getChestOrgan() {
        return chestOrgan;
    }

    public StomachOrgan getStomachOrgan() {
        return stomachOrgan;
    }

    public LegOrgan getRightLegOrgan() {
        return rightLegOrgan;
    }

    public LegOrgan getLeftLegOrgan() {
        return leftLegOrgan;
    }

    public FootOrgan getRightFootOrgan() {
        return rightFootOrgan;
    }

    public FootOrgan getLeftFootOrgan() {
        return leftFootOrgan;
    }

    public void setFaceOrgan(FaceOrgan faceOrgan) {
        this.faceOrgan = faceOrgan;
    }

    private void setNeckOrgan(NeckOrgan neckOrgan) {
        this.neckOrgan = neckOrgan;
    }

    private void setRightArmOrgan(ArmOrgan rightArmOrgan) {
        this.rightArmOrgan = rightArmOrgan;
    }

    private void setLeftArmOrgan(ArmOrgan leftArmOrgan) {
        this.leftArmOrgan = leftArmOrgan;
    }

    private void setChestOrgan(ChestOrgan chestOrgan) {
        this.chestOrgan = chestOrgan;
    }

    private void setStomachOrgan(StomachOrgan stomachOrgan) {
        this.stomachOrgan = stomachOrgan;
    }

    private void setRightLegOrgan(LegOrgan rightLegOrgan) {
        this.rightLegOrgan = rightLegOrgan;
    }

    private void setLeftLegOrgan(LegOrgan leftLegOrgan) {
        this.leftLegOrgan = leftLegOrgan;
    }

    private void setRightFootOrgan(FootOrgan rightFootOrgan) {
        this.rightFootOrgan = rightFootOrgan;
    }

    private void setLeftFootOrgan(FootOrgan leftFootOrgan) {
        this.leftFootOrgan = leftFootOrgan;
    }


    private int titanCondition()
    {
        return  faceOrgan.isDestroyed() + neckOrgan.isDestroyed() + leftArmOrgan.isDestroyed() + rightArmOrgan.isDestroyed()
                + chestOrgan.isDestroyed() + stomachOrgan.isDestroyed() + rightLegOrgan.isDestroyed() + leftLegOrgan.isDestroyed()+
                rightFootOrgan.isDestroyed() + leftFootOrgan.isDestroyed();
    }

    public static ArmoredTitan create(FaceOrgan faceOrgan,
                                      NeckOrgan neckOrgan,
                                      ArmOrgan rightArmOrgan,
                                      ArmOrgan leftArmOrgan,
                                      ChestOrgan chestOrgan,
                                      StomachOrgan stomachOrgan,
                                      LegOrgan rightLegArmor,
                                      LegOrgan leftLegArmor,
                                      FootOrgan rightFootOrgan,
                                      FootOrgan leftFootOrgan) {
        return new ArmoredTitan(
                faceOrgan,
                neckOrgan,
                rightArmOrgan,
                leftArmOrgan,
                chestOrgan,
                stomachOrgan,
                rightLegArmor,
                leftLegArmor,
                rightFootOrgan,
                leftFootOrgan);
    }
    @Override
    public String toString()
    {
        return "Face Organ : "+faceOrgan+
                "Neck Organ : " + neckOrgan +
                "Right Arm Organ : " + rightArmOrgan +
                "Left Arm Organ : " + leftArmOrgan +
                "Chest Organ : " + chestOrgan +
                "Stomach Organ : " + stomachOrgan +
                "Right Leg Organ : " + rightLegOrgan +
                "Left Leg Organ : " + leftLegOrgan +
                "Right Food : " + rightFootOrgan +
                "Left Food : " + leftFootOrgan;
     }

    public boolean isAlive() {
        if (titanCondition() >= 4)
        {
            return false;
        }else return true;
    }
}
