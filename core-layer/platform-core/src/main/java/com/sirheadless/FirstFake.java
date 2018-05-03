package models;

public class FirstFake {

    private final Long id;
    private final String name;

    public FirstFake(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
