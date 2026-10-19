package session10;

public class StaticCounterClass {

    private static int counter;
    private int instanceNumber;

    public StaticCounterClass(){
        counter++;
        instanceNumber = counter;
    }

    public static int getCurrentCount() {
        return counter;
    }

    public static int resetCounter(){
        return counter = 0;
    }

    public void getInstanceNumber(){
        IO.println("Instance " + instanceNumber + " of " + counter);
    }

    @Override
    public String toString() {
        return "Counter " + instanceNumber + " created";
    }

}
