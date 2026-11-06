package session14;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", email: " + email;
    }
}
