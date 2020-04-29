package com.company;

public class Main {

    public static void main(String[] args) {
        Owner owner= new Owner();
        TechnicalWriter technicalWriter = new TechnicalWriter("Mark", 50000, 4, 2);
        owner.addEmployee(technicalWriter);
        Engineer engineer = new Engineer("Natashia", 50000, 7, 2);
        owner.addEmployee(engineer);
        ProductManager productManager = new ProductManager("Carlos", 50000, 8, 5);
        owner.addEmployee(productManager);

        owner.giveRaiseToGroup(Engineer.class, 0.25);
        owner.printEmployeeInfo();
    }
}
