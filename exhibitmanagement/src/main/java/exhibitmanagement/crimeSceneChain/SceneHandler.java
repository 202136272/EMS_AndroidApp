package exhibitmanagement.crimeSceneChain;

import exhibitmanagement.domain.Department;

/**
 * Created by Bonga on 4/1/2016.
 */
public abstract class SceneHandler {
    SceneHandler successor;
    public void setSuccessor (SceneHandler successor){
        this.successor = successor;
    }
    public abstract boolean handleRequest(String request);
}
