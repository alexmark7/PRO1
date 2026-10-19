package session10;

public class StaticCounter {

    static void main() {

        StaticCounterClass counter1 = new StaticCounterClass();
        StaticCounterClass counter2 = new StaticCounterClass();
        StaticCounterClass counter3 = new StaticCounterClass();

        IO.println(counter1);
        IO.println(counter2);
        IO.println(counter3);

        IO.println("Total Counters: " + StaticCounterClass.getCurrentCount());

        counter2.getInstanceNumber();

        IO.println("Reset counter");
        StaticCounterClass.resetCounter();
        IO.println("Total Counters: " + StaticCounterClass.getCurrentCount());

    }

}
