package nl.brightboost.week2;

public class Operators {
    public static void main(String[] args) {
        //arithmetic
        int i = 8 + 9;
        int j = 12;
        int k = i + j;
        i = k - j;
        i = k * j;
        i = k / j; // careful here though, decimal will be cut off for int
       // System.out.println(i); gives 2, as it cuts off the decimals

        //relational
        boolean b = i < j;
        boolean b1 = i == 9; //== is used to check whether values are equal, if yes True
        boolean b2 = i != 9; //!= is used to check whether values are NOT equal, if yes True

        //unary
        i++; //i = i +1
        i--; // i = i - 1

        //assignment
        i = 7;
        i += 3; //i = current value i + 3
        i /= 2; //i = current value i divided by 2
        System.out.println(i);
    }
}
