package nl.brightboost.week2;

import java.util.Arrays;

public class Array_examples {
    public static void main(String[] args) {
        //multiple dimension arrays
        int [][] ints2 = new int[3][];
        int[] int1 = {4,5,6};
        ints2[0] = int1;

        //or make it like:
        int [][] ints3 = {{1, 2, 3},{4, 5, 6},{7,8 ,9},{0, 1, 2}};
        // length ints3[4][3]
        System.out.println(ints3[1][2]);


        // single dimension arrays
        int[] ints = {6, 7, 2, 4, 6, 77, 8, 1, -89};
        ints[0] = 7;
        System.out.println(ints[0]);
        Arrays.sort(ints);
        System.out.println(ints[0]);
    }
}
