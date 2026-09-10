package session4;

public class EnumExercises {
    void main() {
        //select exercise to run
        E8();

    }

    //Exercise 1
    void E1() {

        int a = Integer.parseInt(IO.readln("Enter first number: "));
        int b = Integer.parseInt(IO.readln("Enter second number: "));
        String operator = IO.readln("Enter operator (+, -, *, /)");
        if ("+".equals(operator)) {
            IO.println("Sum: " + (a + b));
        } else if ("-".equals(operator)) {
            IO.println("Difference: " + (a - b));
        } else if ("*".equals(operator)) {
            IO.println("Product: " + (a * b));
        } else if ("/".equals(operator)) {
            IO.println("Quotient: " + (a / b));
        } else {
            IO.println("Unknown operator");
        }
    }

    //Exercise 2
    void E2() {

        // String input = IO.readln("Enter a day: ").trim().toUpperCase();

        Day today = Day.MONDAY; // Day.valueOf(input)

        IO.println("Today is: " + today);

    }


    //Exercise 3
    void E3() {

        E3TrafficLight colour1 = E3TrafficLight.RED;
        IO.println(E3TrafficLight.RED + ": \"Action: Stop\"");

        E3TrafficLight colour2 = E3TrafficLight.YELLOW;
        IO.println(colour2 + ": \"Action: Caution\"");

        E3TrafficLight colour3 = E3TrafficLight.GREEN;
        IO.println(colour3 + ": \"Action: Go\"");
    }

    enum E3TrafficLight {
        RED,
        YELLOW,
        GREEN,
    }

    //Exercise 4
    void E4() {

        E4TrafficLight colour = E4TrafficLight.RED;

        printAction(colour);
    }

    void printAction(E4TrafficLight colour) {
        if (colour == E4TrafficLight.RED) {
            IO.println("Action: Stop");
        } else if (colour == E4TrafficLight.YELLOW) {
            IO.println("Action: Caution");
        } else if (colour == E4TrafficLight.GREEN) {
            IO.println("Action: Go");
        }
    }

    enum E4TrafficLight {
        RED,
        YELLOW,
        GREEN
    }

    //Exercise 5 - Coffee shop
    void E5() {

        printPrice(CoffeeSize.SMALL);
        printPrice(CoffeeSize.MEDIUM);
        printPrice(CoffeeSize.LARGE);
    }

    void printPrice(CoffeeSize size) {
        if (size == CoffeeSize.SMALL) {
            IO.println("SMALL: $2.50");
        } else if (size == CoffeeSize.MEDIUM) {
            IO.println("MEDIUM: $3.50");
        } else if (size == CoffeeSize.LARGE) {
            IO.println("LARGE: $4.50");
        }

    }

    enum CoffeeSize {
        SMALL,
        MEDIUM,
        LARGE;
    }

    //Exercise 6 Seasons
    void E6() {

        printWeather(Seasons.SPRING);
        printWeather(Seasons.SUMMER);
        printWeather(Seasons.FALL);
        printWeather(Seasons.WINTER);

    }

    void printWeather(Seasons season) {
        if (season == Seasons.SPRING) {
            IO.println("SPRING is mild and blooming");
        } else if (season == Seasons.SUMMER) {
            IO.println("SUMMER is hot and sunny");
        } else if (season == Seasons.FALL) {
            IO.println("FALL is cold and windy");
        } else if (season == Seasons.WINTER) {
            IO.println("WINTER is cold and snowy");
        }
    }

    enum Seasons {
        SPRING,
        SUMMER,
        FALL,
        WINTER;
    }

    //Exercise 7 - Traffic lights v2
    void E7() {

        String input = IO.readln("Enter traffic light colour: ");

        Light colour = Light.valueOf(input.toUpperCase().trim());

        if (colour == Light.RED) {
            IO.println("RED: \"Action: Stop\"");
        } else if (colour == Light.YELLOW) {
            IO.println("YELLOW: \"Action: Caution\"");
        } else if (colour == Light.GREEN) {
            IO.println("GREEN: \"Action: Go\"");
        }

    }


    void E8() {


        int lightIndex = Integer.parseInt(IO.readln("Enter light colour index: "));
        Light lightValue = Light.values()[lightIndex];

        IO.println(lightIndex +" is " + lightValue);


    }

    void E9() {


    }

}