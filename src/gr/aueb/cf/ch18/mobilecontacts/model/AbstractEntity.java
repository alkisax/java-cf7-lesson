package gr.aueb.cf.ch18.mobilecontacts.model;

public class AbstractEntity {
    private Long id;

    public AbstractEntity(){}

    public Long getId() {
        return id;
    }

    public AbstractEntity(Long id) {
        this.id = id;
    }
}
