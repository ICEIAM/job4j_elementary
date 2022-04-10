package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String construction;

    public Engineer(String name, String surname, String education, String birthday, String construction) {
        super(name, surname, education, birthday);
        this.construction = construction;
    }

    public Construction build(Construction construction) {
        return construction;
    }
}
