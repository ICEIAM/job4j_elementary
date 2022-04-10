package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String code;

    public Programmer(String name, String surname, String education, String birthday, String construction, String code) {
        super(name, surname, education, birthday, construction);
        this.code = code;
    }

    public Code type(Code code) {
        return code;
    }
}

