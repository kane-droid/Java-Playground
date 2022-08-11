package com.Galvanize;


public class Application {
    public static void main(String[] args){
        //while int = 30
        //print "The input included the number 30"

        //while int != 30
        //print "The input did not include the number 30"
        for (String arg : args) {
            if (arg == "30") {
                System.out.println("The input included the number 30");
            } else  {
                System.out.println("The input did not include the number 30");
            }
        }


    }
}
