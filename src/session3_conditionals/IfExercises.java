void main () {
    //select exercise to run
    E3();

}
//Exercise 1
void E1 () {

    int x = Integer.parseInt(IO.readln("enter value x: ").trim());
    int y = Integer.parseInt(IO.readln("enter value y: ").trim());

    if (x > y){
        IO.println(x + " is greater than " + y);

    }
    else {

        IO.println(x + " is not greater than " + y);
    }
    IO.println("End of program");
}

//Exercise 2
void E2 () {

    int x = Integer.parseInt(IO.readln("enter your score: ").trim());

    if (x > 50){
        IO.println("You Passed!");
    }

    else {
        IO.println("You Failed");
    }

}
//Exercise 3
void E3 () {

    int x = Integer.parseInt(IO.readln("enter a number: ").trim());

    int y = (x % 2);
    IO.println(y);

    if (x % 2 == 0 ){
        IO.println("Even");
    }
    else  {
        IO.println("Odd");
    }

}
//Exercise 4
void E4 () {

    int x = Integer.parseInt(IO.readln("enter the temperature: ").trim());


}