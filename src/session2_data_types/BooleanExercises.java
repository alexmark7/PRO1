void main () {
    //select exercise to run
    E4();

}
//Exercise 1 - Sleep in
void E1 () {

    boolean weekday = Boolean.parseBoolean(IO.readln("Is it a weekday? (true/false): "));
    boolean vacation = Boolean.parseBoolean(IO.readln("Are you on vacation? (true/false): "));

    boolean sleepIn = !weekday || vacation;

    IO.println("Sleep in: " + sleepIn);
}


//Exercise 2
void E2 () {

    String first = IO.readln("Is the first monkey smiling? (true/false): ").trim();
    String second = IO.readln("Is the second monkey smiling? (true/false): ").trim();

    boolean firstSmiling = Boolean.parseBoolean(first);
    boolean secondSmiling = Boolean.parseBoolean(second);

    boolean inTrouble  = (firstSmiling && secondSmiling) || (!firstSmiling && !secondSmiling); // returns true if same

    //Could have done "boolean inTrouble = firstSmiling == secondSmiling;" for an even simpler solution

    IO.println("Are we in trouble: " + inTrouble);


}
//Exercise 3
void E3 () {

    boolean parrot = Boolean.parseBoolean(IO.readln("Is the parrot talking? (true/false): ").trim());
    int time = Integer.parseInt(IO.readln("what is the time? (between 0 and 23: ").trim());

    boolean badTime = (time < 7 || time > 20); // true if not between 7 and 20
    boolean trouble = (badTime && parrot);

    IO.println("Is the parrot making trouble: " + trouble);

}
//Exercise 4
void E4 () {

    int firstNumber = Integer.parseInt(IO.readln("Enter first number: ").trim());
    int secondNumber = Integer.parseInt(IO.readln("Enter second number: ").trim());

    boolean sum = firstNumber + secondNumber == 10 || firstNumber + secondNumber <=10 || firstNumber == 10 || secondNumber == 10;

    IO.println("The sum is 10: " + sum);


}