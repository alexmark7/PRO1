void main () {
    E2();

}
//Exercise 1
void E1 () {

    String favoriteWord = IO.readln("Enter your favorite word: ");

    int numberOfCharacters = favoriteWord.length();

    IO.println("The word \"" + favoriteWord + "\" has " + numberOfCharacters + " characters.");

}

//Exercise 2
void E2 () {

    String favoriteWord = IO.readln("Enter your word: ");

    int numberOfCharacters = favoriteWord.length();

    Boolean characterLimit = numberOfCharacters > 5;

    IO.println("Does your word have more than 5 characters? " + characterLimit);

}
//Exercise 3
void E3 () {

    String word = IO.readln("Enter your word: ");
    IO.println(word.toUpperCase());
    IO.println(word.toLowerCase());

}
//Exercise 4
void E4 () {

    String firstName = IO.readln("Enter your first name: ");

    String favoriteAnimal = IO.readln("Enter your favorite animal: ");

    IO.println("--- Secret Agent Profile ---");
    IO.println("Agent Name: " + firstName.toUpperCase() + " the " + favoriteAnimal.toLowerCase());
    IO.println("Status: Ready for duty!");


}