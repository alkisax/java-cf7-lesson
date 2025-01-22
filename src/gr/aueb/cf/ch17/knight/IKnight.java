package gr.aueb.cf.ch17.knight;

public interface IKnight {

    IMission[] missions = {
        new KillTheDragonMission(),
        new SaveThePrincessMission(),
        new KillTheDragonMission()
    };

    //εδω υπονοεί μπορεί να περάσει λαμδα
    void embarkOnMission(IMission mission);
}
