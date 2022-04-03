package market;

public class Employee extends Person{

    public Employee(int number, String name, String family) {
        super(number, name, family);
    }

    public void printInformation(){
        System.out.println(getNumber()  + " " + getName() + " " + getFamily());
    }
}
