package com.javaexcercises.examples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrimitiveDataTypes {
    /*
    1. Primitive data types

    Data Type	Size	    Description
    ---------------------------------------------------------------------------------------------------------
    byte	    1 byte	    Stores whole numbers from -128 to 127
    short	    2 bytes	    Stores whole numbers from -32,768 to 32,767
    int	        4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long	    8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
    boolean	    1 bit	    Stores true or false values
    char	    2 bytes	    Stores a single character/letter or ASCII values

    2. String data type - IT IS NOT PRIMITIVE TYPE:
    String someText = "Tra la la something something";

    3. Instructions:
    System.out.print(...); - prints the text on output in single line
    System.out.println(...); - prints the text on output in single line and "goes to" new line

    reading user input:
    Scanner scanner = new Scanner(System.in); - creates object for reading user input
    intVariable = scanner.nextInt(); - reads user input to appropriate variable
    */
    public static void main(String[] args) {
        // below: variables declarations
        byte variableOfTypeByte = -4;
        short someOtherVariableOfTypeShort = 30000;
        int intVariable = 1000000000;
        long veryBigNumber = 9000000000000000000L;
        float someFractionalNumber1 = 10012.9876543f;
        double someMuchBiggerFractionalNumber = 12345678909876.123;
        boolean trueOrFalseVariable = true;
        char someSingleSign = 'K';

        String someText = "Tra la la something something";

        System.out.println(someText);
        System.out.print("Value of byte variable: ");
        System.out.println(variableOfTypeByte);
        System.out.println("Value of short variable: " + someOtherVariableOfTypeShort); // string concatenation
        System.out.println("Value of int variable: " + intVariable);
        System.out.println("Value of long variable: " + veryBigNumber);
        System.out.println("Value of float variable: " + someFractionalNumber1);
        System.out.println(String.format("Value of float variable but this time more precise: %f . Notice that last digits are only aproximation, the precision of this type is too low.",someFractionalNumber1));
        System.out.println(String.format("Value of double variable: %f", someMuchBiggerFractionalNumber));
        System.out.println("Value of boolean variable (true or false): " + trueOrFalseVariable);
        System.out.println("Value of character variable (single sign): " + someSingleSign);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type new value for int variable: ");
        intVariable = scanner.nextInt();
        System.out.println("New value of int variable: " + intVariable);
    }
}
