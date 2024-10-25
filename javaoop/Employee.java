package javaoop;
public class Employee {

    private String id;
    private String name;
    private double salary;

    Employee(){

    }

    Employee(String id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return this.salary;
    }
    public void seSalary(double salary){
        this.salary = salary;
    }

    public void ShowInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}