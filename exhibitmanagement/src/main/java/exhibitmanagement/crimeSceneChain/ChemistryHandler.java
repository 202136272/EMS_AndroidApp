package exhibitmanagement.crimeSceneChain;

/**
 * Created by Bonga on 4/2/2016.
 */
public class ChemistryHandler extends SceneHandler {

    @Override
    public boolean handleRequest(String request) {

        if (Samples.getChemistry().contains(request)) {
            System.out.println("Send to Chemistry LAB.");
            return true;
        } else {
            System.out.println("NOT Chemistry, next handler.");
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
        return false;
    }
}