package clientcode;

import lab.assignment.afterrefactoring.*;

public class CoffeeClient {

    public static void main(String[] args) {

        CoffeeTemplate starbuzz = new Americano();
        System.out.println("Preparing Americano");
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new Capuccino();
        System.out.println("Preparing Capuccino");
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new Mocha();
        System.out.println("Preparing Mocha");
        starbuzz.prepareCoffee();
    }

}

