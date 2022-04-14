import armor.Armor;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ConfigLoader {
    // Load config.json int the static fields of classes
    private static final String TITAN_CONFIG_OBJ = "titansConfig";
    private static final String ARMORED_TITAN_NAME = "ArmoredTitan";
    private static final String TITAN_HP_OBJ = "hp";
    private static final String TITAN_ARMOR_OBJ = "armor";
    public static final String TITAN_ARMOR_DURABILITY = "durability";
    public static final String TITAN_ARMOR_K = "k";

    public static float getHp(String organ)
    {
        if(organ != null && !organ.equals(""))
        {
            JSONObject organDetail = getOrgan(organ);
            return Float.valueOf(String.valueOf(organDetail.get(TITAN_HP_OBJ)));
        }
        return -1;
    }
    public static double[] getArmor(String organ)
    {
        if(organ != null && !organ.equals(""))
        {
            JSONObject organDetail = getOrgan(organ);
            JSONObject armorDetail = (JSONObject) organDetail.get(TITAN_ARMOR_OBJ);
            double[] details = new double[2];
            details[0] = Double.valueOf(armorDetail.get(TITAN_ARMOR_DURABILITY).toString());
            details[1] = Double.valueOf(armorDetail.get(TITAN_ARMOR_K).toString());
            return details;
        }
        return null;
    }
    private static JSONObject getOrgan(String organ)
    {
        JSONParser parser = new JSONParser();
        try
        {
            Object obj = parser.parse(new FileReader("/usr/local/Projects/ReinerAndTheJava/src/main/java/config.json"));
            JSONObject titanConfig = (JSONObject) ((JSONObject) obj).get(TITAN_CONFIG_OBJ);
            JSONObject armoredTitan = (JSONObject)titanConfig.get(ARMORED_TITAN_NAME);
            return (JSONObject) armoredTitan.get(organ);
        }catch (Exception e)
        {
            System.out.println(e.toString());
        }
        return null;
    }
}
