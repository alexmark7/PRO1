void main() {
    //select exercise to run
    E15();

}

//Exercise 1
void E1() {

    int temp = Integer.parseInt(IO.readln("Enter the temperature: "));

    if (temp > 30) {
        IO.println("It's hot");
    } else if (temp >= 20) {
        IO.println("It's warm");
    } else if (temp >= 10) {
        IO.println("It's cool");
    } else {
        IO.println("It's chilly");
    }
}

//Exercise 2
void E2() {

    int grade = Integer.parseInt(IO.readln("Enter the grade: "));

    if (grade >= 90) {
        IO.println("You got an A");
    } else if (grade >= 80) {
        IO.println("You got an B");
    } else if (grade >= 70) {
        IO.println("You got an C");
    } else if (grade >= 60) {
        IO.println("You got an D");
    } else {
        IO.println("You got an F");
    }
}

//Exercise 3 - Calculator
void E3() {

    int firstNumber = Integer.parseInt(IO.readln("Enter first number: "));
    char operator = IO.readln("Enter operator (+,-,*,/): ").charAt(0);
    int secondNumber = Integer.parseInt(IO.readln("Enter second number: "));

    if (operator == '+') {
        IO.println("The result is: " + (firstNumber + secondNumber));
    } else if (operator == '-') {
        IO.println("The result is: " + (firstNumber - secondNumber));
    } else if (operator == '*') {
        IO.println("The result is: " + (firstNumber * secondNumber));

    } else if (operator == '/' && (firstNumber != 0) && (secondNumber != 0)) {
        IO.println("The result is: " + (firstNumber / secondNumber));
    } else if (operator == '/' && (firstNumber == 0) && (secondNumber == 0))
        IO.println("You can't divide by 0");
    else {
        IO.println("Invalid Operator");
    }

}

//Exercise 4 - Age
void E4() {

    int age = Integer.parseInt(IO.readln("Enter age: "));

    if (age > 65) {
        IO.println("Senior citizen");
    } else if (age > 19) {
        IO.println("Adult");
    } else if (age > 12) {
        IO.println("Teenager");
    } else if (age > 0) {
        IO.println("Child");
    } else {
        IO.println("Error in age value");
    }

}

//Exercise - Title
void E5() {

    char gender = IO.readln("Enter gender (f,m,): ").charAt(0);
    int age = Integer.parseInt(IO.readln("Enter age: "));

    if (Character.toLowerCase(gender) == 'f' && age >= 18) {
        IO.println("Woman");
    } else if (Character.toLowerCase(gender) == 'f' && age < 18 && age >= 0) {
        IO.println("Girl");
    } else if (Character.toLowerCase(gender) == 'f' && age < 0) {
        IO.println("Age not valid");
    }

    if (Character.toLowerCase(gender) == 'm' && age >= 18) {
        IO.println("Man");
    } else if (Character.toLowerCase(gender) == 'm' && age < 18 && age >= 0) {
        IO.println("Boy");
    } else if (Character.toLowerCase(gender) == 'm' && age < 0) {
        IO.println("Age not valid");
    }

    if (Character.toLowerCase(gender) != 'm' && (Character.toLowerCase(gender) != 'f')) {
        IO.println("Error in typed values");
    }
}

//Exercise - Grade Conversion
void E6() {

    int scale = Integer.parseInt(IO.readln("Enter danish scale: "));

    if (scale == 12) {
        IO.println("A");
    } else if (scale == 10) {
        IO.println("B");
    } else if (scale == 7) {
        IO.println("C");
    } else if (scale == 4) {
        IO.println("D");
    } else if (scale == 2) {
        IO.println("E");
    } else if (scale == 0) {
        IO.println("Fx");
    } else if (scale == -3) {
        IO.println("F");
    } else {
        IO.println("Error in scale value");
    }


}

//Exercise - Positive or Negative
void E7() {

    int number = Integer.parseInt(IO.readln("Enter a number: "));

    String output = (number >= 0) ? "positve" : "negative";
    IO.println("The number is: " + output);
}

//Exercise - Minimum of Two Numbers
void E8() {

    int firstNumber = Integer.parseInt(IO.readln("Enter the first number: "));
    int secondNumber = Integer.parseInt(IO.readln("Enter the second number: "));

    int output = (firstNumber < secondNumber) ? firstNumber : secondNumber; // can use Math.min(firstNumber, secondNumber)
    IO.println("The minimum number is: " + output);
}

//Exercise - Absolute Values
void E9() {

    int number = Integer.parseInt(IO.readln("Enter a number: "));

    int output = (number < 0) ? -number : number;
    IO.println("The absolute number is: " + output);
}


//Exercise - Voting Eligibility
void E10() {

    int age = Integer.parseInt(IO.readln("Enter your age: "));

    String output = (age < 18) ? "are not" : "are";
    IO.println("You " + output + " eligible to vote");

}

//Exercise - Is leap year
void E11() {

    int year = Integer.parseInt(IO.readln("Enter the year: "));

    String remainder =
            (year % 4 == 0) ? "a leap year" :
                    (year % 100 == 0) ? "not a leap year" :
                            (year % 400 == 0) ? "a leap year" :
                                    "not a leap year";

    IO.println("It is " + remainder);
}

