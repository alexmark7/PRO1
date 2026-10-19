package session10;

public class InheritFromObjectCarTest {

    static void main() {

        InheritFromObjectCar Car1 = new InheritFromObjectCar("Toyota", "Corolla",1989, 160000);
        InheritFromObjectCar Car2 = new InheritFromObjectCar("Toyota", "Corolla",1989, 160000);
        InheritFromObjectCar Car3 = new InheritFromObjectCar("Honda", "Odyssey",2006, 300000);


        IO.println(Car1);

        IO.println(Car1 == Car2); // asks if they are the same object.
        IO.println(Car1.hasSameDetails(Car2));

        IO.println(Car1.hashCode());
        IO.println(Car2.hashCode());
        IO.println(Car1.hashCode() == Car2.hashCode());

        IO.println(Car1.hasSameDetails(Car3));
        IO.println(Car3.hashCode());

    }



}
