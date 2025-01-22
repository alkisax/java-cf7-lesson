package gr.aueb.cf.ch17.knight;

public class Main {
    public static void main(String[] args) {
//        Knight joa = new Knight();
//        Knight saintGeorge = new Knight();

        // η embarkOnMission παιρνει Imission που έιναι functional και αρα μπορουμε να περάσουμε λαμδα ως callback
//        joa.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//                System.out.println("save the princess");
//            }
//        });

//        saintGeorge.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//                System.out.println("kill the dragon");
//            }
//        });
//
//        saintGeorge.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//                killTheDragon();
//            }
//        });

//        saintGeorge.embarkOnMission(() -> killTheDragon());
//
//        saintGeorge.embarkOnMission(Main::killTheDragon);

    }

    public static void killTheDragon() {
        System.out.println("kill the dragon");
    }

    public static void saveThePrincess(){
        System.out.println("save the princess");
    }

}
