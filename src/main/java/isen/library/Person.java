package isen.library;

public class Person {
    private String name;

    private int years;

    public Person() {
        this.name = "unknown";
        this.years = 0;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
