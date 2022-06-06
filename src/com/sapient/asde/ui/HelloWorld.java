package com.sapient.asde.ui;

/**
 * @author SamirKumar
 * @version 1.0
 *  The classes in java.lang package need not be explicitly imported.
 * The core classes are part of this package. For ex. System, Object, Class,
 * Math, String, StringBuffer, StringBuilder etc.
 *
 * The command-line arguments are received as array of String objects by main() method
 */
public class HelloWorld {

        public static void main(String[] args) {
            System.out.println("Hello World!");
            System.out.println("Hi, "+args[0]);

        }


}
