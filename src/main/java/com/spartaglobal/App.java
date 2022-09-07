package com.spartaglobal;

public class App {

    public static void main(String[] args) {
        Spartan spartan = new TraineeSpartan("John Doe",
                "123 Main Road", 7415258110L);
        spartan.printStatus();
        System.out.println(spartan);

        spartan = new OnsiteSpartan("Mary Smith",
                "456 Park Avenue", 7253010235L, 26_000);
        spartan.printStatus();
        System.out.println(spartan);
    }

    public void putOnProbation(Spartan spartan) {
        if (spartan.getType().equals("Spartan On-site")) {
            // probation is longer
        } else if (spartan.getType().equals("Spartan Trainee")) {
            // probation is shorter
        }
    }

}
