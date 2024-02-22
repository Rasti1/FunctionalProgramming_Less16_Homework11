package project.entity;

public class User {
    private final String name;
    private final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Info: Name: " + name
                + ", " + "number: " + number;
    }
}
