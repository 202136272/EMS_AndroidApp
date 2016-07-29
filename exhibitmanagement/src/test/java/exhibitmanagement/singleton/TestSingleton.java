package exhibitmanagement.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Bonga on 4/2/2016.
 */
public class TestSingleton {

    private SingletonAdminManager singletonAdmin;
    private SingletonAdminManager singletonAdminCopy;
    @Before
    public void setUp() throws Exception {

        singletonAdmin = SingletonAdminManager.getInstance();
        singletonAdmin.setName("James");
        singletonAdmin.setAge(35);
        singletonAdmin.setPersalNumber(11);

        singletonAdminCopy = SingletonAdminManager.getInstance();
        singletonAdmin.setName("Marks");
        singletonAdmin.setAge(30);
        singletonAdmin.setPersalNumber(12);

    }

    @Test
    public void ObjectEquality() throws Exception {
        Assert.assertEquals(singletonAdminCopy, singletonAdmin);
    }

    @Test
    public void DataEquality() throws Exception {
        Assert.assertEquals(singletonAdminCopy.getName(), singletonAdmin.getName());
        Assert.assertEquals(singletonAdminCopy.getPersalNumber(), singletonAdmin.getPersalNumber());
        Assert.assertEquals(singletonAdminCopy.getAge(), singletonAdmin.getAge());

    }
}

