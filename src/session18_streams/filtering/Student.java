package session18_streams.filtering;

public class Student {
    private String name;
    private int age;
    private double average;
    private String programme;

    Student(String name, int age, double average, String programme) {
        this.name = name;
        this.age = age;
        this.average = average;
        this.programme = programme;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getAverage() {
        return average;
    }

    String getProgramme() {
        return programme;
    }

    @Override
    public String toString() {
        return name + " (" + age + "), avg " + average + ", " + programme;
    }
}
