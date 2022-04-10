package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String scheme;

    public Builder(String name, String surname, String education, String birthday, String construction, String scheme) {
        super(name, surname, education, birthday, construction);
        this.scheme = scheme;
    }

    public Scheme make(Scheme scheme) {
        return scheme;
    }
}
