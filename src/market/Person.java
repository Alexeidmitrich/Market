package market;

public class Person {
    private String name;
    private String family;
    private int number;

    public Person(int number, String name, String family) {
        this.name = name;
        this.family = family;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getNumber() {
        return number;
    }
}
