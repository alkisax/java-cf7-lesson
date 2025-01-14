package gr.aueb.cf.ch14.services;

public class CodingFactoryLazy {
    private static CodingFactoryLazy INSTANCE = null;

    private CodingFactoryLazy(){

    }
// lazy instanciation
    public static CodingFactoryLazy getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new CodingFactoryLazy();
        }
        return INSTANCE;
    }

    // asxth methodos
    public void sayHello() {
        System.out.println("Hello!!");
    }
}
