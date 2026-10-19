package session10;

public class MethodOverloading {

    static void main() {

        OverloadCalc add = new OverloadCalc();

        int a1 = add.add(2,3);
        double a2 = add.add(2.0,3.5);
        int a3 = add.add(1,2,3);
        int[] a4 = add.add(1,2,3,4);

        IO.println(a1);
        IO.println(a2);
        IO.println(a3);
        IO.println(a4[0] + "[0]");
        IO.println();

        int s1 = add.subtract(4,2);
        double s2 = add.subtract(2.5,1.5);

        IO.println(s1);
        IO.println(s2);
        IO.println();

        int m1 = add.multiply(3,3);
        double m2 = add.multiply(2.5,5.0);
        double decimal = m1;

        IO.println(m1);
        IO.println(m2);
        IO.println(decimal*1.5);
        IO.println();

        int d1 = add.divide(5,5);
        double returnDouble = d1;

        IO.println(returnDouble);

        try {
            double d2 = add.divide(5.0, 0.0);
            IO.println(d2);

        } catch (IllegalArgumentException error) {
            IO.println(error.getMessage());
        }





    }



}
