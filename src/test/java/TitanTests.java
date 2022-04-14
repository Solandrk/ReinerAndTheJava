import org.junit.jupiter.api.Test;
import organ.*;
import titans.ArmoredTitan;

import static org.junit.jupiter.api.Assertions.*;

public class TitanTests {
    public static final int SCENARIO_N = 1;
    // TODOg

    @Test
    public void printArmoredTitanDetail() {
      String t = createTitan().toString();
      System.out.println(t);
      assertNotNull(t);
    }
    /** Print and Test organ damage Test*/
    @Test
    public void takeOrganDamageTest(){
        ArmoredTitan titan = createTitan();
        System.out.println(titan.getFaceOrgan());
        assertEquals(false,titan.getFaceOrgan().takeDamage(30));
        System.out.println(titan.getFaceOrgan());
        assertEquals(true,titan.getFaceOrgan().takeDamage(60));
        System.out.println(titan.getFaceOrgan());
    }
    @Test
    public void takeArmorDamageTest(){

        ArmoredTitan titan = createTitan();

        System.out.println(titan.getFaceOrgan().getArmor());
        titan.getFaceOrgan().takeDamage(1300);
        System.out.println(titan.getFaceOrgan().getArmor());
        assertEquals(false,titan.getFaceOrgan().getArmor().isExist());

        System.out.println(titan.getChestOrgan().getArmor());
        titan.getChestOrgan().takeDamage(600);
        System.out.println(titan.getChestOrgan().getArmor());
        assertEquals(true,titan.getChestOrgan().getArmor().isExist());

    }

    @Test
    public void checkHp() {
        ArmoredTitan titan = createTitan();
        assertEquals(55,titan.getLeftLegOrgan().getHp());
        assertEquals(55,titan.getRightLegOrgan().getHp());
        assertEquals(210,titan.getChestOrgan().getHp());
    }

    @Test
    public void checkDurability() {
        ArmoredTitan titan = createTitan();
        assertEquals(110,titan.getLeftLegOrgan().getArmor().getDurability());
        assertEquals(110,titan.getRightLegOrgan().getArmor().getDurability());
        assertEquals(115,titan.getChestOrgan().getArmor().getDurability());
    }


    @Test
    public void checkK() {
        ArmoredTitan titan = createTitan();
        assertEquals(12.0,titan.getLeftLegOrgan().getArmor().getK());
        assertEquals(2.1,titan.getNeckOrgan().getArmor().getK());
        assertEquals(12.2,titan.getChestOrgan().getArmor().getK());
    }

    /** Agar 4 organ Titan nabod shavad titan mimirad*/
    @Test
    public void isTitanAlive() {
        ArmoredTitan titan = createTitan();
        assertEquals(true,titan.isAlive());
        titan.getChestOrgan().takeDamage(2000);
        System.out.println(titan.getChestOrgan());

        titan.getLeftLegOrgan().takeDamage(150);
        System.out.println(titan.getLeftLegOrgan());

        titan.getNeckOrgan().takeDamage(100);
        System.out.println(titan.getNeckOrgan());

        assertEquals(true,titan.isAlive());

        titan.getRightLegOrgan().takeDamage(150);
        System.out.println(titan.getRightLegOrgan());

        assertEquals(false,titan.isAlive());

    }

    private ArmoredTitan createTitan() {
        return ArmoredTitan.create(
                FaceOrgan.create(ConfigLoader.getHp(FaceOrgan.ORGAN_NAME),ConfigLoader.getArmor(NeckOrgan.ORGAN_NAME)),
                NeckOrgan.create(ConfigLoader.getHp(NeckOrgan.ORGAN_NAME),ConfigLoader.getArmor(NeckOrgan.ORGAN_NAME)),
                ArmOrgan.create(ConfigLoader.getHp(ArmOrgan.ORGAN_NAME),ConfigLoader.getArmor(ArmOrgan.ORGAN_NAME)),
                ArmOrgan.create(ConfigLoader.getHp(ArmOrgan.ORGAN_NAME),ConfigLoader.getArmor(ArmOrgan.ORGAN_NAME)),
                ChestOrgan.create(ConfigLoader.getHp(ChestOrgan.ORGAN_NAME),ConfigLoader.getArmor(ChestOrgan.ORGAN_NAME)),
                StomachOrgan.create(ConfigLoader.getHp(StomachOrgan.ORGAN_NAME),ConfigLoader.getArmor(StomachOrgan.ORGAN_NAME)),
                LegOrgan.create(ConfigLoader.getHp(LegOrgan.ORGAN_NAME),ConfigLoader.getArmor(LegOrgan.ORGAN_NAME)),
                LegOrgan.create(ConfigLoader.getHp(LegOrgan.ORGAN_NAME),ConfigLoader.getArmor(LegOrgan.ORGAN_NAME)),
                FootOrgan.create(ConfigLoader.getHp(FootOrgan.ORGAN_NAME),ConfigLoader.getArmor(FootOrgan.ORGAN_NAME)),
                FootOrgan.create(ConfigLoader.getHp(FootOrgan.ORGAN_NAME),ConfigLoader.getArmor(FootOrgan.ORGAN_NAME)));
    }

}

