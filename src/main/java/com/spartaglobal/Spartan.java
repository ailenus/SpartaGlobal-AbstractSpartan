package com.spartaglobal;

public abstract class Spartan {

    private String type;
    private String name;
    private String address;
    private long number;
    private double salary;

    public abstract void printStatus();

    @Override
    public String toString() {
        return "Spartan type: " + getType() + "\n"
                + "Name: " + getName() + "\n"
                + "Address: " + getAddress() + "\n"
                + "Number: " + getNumber() + "\n"
                + "Salary: " + getSalary();
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public long getNumber() {
        return this.number;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
