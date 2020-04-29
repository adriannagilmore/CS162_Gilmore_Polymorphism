/**
 * @author Adrianna Gilmore
 * @version 1
 */
package com.company;
import java.util.ArrayList;

public class Owner{
    public ArrayList<Employee> employees = new ArrayList<Employee>();
    private String name;


    /**
     * Parameterless Comstructor
     */
    public Owner() {
        this.name = "";
    }

    /**
     * Parameterized Constructor
     * @param name : A variable of type String
     */
    public Owner(String name) {
        this.name = name;
    }

    /**
     * Adds an employee that works under the owner
     * @param employee : An object of type Employee
     */
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    /**
     * Gives an employee a raise. Just enter the employee and the amount of the raise
     * @param employee : An object of type Employee
     * @param percentIncrease : A variable of type double
     */
    public void giveRaiseToOne(Employee employee, double percentIncrease){
        double newSalary = employee.getBaseSalary()*percentIncrease;
        employee.setBaseSalary(newSalary);
    }

    /**
     * Gives a certain group of Employees a raise
     * @param className
     * @param percentIncrease : A variable of type double
     */
    public void giveRaiseToGroup(Class<?> className, double percentIncrease) {
        for(Employee employee: employees) {
            if(employee.getClass() == className) {
                giveRaiseToOne(employee, percentIncrease);
            }
        }
    }

    /**
     * Gives a raise of the same percent to all employees
     * @param percentIncrease : A variable of type double
     */
    public void giveRaiseToAll(double percentIncrease) {
        for(Employee employee: employees) {
            giveRaiseToOne(employee, percentIncrease);
        }
    }

    /**
     * Prints out all information on all employees
     */
    public void printEmployeeInfo(){
        for(Employee employee: employees) {
            System.out.println();
            System.out.println(employee.toString());
        }
    }

    /**
     * Prints the information about one specific employee
     * @param employee : An object of type Employee
     */
    public void printOneEmployeesInfo(Employee employee) {
        System.out.println();
        System.out.println(employee.toString());
    }


}
