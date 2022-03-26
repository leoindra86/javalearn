package com.pluralsight.calcengine;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char opCode = 'd';

        /* if else clause example

        if (opCode == 'a')
            result = value1 + value2;
        else if (opCode == 's')
            result = value1 - value2;
        else if (opCode == 'm')
            result = value1 * value2;
        else if (opCode == 'd') { // inner block
            if (value2 != 0)    //if block done below in switch expr
                result = value1 / value2;
        }
        else {
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
        }
        */



        switch (opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                result = value2 !=0 ? value1 / value2 : 0.0d;
                // logic of if statement, check if else example above to see what its doing.
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;

        }
        System.out.println(result);
    }
}