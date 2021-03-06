/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass1;

/**
 *
 * @author Dimon
 */
abstract class Employee {
    public abstract double netSalary(double baseSalary, double bonus);

    public void display(String name) {
        System.out.println("Employee name:"+name);
    }

}
class Manager extends Employee{
    //Implementing abstract class
    @Override
    public double netSalary(double baseSalary, double bonus) {
        return (baseSalary + bonus);
    }

    @Override
    public void display(String name) {
        System.out.println("Manager name:"+name);
    }
}
class Clerk extends Employee{
    //Implementing abstract class
    @Override
    public double netSalary(double baseSalary, double bonus) {
        return (baseSalary + bonus);
    }

    @Override
    public void display(String name) {
        System.out.println("Clerk name: "+name);
    }
}
public class abstractImplementation {
     public static void main(String[] args) {
        Manager manager = new Manager();
        manager.display("xyz");
        System.out.println("Net Salary is "+manager.netSalary(4000,500));


        Clerk clerk = new Clerk();
        clerk.display("abc");
        System.out.println("Net Salary is "+clerk.netSalary(50000,5000));
    }
}
