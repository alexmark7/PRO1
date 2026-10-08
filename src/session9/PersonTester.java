package session9;

import java.util.ArrayList;

public class PersonTester {
    public static void main(String[] args) {

        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("reading");
        hobbies.add("swimming");

        Person person1 = new Person("Alice", 25,hobbies);
        Person person2 = new Person("Bob", 30, hobbies);

        person1.greet();
        person2.greet();
        System.out.println(person1);
        System.out.println(person2);

        person1.setName("John");
        IO.println(person1.getName());
        person1.addHobby("Running");
        IO.println(person1.getHobbies());
        IO.println(person1);
    }
}
