/**
 * @author Adrianna Gilmore
 * @version 1
 */
package com.company;

public class Boss extends Employee{
    /**
     * Parameterless Comstructor
     */
    public Boss() {
        super();
    }

    /**
     * Parameterized constructor
     * @param name : A variable of type String
     * @param baseSalary : A variable of type double
     * @param yearsOfExperience: A variable of type int
     * @param yearsAtCompany : A variable of type int
     */
    public Boss(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);
    }

    /**
     * Gives an employee a raise. Just enter the employee and the amount of the raise
     * @param employee : An object of type Employee
     * @param percentIncrease : A variable of type double
     */
    public void giveRaise(Employee employee, double percentIncrease){
        double newSalary = employee.getBaseSalary()*percentIncrease;
        employee.setBaseSalary(newSalary);
    }


}
