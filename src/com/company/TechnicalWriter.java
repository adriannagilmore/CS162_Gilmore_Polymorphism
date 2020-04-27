/**
 * @author Adrianna Gilmore
 * @version 1
 */
package com.company;

public class TechnicalWriter extends Employee{
    private final static int VACATION_MAX  = 2;
    private final static int VACATION_MIN  = 1;

    /**
     * Parameterless constructor
     */
    public TechnicalWriter(){
        super();
    }

    /**
     * Parameterized constructor
     * @param name : A variable of type String
     * @param baseSalary : A variable of type double
     * @param yearsOfExperience : A variable of type int
     * @param yearsAtCompany : A variable of type int
     */
    public TechnicalWriter(String name, double  baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);
    }

    /**
     * sets and returns the amount of vacation time
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

    /**
     * Overrides the motto from the Employee class
     * @return A variable of Type String
     */
    @Override
    public String motto() {
        return "You can always edit a bad page. You can’t edit a blank page";
    }

    /**
     * Overrides toString from the Employee class
     * @return A variable of type String
     */
    @Override
    public String toString() {
        return super.toString()+ "\nVacation time: " + vacationTime() + " weeks" ;
    }
}
