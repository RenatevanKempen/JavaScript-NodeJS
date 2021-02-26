package nl.brightboost.week1;

public class Wrapper {
    public static void main(String[] args) {
        int x = 10; //primitive --> integer
        Integer x1 = new Integer(10); //much more options than normal int
        Integer x2 = Integer.valueOf(10); //latest way of making this wrapper

        Integer x3 = 10; //autoboxing, automatically make it an integer
        doSomething(x); //un-boxing, making the primitive int x a wrapper Integer x
        //you can use Integer in a list, int can not be used in a list.

        //Integer has some additional features that you can use.
        Integer.MAX_VALUE = 100;
    }

    public static void doSomething(Integer x){

    }
}
