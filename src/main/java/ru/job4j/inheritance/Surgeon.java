package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String operation;

    public Surgeon(String name, String surname, String education, String birthday, String diagnosis) {
        super(name, surname, education, birthday, diagnosis);
        this.operation = operation;
    }

    public Operation savePerson(Operation operation) {
        return operation;
    }
}
