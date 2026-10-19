package session10;

public class OverloadCalc {

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int[] add(int a, int b, int c, int d){
        return new int[]{a + b + c + d};
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public double subtract(double a, double b){
        return a-b;
    }

    public int multiply (int a, int b){
        return a*b;
    }

    public double multiply (double a, double b){
        return a*b;
    }

    public int divide(int a, int b){
        if (b == 0) {
            IO.println("Cannot divide by zero");
        }
        return a/b;
    }

    public double divide(double a, double b){
        if (b == 0.0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a/b;
    }

}
