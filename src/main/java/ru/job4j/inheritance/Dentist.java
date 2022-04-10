package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String teeth;

    public Dentist(String name, String surname, String education, String birthday, String diagnosis) {
        super(name, surname, education, birthday, diagnosis);
        this.teeth = teeth;
    }

    public Teeth healTeeth(Teeth teeth) {
        return teeth;
    }
}
