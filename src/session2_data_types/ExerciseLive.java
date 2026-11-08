void main () {
    //select exercise to run
    E15();

}
//Exercise 1 - Coffee Receipt
void E1 () {

    String drinkName = IO.readln("Enter the drink name: ");
    String drinkSize = IO.readln("Enter the drink size: ");
    double drinkPrice = Double.parseDouble(IO.readln("Enter the drink price: "));
    int drinkQuantity = Integer.parseInt(IO.readln("Enter quantity: "));

    double drinkTotal = drinkPrice * drinkQuantity;

    IO.println(" Result: You ordered " + drinkQuantity + " " + drinkSize + " " + drinkName + "s for a total of " + drinkTotal);

}
//Exercise 2 - Username Generator
void E2 () {

        String fullName = IO.readln("Enter your Name: ");
        String firstThree = fullName.substring(0, 1).toUpperCase() + fullName.substring(1,3).toLowerCase();
        String lastThree = fullName.substring(fullName.length()-3);

        String end = lastThree.substring(0,1).toUpperCase() + lastThree.substring(1).toLowerCase();

        String year = IO.readln("Enter a year: ");

        String lastTwoDigits = year.substring(year.length() - 2);

        IO.println(" Result:  " + firstThree + end + lastTwoDigits);
}
//Exercise 3 - SMS Normalizer
void E3 () {

    String message = IO.readln("Enter your message: ");
    String trimmedMessage = message.trim();
    String trimmed = trimmedMessage.replaceAll(" +", " ");

    String lowerCase = trimmed.toLowerCase();

    int chars = lowerCase.length();

    IO.println(" Trimmed:  " + trimmedMessage);
    IO.println(" Collapsed: " + trimmed);
    IO.println(" Lower: " + lowerCase);
    IO.println(" Chars: " + chars);

}
//Exercise 4 - Is Double an Integer?
void E4 () {

    double number = Double.parseDouble(IO.readln("Enter a number: "));

    int myInt = (int) number;

    boolean integer = (myInt == number);

    IO.println(" Is integer: " + integer);

}

//Exercise 5 - Fifteen Rule
void E5 () {

    int first = Integer.parseInt(IO.readln("Enter the first number: "));
    int second = Integer.parseInt(IO.readln("Enter the second number: "));

    boolean integer = first == 15
            || first + second == 15
            || first - second == 15
            || second - first == 15;

    IO.println(" Result: " + integer);

}

//Exercise 6 - String Equality
void E6 () {

    String first = IO.readln("Enter the first word: ");
    String second = IO.readln("Enter the second word: ");

    boolean equalExact = first.equals(second);

    IO.println(" Equals (exact): " + equalExact);

    String lowerCase = first.toLowerCase();
    String upperCase = second.toLowerCase();

    boolean equalNoCase = lowerCase.equals(upperCase);

    IO.println(" Equals (ignore case): " + equalNoCase);

}

//Exercise 7 - Vowel Masker
void E7 () {

    String first = IO.readln("Enter word: ");

    String lowerCase = first.toLowerCase();

    String star = lowerCase
            .replace("a","*")
            .replace("e","*")
            .replace("i","*")
            .replace("o","*")
            .replace("u","*")
            .replace("y","*")
            .replace("æ","*")
            .replace("ø","*")
            .replace("å","*");

    IO.println(" Masked: " + star);

    String replaced = star.replace("*","");
    int contains = first.length() - replaced.length();

    //int contains = first.length() - star.replace("*", "").length(); // Chained
    //int contains = star.length() - star.replace("*", "").length(); // Could also work

    IO.println(" Vovels Replaced: " + contains);
}

//Exercise 8 - Word Length Comparator
void E8 () {

    String first = IO.readln("Enter first word: ");
    IO.println(first);
    String second = IO.readln("Enter second word: ");
    IO.println(second);

    if (first.length() > second.length()) {
        IO.println("Longer: " + first + " (" + first.length() + " vs " + second.length() + ")");
    } else if (second.length() > first.length()) {
        IO.println("Longer: " + second + " (" + second.length() + " vs " + first.length() + ")");
    } else {
        IO.println("The words are equal length.");
    }


}

//Exercise 9 - Make ABBA
void E9 () {

    String first = IO.readln("Enter first word: ").trim();
    IO.println(first);
    String second = IO.readln("Enter second word: ").trim();
    IO.println(second);
    IO.println("ABBA WORD: ");
    IO.println(first + second + second + first);

}

//Exercise 10 - Make tags
void E10 () {

    String first = IO.readln("Enter tag: ").trim();
    IO.println(first);
    String second = IO.readln("Enter Word: ").trim();
    IO.println(second);
    IO.println("Printed Tag: ");
    IO.println("<" + first + ">" + second + "</" + first+ ">");

}

//Exercise 11 - Extra end
void E11 () {

    String first = IO.readln("Enter word: ").trim();
    IO.println(first);

    String end = first.substring(first.length()-2);
    IO.println(end + end + end);

}

//Exercise 12 - Without ends
void E12 () {

    String first = IO.readln("Enter word: ").trim();
    IO.println(first);

    String withoutEnds = first.substring(1,first.length()-1);
    IO.println(withoutEnds);

}

//Exercise 13 - Combo string
void E13 () {

    String first = IO.readln("Enter first word: ").trim();
    String second = IO.readln("Enter second word: ").trim();

    if  (first.length() > second.length()) {
        IO.println(second + first + second);
    } else if (second.length() > first.length()) {
        IO.println(first + second + first);
    } else
        IO.println("They are equal length.");


}

//Exercise 14 - Rotate left 2
void E14 () {

    String word = IO.readln("Enter word: ").trim();

    String start = word.substring(0,2);
    String end = word.substring(2);

    IO.println(end + start);

}

//Exercise 15 - Rotate right 2
void E15 () {

    String word = IO.readln("Enter word: ").trim();

    String start = word.substring(0, word.length()-2);
    String end = word.substring(word.length()-2);

    IO.println(end + start);

}