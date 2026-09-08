void main () {

    int item1 = 19;
    int item2 = 89;

    IO.println("Sales tax on item 1 is = " + item1 * 0.25);
    IO.println("Sales tax on item 2 is = " + item2 * 0.25);



    double Salestaxrate = 0.25;

    double Salestaxitem1 = item1 * Salestaxrate;
    double Salestaxitem2 = item2 * Salestaxrate;

    IO.println("Sales taxrate of " + item1 + " is " + Salestaxitem1 );
    IO.println("Sales taxrate of " + item2 + " is " + Salestaxitem2 );

    int maxValue = Integer.MAX_VALUE;
    int newValue = maxValue + 1;
    IO.println(newValue);

    String multiline = "This is a\nmultiline String."; // Using \n for a new line
    IO.println(multiline);

    String quote = "She said, \"Hello!\"";
    String singleQuote = "It's a sunny day.";
    String backslash = "This is a backslash: \\";
    String newLine = "This is the first line.\nThis is the second line.";
    String tabbed = "This is a tab:\tTabbed text.";

    IO.println(quote);
    IO.println(singleQuote);
    IO.println(backslash);
    IO.println(newLine);
    IO.println(tabbed);

    boolean thisIsTrue = true; // This variable is true
    boolean thisIsFalse = false; // This variable is false

    int a = 5;
    int b = 5;
    int c = 10;
    boolean isEqual = (a == b); // true, because 5 is equal to 5
    boolean isEqualAgain = a == b; // true, because 5 is equal to 5
    boolean isNotEqual = (a != c); // true, because 5 is not equal to 10
    boolean isNotEqualAgain = a != c; // true, because 5 is not equal to 10
    IO.println("Is a equal to b? " + isEqual); // Prints true
    IO.println("Is a not equal to c? " + isNotEqual); // Prints true

    String str1 = "Hello";
    String str2 = "Hello";
    boolean areEqual = str1.equals(str2); // true, because both strings have the same content
    IO.println("Is Hello equal to hello? " + areEqual);
}