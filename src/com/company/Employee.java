/**
 * Employee.java - Employee Benefits Management
 * @author Adrianna Gilmore
 * @version 1
 */
package com.company;

public class Employee {
    private String name;
    private double baseSalary;
    private int yearsOfExperience;
    private int yearsAtCompany;
    protected final static int YEARS_AT_COMPANY_MAX_VACATION_THRESHOLD  = 2;
    protected final static int YEARS_AT_COMPANY_MIN_VACATION_THRESHOLD  = 1;

    /**
     * Parameterless constructor
     */
    public Employee(){
        this("", 0,0,0);
    }

    /**
     * Parameterized constructor
     *@param name : A variable of type String
     *@param baseSalary : A variable of type double
     *@param yearsOfExperience : A variable of type int
     *@param yearsAtCompany : A variable of type int
     */
    public Employee(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
        this.yearsAtCompany = yearsAtCompany;
    }

    //Accessor methods

    /**
     * returns name
     * @return name : A variable of type String
     */
    public String getName() {
        return name;
    }

    /**
     * sets name
     * @param name : A variable of type String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns the base salary
     * @return baseSalary : A variable of type double
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * sets the base salary
     * @param baseSalary : A variable of type double
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * returns the years of experience
     * @return yearsOfExperience : A variable of type int
     */
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    /**
     * sets the years of experience
     * @param yearsOfExperience : A variable of type int
     */
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * return years at company
     * @return yearsAtCompany : A variable of type int
     */
    public int getYearsAtCompany() {
        return yearsAtCompany;
    }

    /**
     * sets years at company
     * @param yearsAtCompany : A variable of type int
     */
    public void setYearsAtCompany(int yearsAtCompany) {
        this.yearsAtCompany = yearsAtCompany;
    }

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    @Override
    public String toString() {
        return "Employee name: " + name +
                ", baseSalary: $" + getBaseSalary() +
                "\nmotto: " + motto();
    }

    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto(){
        return "We value our employees";
    }
}
