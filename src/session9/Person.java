package session9;

import java.util.ArrayList;

public class Person {

    String name;
    int age;
    ArrayList<String> hobbies;

    public Person(String name, int age, ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    // public getter
    public String getName(){
        return name;
    }

    //public setter
    public void setName(String name){
        this.name = name;
    }

    public void addHobby(String hobby){
        hobbies.add(hobby);
    }

    public ArrayList<String> getHobbies(){
        return new ArrayList<>(hobbies);
    }

    public void greet(){
        IO.println("Greetings " + name);
    }

    @Override
    public String toString() {
        return "PersonClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies + '\'' +
                "}";
    }
}

