package com.spartaglobal;

public class TraineeSpartan extends Spartan {

    private static final String TYPE = "Spartan Trainee";
    private static final double SALARY = 0;

    private static final String STATUS = "While waiting assignment, "
            + " they would be in pre-assignment or training.";

    public TraineeSpartan(String name, String address, long number) {
        setType(TYPE);
        setName(name);
        setAddress(address);
        setNumber(number);
        setSalary(SALARY);
    }

    @Override
    public void printStatus() {
        System.out.println(STATUS);
    }
    
}
