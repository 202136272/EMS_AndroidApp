package exhibitmanagement.singleton;

/**
 * Created by Bonga on 4/2/2016.
 */
public class SingletonAdminManager implements Cloneable {
    private static volatile SingletonAdminManager soleInstance = null;

    private String name; // Mandatory
    private int age; // Not Mandatory
    private  int persalNumber;

    private SingletonAdminManager() {
        System.out.println("Creating..");

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPersalNumber() {
        return persalNumber;
    }

    public void setPersalNumber(int persalNumber) {
        this.persalNumber = persalNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static SingletonAdminManager getInstance() {
        //Double checked locking
        if (soleInstance == null) {//Check1
            synchronized(SingletonAdminManager.class) {
                if (soleInstance == null) {//check2
                    soleInstance = new SingletonAdminManager();
                }
            }
        }
        return soleInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}