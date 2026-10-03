package session9;

public class CircleTester {
    public static void main(String[] args) {

        Circle c1 = new Circle(3.5, "blue");
        Circle c2 = new Circle(5,"red");
        Circle c3 = new Circle();

        c1.display();
        IO.println();
        c2.display();
        IO.println();
        c3.display();

        IO.println(c1);

    }
}