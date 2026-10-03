package session9;

public class Circle { // Don't need public to be visible within this package.

    double radius;
    double diameter;
    String color;

    public void display() {
        IO.println("Radius: " + radius);
        IO.println("Diameter: " + diameter);
        IO.println("Color: " + color);
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.diameter = 2 * radius;
        this.color = color;
    }

    public Circle() {
        this.radius = 0;
        this.diameter = 0;
        this.color = "Unknown";
    }

    @Override
    public String toString() {
        return "toString output: " + radius + " - " + diameter + " - " + color;
    }

}