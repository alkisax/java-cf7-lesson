package gr.aueb.cf.ch17.knight;

//@FunctionalInterface
public interface IMission {

    MissionStatus getStatus();

    void setStatus(MissionStatus missionStatus);

    void embark();
}
