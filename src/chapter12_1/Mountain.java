package chapter12_1;

public class Mountain {
    private String name;
    private int feet;

    public Mountain(String name, int feet) {
        this.name = name;
        this.feet = feet;
    }

    public String getName() {
        return name;
    }

    public int getFeet() {
        return feet;
    }

    @Override
    public String toString() {
        return name + " " + feet;
    }
}