//Exercise - Print week day
void E12() {

    int number = Integer.parseInt(IO.readln("Enter a number 1-7: "));

    if (number == 1) {
        IO.println("It's Monday");
    } else if (number == 2) {
        IO.println("It's Tuesday");
    } else if (number == 3) {
        IO.println("It's Wednesday");
    } else if (number == 4) {
        IO.println("It's Thursday");
    }  else if (number == 5) {
        IO.println("It's Friday");
    }  else if (number == 6) {
        IO.println("It's Saturday");
    }  else if (number == 7) {
        IO.println("It's Sunday");
    }
    else IO.println("Invalid input");

    String day = (number == 1) ? "Monday" :
            (number == 2) ? "Tuesday" :
                    (number == 3) ? "Wedensday" :
                            (number == 4) ? "Thursday" :
                                    (number == 5) ? "Friday" :
                                            (number == 6) ? "Saturday" :
                                                    (number == 7) ? "Sunday" :
                                                            "invalid input";
    IO.println("It's " + day);

}

//Exercise - ordering numbers
void E13() {

    int firstNumber = Integer.parseInt(IO.readln("Enter first number: "));
    int secondNumber = Integer.parseInt(IO.readln("Enter second number: "));
    int thirdNumber = Integer.parseInt(IO.readln("Enter third number: "));

    //first number biggest
    if (firstNumber > secondNumber && firstNumber > thirdNumber && secondNumber > thirdNumber){
        IO.println("The numbers in descending order: " + firstNumber + ", " + secondNumber + ", " + thirdNumber);
    }
    if (firstNumber > secondNumber && firstNumber > thirdNumber && thirdNumber > secondNumber) {
        IO.println("The numbers in descending order: " + firstNumber + ", " + thirdNumber + ", " + secondNumber);
    }
    //second number biggest
    if (secondNumber > firstNumber && secondNumber > thirdNumber && firstNumber > thirdNumber){
        IO.println("The numbers in descending order: " + secondNumber + ", " + firstNumber + ", " + thirdNumber);
    }
    if (secondNumber > firstNumber && secondNumber > thirdNumber && thirdNumber > firstNumber) {
        IO.println("The numbers in descending order: " + secondNumber + ", " + thirdNumber + ", " + firstNumber);
    }
    //third number biggest
    if (thirdNumber > secondNumber && thirdNumber > firstNumber && firstNumber > secondNumber){
        IO.println("The numbers in descending order: " + thirdNumber + ", " + firstNumber + ", " + secondNumber);
    }
    if (thirdNumber > secondNumber && thirdNumber > firstNumber && secondNumber > firstNumber) {
        IO.println("The numbers in descending order: " + thirdNumber + ", " + secondNumber + ", " + firstNumber);
    }

    //if (firstNumber < secondNumber) {
    //    tempNumber1 = firstNumber;
    //    firstNumber = secondNumber;
    //    secondNumber = tempNumber2;

    //if (3 < 5) {
    //    3 = 3;
    //    3 = 3;
    //    5 = 3;

    // Super clean way to do it

    //if (firstNumber < secondNumber) {
    //    int temp = firstNumber;
    //    firstNumber = secondNumber;
    //    secondNumber = temp;
    //}
    //
    //if (secondNumber < thirdNumber) {
    //    int temp = secondNumber;
    //    secondNumber = thirdNumber;
    //    thirdNumber = temp;
    //}
    //
    //if (firstNumber < secondNumber) {
    //    int temp = firstNumber;
    //    firstNumber = secondNumber;
    //    secondNumber = temp;
    //}


}

// Exercise - Compare floats
void E14() {

    double firstNumber = Double.parseDouble(IO.readln("Enter first number: "));
    double secondNumber = Double.parseDouble(IO.readln("Enter second number: "));

    int int1 = (int) (firstNumber*1000);
    int int2 = (int) (secondNumber*1000);

    // if ((int) (firstNumber * 1000) == (int) (secondNumber * 1000))
    if (int1 == int2 && (int1 % 100 > 0)) {
        IO.println("The number are the same up to three decimal places: True");
    } else if (int1 == int2 && int1 % 100 == 0 ){
        IO.println("They are the same and have less than tree decimals");
    }
    else {
        IO.println("The number are not the same");
    }

    //there as bug if you write something like 10.100000000 because of all the zeros
}

// Exercise - Compare floats
void E15() {

    double firstNumber = Double.parseDouble(IO.readln("Enter first number: "));
    double secondNumber = Double.parseDouble(IO.readln("Enter second number: "));

    String firstString = String.valueOf(firstNumber);
    String secondString = String.valueOf(secondNumber);

    int firstDot = firstString.indexOf('.');
    int secondDot = secondString.indexOf('.');

    boolean same = firstString.substring(0, firstDot).equals(secondString.substring(0, secondDot))
                    && firstString.charAt(firstDot + 1) == secondString.charAt(secondDot + 1)
                    && firstString.charAt(firstDot + 2) == secondString.charAt(secondDot + 2)
                    && firstString.charAt(firstDot + 3) == secondString.charAt(secondDot + 3);

    IO.println("The numbers are the same up to three decimal places: " + same);

    //Follow-up Exercise
    //What should happen if either number has less than three decimal places?

    //String firstString = String.valueOf(firstNumber)+000;
    //String secondString = String.valueOf(secondNumber)+000);

}

void E16() {

    int age = Integer.parseInt(IO.readln("Drivers age: "));
    boolean hasLicense = Boolean.parseBoolean("Has license (true or false): ");
    int score = Integer.parseInt(IO.readln("Drivers score: "));
    String category = IO.readln("Drivers category (student / professional / other): ");

    if (age >= 18 && hasLicense && score >= 80) {
        if (category.equals("student")) {
            IO.println("The student is a student");
        }
        else if (category.equals("professional")) {
            IO.println("The professional is a professional");
        }
        else if (category.equals("other")) {
            IO.println("The other is a other");
        }
    }

}
