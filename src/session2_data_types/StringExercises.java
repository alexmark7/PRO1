void main () {
    //select exercise to run
    E5();

}
//Exercise 1 - startsWith + endsWith
void E1 () {

    String sentence = IO.readln("Enter your sentence: ");
    IO.println(sentence);

    String prefix = IO.readln("Enter your prefix: ");

    boolean startsWith = prefix.startsWith("Java");

    IO.println("the sentence starts with the prefix:" + startsWith);

    String suffix = IO.readln("Enter your suffix: ");

    boolean endsWith = suffix.endsWith("awesome");

    IO.println("the sentence ends with the suffix:" + endsWith);

}

//Exercise 2 - Chat at
void E2 () {

    String word = IO.readln("Enter your word: ");

    int index = Integer.parseInt(IO.readln("Enter your index: "));

    char character = word.charAt(index);

    char firstChar = word.charAt(0);
    char thirdChar = word.charAt(2);
    char lastChar = word.charAt(word.length() - 1);
    IO.println("The first letter of the sentence is: " + firstChar);
    IO.println("The third letter of the sentence is: " + thirdChar);
    IO.println("The last letter of the sentence is: " + lastChar);

    IO.println("The character at " + index + " is: " + character);

}
//Exercise 3 - Sub string - Extract from Start Index
void E3 () {

    String word = IO.readln("Enter your word: ");
    int index = Integer.parseInt(IO.readln("Enter your index: "));

    String sub1 = word.substring(index);
    String sub2 = word.substring(0,2);

    IO.println("The substring is: " + sub1);
    IO.println("This is substring 2: " + sub2);

}
//Exercise 4 - Extract a Substring
void E4 () {

    String word = IO.readln("Enter your word: ");
    int index = Integer.parseInt(IO.readln("Enter your index: "));
    int index2 = Integer.parseInt(IO.readln("Enter your end index: "));

    String substring = word.substring(index,index2);
    IO.println("The substring is: " + substring);

}
//Exercise 5 - Split and Transform substring
void E5 () {

    String word = IO.readln("Enter your word: ");
    int index = Integer.parseInt(IO.readln("Enter your start index: "));
    int index2 = Integer.parseInt(IO.readln("Enter your end index: "));

    String lowerCase = word.substring(0,index).toLowerCase();
    String upperCase = word.substring(index,index2).toUpperCase();
    String lowerCaseEnd = word.substring(index2+1).toLowerCase();

    IO.println("Transformed output: " + lowerCase + upperCase + lowerCaseEnd);

// how to split it up more
//    String word = IO.readln("Enter your word: ");
//    int index = Integer.parseInt(IO.readln("Enter your start index: "));
//    int index2 = Integer.parseInt(IO.readln("Enter your end index: "));
//
//    String firstPart = word.substring(0, index);
//    String middlePart = word.substring(index, index2);
//    String lastPart = word.substring(index2);
//
//    firstPart = firstPart.toLowerCase();
//    middlePart = middlePart.toUpperCase();
//    lastPart = lastPart.toLowerCase();
//
//    IO.println("Transformed output: " + firstPart + middlePart + lastPart);

}

//Exercise 6 - Split and Transform substring
void E6 () {



}