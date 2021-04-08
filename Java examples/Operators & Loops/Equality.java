package nl.brightboost.week2;

public class Equality {
    public static void main(String[] args) {
        int x = 10;
        if (x == 10) {
            System.out.println(" x is 10!");
        }

        String s = new String("Renate");
        String s1 = new String("Renate");

        if (s == s1) {
            System.out.println("They're equal!");
        } else {
            System.out.println("Not equal");
        } // This will not be able to find the two to be equal.
        //Therefore use .equals!!

        if (s.equals(s1)) {
            System.out.println("They're equal!");
        } else {
            System.out.println("Not equal");
        } //now it works, as it compares the values. Check out object.java (where to find this?!)


    }
}
