package exhibitmanagement;

import exhibitmanagement.crimeSceneChain.BallisticHandler;
import exhibitmanagement.crimeSceneChain.BiologyHandler;
import exhibitmanagement.crimeSceneChain.ChemistryHandler;
import exhibitmanagement.crimeSceneChain.SceneHandler;

/**
 * Created by Bonga on 4/2/2016.
 */
public class IdentifyScene {

    public static void main( String args[]){

        SceneHandler ballisticHandler = new BallisticHandler();
        SceneHandler biology = new BiologyHandler();
        SceneHandler chemistry = new ChemistryHandler();

        ballisticHandler.setSuccessor(biology);
        biology.setSuccessor(chemistry);


        SceneHandler chain = ballisticHandler;
        boolean dept = chain.handleRequest("CRYhSTALS");

    }
}
