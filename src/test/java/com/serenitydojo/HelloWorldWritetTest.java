package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWritetTest {
    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }
    @Test
    public void declaringNumericalVariables(){
       final int ageThisYear = 42;
        //assign values to new variables
        int ageNextYear = ageThisYear + 1;

        long starsInTheGalaxy = 10000000000L;

        double weight = 15.5;

        // sout prints a string to System.out
        System.out.println("age = " + ageNextYear);
    }
    @Test
    public void workingWithStrings(){
            // strings are objects
           //  text value is Unicode, also foreign characters
        String firstName = "                     Sarah-Jane";

        String upperCaseFirstName = firstName.replace("Sarah","Mary");
        String lowerCaseFirstname = firstName.toLowerCase();

        // trim method removes any spaces from the start
        System.out.println(upperCaseFirstName.trim());
        System.out.println(lowerCaseFirstname);
    }
}
