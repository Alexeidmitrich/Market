package market;

import java.util.ArrayList;
import java.util.List;

public class Market {

    String title;
    String address;
    Director director;
    List<Employee> employeeList = new ArrayList<>();
    List<Magazin> magazinList = new ArrayList<>();
    List<Book> bookList = new ArrayList<>();

    public Market(String title, String address, Director director){
        this. title  = title;
        this.address = address;
        this.director = director;
    }

    public void addEmployee(int number, String name, String family){
        Employee employee = new Employee(number, name, family);
        employeeList.add(employee);
    }

    public void printAllEmployees() {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee result = employeeList.get(i);
            result.printInformation();
        }
    }

    public void whoIsDirector(){
        director.printInformation();
    }

    public void info(){
        System.out.println(title + " " + address);
    }

    public static void main(String[] args) {
        Director director = new Director("Aleks", "Adamov");
        Market a = new Market("BookShop","St. Petersburg",director);
        a.info();
        a.addEmployee(1,"Svetlana", "Fedorova");
        a.whoIsDirector();
    }
}
