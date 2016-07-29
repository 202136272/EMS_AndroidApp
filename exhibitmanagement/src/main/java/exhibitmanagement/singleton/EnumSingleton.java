package exhibitmanagement.singleton;

/**
 * Created by Bonga on 4/2/2016.
 */
public class EnumSingleton {

    private static EnumSingleton INSTANCE;

    private String name; // Mandatory
    private Double age = null; // Not Mandatory

    private void build(SingletonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    // Static getter
    public static EnumSingleton getSingleton() {
        return INSTANCE;
    }

    public void print() {
        System.out.println("Name " + name + ", age: " + age);
    }


    public static class SingletonBuilder {

        private final String name; // Mandatory
        private Double age = null; // Not Mandatory

        private SingletonBuilder() {
            name = null;
        }

        SingletonBuilder(String name) {
            this.name = name;
        }

        public SingletonBuilder age(double age) {
            this.age = age;
            return this;
        }

        public void build() {
            EnumSingleton.INSTANCE.build(this);
        }

    }
}