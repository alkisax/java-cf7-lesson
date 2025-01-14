package gr.aueb.cf.ch14.services;

/*
Ayt;h η κλάση θα επιτρέπει μόνο ένα Instance
 */
public class CodingFactorySingleton {
    //static πεδιο και οχι μεθοδοσ
    // eager (!=lasy) tο ινστανσ διμιουργιτε με το που εμφανιζετε η κλαση δεν χρειαζετε να καλεστει
    private static final CodingFactorySingleton INSTANCE = new CodingFactorySingleton();

    /* einai private giati ftiaxno factory
     */
    private CodingFactorySingleton(){
    }

    /*
    to INSTANCE einai final. oses forew kai na kaleste;i h getInstance θα επιστρέφει πάντω το ιδιο Instance
     */
    public static  CodingFactorySingleton getInstance() {
        return INSTANCE;
    }

    // allh asxeth methodos
    public void sayHello() {
        System.out.println("Hello");
    }
}
