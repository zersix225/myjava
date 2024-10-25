package javaoop;
public class Employeeq2 {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employeeq2(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

    public String getfirstName(){
        return this.firstName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public String getlasttName(){
        return this.lastName;
    }

    public void setmonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public double getmonthlySalary (){
        return this.monthlySalary;
    }

    public double getYearsalary(double salary){
        if (monthlySalary < 0) {
            return 0;
        }else{
            return salary * 12;
        }
    }

    public double getRiseSalary(double percent){
        double new_monthlySalary = this.monthlySalary * (1 + percent / 100);
        if (monthlySalary < 0) {
            return 0;
        }else{
            return new_monthlySalary * 12;
        }
    }

    public void showInfo(){
        System.out.println("Employee:" + this.firstName +" "+ this.lastName);
        System.out.printf("Yearly salary: %.2f%n", getYearsalary(monthlySalary));
        System.out.printf("Yearly salary after raise: %.2f%n", getRiseSalary(10));
    }
}
