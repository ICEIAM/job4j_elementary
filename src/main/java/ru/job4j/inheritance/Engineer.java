package ru.job4j.inheritance;

public class Engineer extends Profession {
    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        public String EngineerMakes(MachineName) {
            return "Инженер " + getName() + "создает машину " + MachineName.getName();
        }
    }
}
