package exhibitmanagement.crimeSceneChain;

import exhibitmanagement.domain.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Bonga on 4/1/2016.
 */
public class BiologyHandler extends SceneHandler {

    @Override
    public boolean handleRequest(String request) {

        if(Samples.getBiology().contains(request)){
            System.out.println("Send to Biology LAB.");
            return true;
        } else{
            System.out.println("NOT Biology, next handler.");
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
        return false;
    }
}
