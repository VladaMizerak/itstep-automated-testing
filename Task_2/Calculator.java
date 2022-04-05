package Task_2;

import Task_3.exception.DivByZeroException;

public class Calculator {
    //Task 1. Implement a simple calculator with 4 operations.
    // Each operation - different method. Use it in the main method.

    public static  void main(String[] args) {
        int a = 4;
        int b = 5;

        System.out.println(add(a,b));
        System.out.println(minus(a,b));
        System.out.println(mult(a,b));
        System.out.println(divide(a,b));

    }

    private static int add(int a, int b) {
        return a+b;
    }

    private static int minus(int a, int b) {
        return a-b;
    }

    private static int mult(int a, int b) {
        return a*b;
    }

    public static double divide(double a, double b) {
        if (b==0) try {
            throw new DivByZeroException("Invalid dividor: " +b);
        } catch (DivByZeroException e){
            e.printStackTrace();
        }
        return a/b;
    }
}
