package com.spartaglobal;

public class OnsiteSpartan extends Spartan {

    private static final String TYPE = "Spartan On-site";

    private static final String STATUS = "While waiting assignment, "
            + " they would be in the bench.";

    public OnsiteSpartan(String name, String address, long number,
            double salary) {
        setType(TYPE);
        setName(name);
        setAddress(address);
        setNumber(number);
        setSalary(salary);
    }

    @Override
    public void printStatus() {
        System.out.println(STATUS);
    }

}
