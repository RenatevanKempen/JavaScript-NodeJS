package nl.brightboost.week1;

public class Scope {
    int x = 10; //Global variable, can be used in all underlying methods of this class

    //Method, variable only inside this method, so local variables
    public void doSomething() {
        int y = 8;
        int v;
        System.out.println(x);
        if (y < 10) {
            int z = 11; //vairable only to use in this statement, so only in if!!
            v = 12;
            System.out.println(z);
            System.out.println(v);
        } else { //z can not be used in this block!
            v = 20;

        }
        System.out.println(v);
    }

    public void doSomethingElse(){
        System.out.println(y);
    }
}
