/**
 * @author Adrianna Gilmore
 * @version 1
 */
package com.company;

public class ProductManager extends Employee{
    private  final static int SALARY_MULTIPLIER = 2;
    private final static int SHARES_PER_YEAR = 100;
    private final static int VACATION_MAX  = 4;
    private final static int VACATION_MIN  = 3;

    /**
     * Parameterless constructor
     */
    public ProductManager(){
        super();
    }

    /**
     * Parameterized constructor
     * @param name : A variable of type String
     * @param baseSalary : A variable of type double
     * @param yearsOfExperience : A variable of type int
     * @param yearsAtCompany : A variable of type int
     */
    public ProductManager(String name, double  baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name, baseSalary*SALARY_MULTIPLIER, yearsOfExperience, yearsAtCompany);
    }

    /**
     * sets and returns vacation time
     * @return vacationTime : A variable of type int
     */
    public int vacationTime(){
        int vacationTime=0;
        if(getYearsAtCompany() >= YEARS_AT_COMPANY_MAX_VACATION_THRESHOLD){
            vacationTime= VACATION_MAX;
        }
        else if (getYearsAtCompany() >= YEARS_AT_COMPANY_MIN_VACATION_THRESHOLD ){
            vacationTime= VACATION_MIN;
        }
        return vacationTime;
    }

//    @Override
//    public double getBaseSalary() {
//        return getBaseSalary();
//    }

    /**
     * sets and returns Stock Options
     * @return A variable of type int
     */
    public int stockOptions(){
        return getYearsAtCompany() * SHARES_PER_YEAR;
    }

    /**
     * Overrides motto from the Employee class
     * @return A variable of type String
     */
    @Override
    public String motto() {
        return "There is nothing so useless as doing efficiently that which should not be done at all.";
    }

    /**
     * Overrides toString from the Employee class
     * @return A variable of type String
     */
    @Override
    public String toString() {
        return super.toString() + "\nVacation time: " + vacationTime() + " weeks" + ". Stock Options: " + stockOptions() + " shares";
    }
}
