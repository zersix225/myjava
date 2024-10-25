package javaoop;
import java.util.*;
public class EmployeeDriverq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstnameDriver = sc.nextLine();
        String lastnameDriver = sc.nextLine();
        double salaryDriver = sc.nextDouble();

        Employeeq2 e1 = new Employeeq2(firstnameDriver, lastnameDriver, salaryDriver);
        e1.showInfo();
        sc.close();
    }
}
