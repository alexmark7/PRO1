package session10;

import java.util.Objects;

public class InheritFromObjectCar {

    private String make;
    private String model;
    private int year;
    private int millage;

    public InheritFromObjectCar(String make, String model, int year, int millage){
        this.make = make;
        this.model = model;
        this.year = year;
        this.millage = millage;
    }

    public void updateMillage(int millage) {
        this.millage = millage;
    }

    @Override
    public String toString (){
        return "The car is a " +
                make + " " +
                model + " " +
                year + " and it has driven " +
                millage + " kilometers ";
    }


    public boolean hasSameDetails(InheritFromObjectCar other) {
        return year == other.year
                && millage == other.millage
                && make.equals(other.make)
                && model.equals(other.model);
    }

    @Override
    public int hashCode(){
        return Objects.hash(make,model,year,millage);
    }

}
