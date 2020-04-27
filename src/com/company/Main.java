package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        TechnicalWriter technicalWriter = new TechnicalWriter("Mark", 50000, 4, 2);
        employees.add(technicalWriter);
        Engineer engineer = new Engineer("Natashia", 50000, 7, 2);
        employees.add(engineer);
        ProductManager productManager = new ProductManager("Carlos", 50000, 8, 5);
        employees.add(productManager);
        Boss boss = new Boss("Adrianna", 50000,10,5);
        employees.add(boss);
        //boss.giveRaise(technicalWriter, 0.25);

        for(Employee employee: employees) {
            if(employee instanceof Engineer) {
                boss.giveRaise(employee, 0.25);
            }
            System.out.println();
            System.out.println(employee.toString());
        }
    }
}
