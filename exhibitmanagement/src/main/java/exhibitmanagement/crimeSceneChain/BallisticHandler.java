package exhibitmanagement.crimeSceneChain;

import exhibitmanagement.domain.Department;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Bonga on 4/2/2016.
 */
public class BallisticHandler extends SceneHandler{
    @Override
    public boolean handleRequest(String request) {

        if(Samples.getBallistic().contains(request)){
            System.out.println("Send to Ballistics LAB");
            return true;
        } else{
            System.out.println("NOT Ballistics, next handler.");
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
        return false;
    }
}
