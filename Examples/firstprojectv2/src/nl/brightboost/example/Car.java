package nl.brightboost.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Car {
    //data fields
    public int nrOfDoors; //int is a round number, an integer
    public String color; //string text fields
    public double weight; //decimal number
    public Engine engine; //a car has an engine

    //primitives:
    //Hold raw values and contain nothing but the value
    //stored directly on the stack memory
    //start with lower level

    //PRIMITIVE NUMBERS
    //min is always 1 bigger negative than max positive, because of the number 0.
    byte b = 2; //min = -128, max = 127, size = 8 bits
    short s = 1000; //short numbers, min = -32768, max = 32767, size = 16 bits
    int i = 100000; //whole integers, min = -2.147.483.648, max = 2.147.483.647, size = 32 bits
    long l = 10000000000000L; //long numbers, need to finish with L, min = -9.223.372.036.854.775.808, max = 9.223.372.036.854.775.807, size = 64 bits

    //OTHER PRIMITIVES
    float f = 10.0f; //decimal numbers, end with f!!
    double d = 10.0; //decimal numbers
    char c = 'a'; //you need single quotes, min = 0, max = 65535, size = 16 bits (no negative values allowed, the char holds a value)
    boolean b = true; //size 1 bits

    //methods
    public void startCar() {
        System.out.println("Starting the car");
    }
}
