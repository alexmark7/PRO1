void main () {

    int theTemperature =25;
    String sunny = "Yes";
    boolean snowing = false;

    boolean isItNice = 15 <= theTemperature && theTemperature <= 25;
    IO.println("The weather is nice? " + isItNice);


    boolean itIsSunny = 15 <= theTemperature && theTemperature <= 25 && sunny.equals("Yes");
    IO.println("The weather is nice and sunny? " + itIsSunny);


    boolean sunnySnow = 15 <= theTemperature && theTemperature <= 25 && sunny.equals("Yes") && !snowing || -10 <= theTemperature && theTemperature <= -2 && snowing;
    IO.println("The weather is nice and sunny or nice and snowy? " + sunnySnow);

}