package exhibitmanagement.crimeSceneChain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bonga on 4/1/2016.
 */
public class Samples {

    public static List<String> getBallistic(){
        List<String> ballistic = new ArrayList();

        ballistic.add("FIREARM");

        ballistic.add("AMUNITION");
        ballistic.add("CATRIGES");

        return ballistic;
    }

    public static List<String> getBiology(){
        List<String> biology = new ArrayList();

        biology.add("BLOOD");
        biology.add("SWAPS");

        return biology;
    }
    public static List<String> getChemistry(){
        List<String> biology = new ArrayList();

        biology.add("TABLETS");
        biology.add("POUDER");
        biology.add("CRYSTALS");
        biology.add("PLANT MATERIALS");
        return biology;
    }
}
