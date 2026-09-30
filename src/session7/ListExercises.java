void main() {
    //select exercise to run
    E8();

}

//Exercise 1
void E1() {

    ArrayList<Integer> myList = new ArrayList<>();


    for (int i = 1; i <= 100; i++) {
        myList.add(i);
        IO.println(myList.size());
    }

    int listSize = myList.size();
    IO.println(listSize);

}

//Exercise 2
void E2() {

    ArrayList<String> myList = new ArrayList<>();
    myList.add("Apple");
    myList.add("Banana");
    myList.add("Citrus");

    myList.add(1, "Orange");
    myList.add(0, "Grape");

    for (String fruit : myList) {
        IO.println(fruit);
    }

    myList.add(8, "Melon");

    IO.println(myList);

    myList.clear();
}

//Exercise 3 - Random Access
void E3() {

    ArrayList<String> animals = new ArrayList<>();

    animals.add("Lion");
    animals.add("Tiger");
    animals.add("Elephant");
    animals.add("Giraffe");
    animals.add("Zebra");

    IO.println(animals);
    while (true) {
        int userNumber = Integer.parseInt(IO.readln("Enter a number (1-5): "));

        if (userNumber == 0) {
            IO.println("Exiting...");
            break;
        }
        if (userNumber > 5) {
            IO.println("Please enter a valid number");
        }
        if (userNumber > 0 && userNumber < 6) {
            IO.println(animals.get(userNumber - 1));
        }
    }

}

//Exercise 4 -
void E4() {

    ArrayList<Integer> grades = new ArrayList<>();
    grades.add(85);
    grades.add(72);
    grades.add(91);
    grades.add(68);
    grades.add(95);

    IO.println("Original grades: " + grades);
    while (true) {
        int userNumber = Integer.parseInt(IO.readln("Enter a student number (1-5) or 0 to exit: "));

        if (userNumber == 0) {
            IO.println("Goodbye!");
            break;
        }
        if (userNumber > 5) {
            IO.println("Please enter a valid number");
        }
        if (userNumber > 0 && userNumber < 6) {
            IO.println("The student's current grade: " + grades.get(userNumber - 1));

            int newGrade = Integer.parseInt(IO.readln("Enter new grade: "));
            int oldGrade = grades.get(userNumber - 1);

            grades.set(userNumber - 1, newGrade);

            IO.println("Updated grades: " + grades);
            IO.println("Grade for student " + userNumber + " changed from " + oldGrade + " to " + newGrade);
        }
    }
}

//Exercise 5 - replace
void E5() {

    ArrayList<String> words = new ArrayList<>();
    words.add("hello");
    words.add("WORLD");
    words.add("Java");
    words.add("CODE");
    words.add("programming");
    words.add("IS");
    words.add("FuN");

    IO.println("Original words: " + words);
    while (true) {
        int userNumber = Integer.parseInt(IO.readln("Enter a word position (1-7) or 0 to exit: "));

        if (userNumber == 0) {
            IO.println("Goodbye!");
            break;
        }
        if (userNumber > words.size()) {
            IO.println("Please enter a valid number");
        }
        if (userNumber > 0 && userNumber <= words.size()) {

            String caseValue = IO.readln("Chose operation (upper/lower): ");
            String oldWord = words.get(userNumber - 1);
            String newWord;

            if (caseValue.equals("upper")) {
                newWord = oldWord.toUpperCase();
            } else if (caseValue.equals("lower")) {
                newWord = oldWord.toLowerCase();
            } else {
                IO.println("not a valid case");
                continue;
            }
            words.set(userNumber - 1, newWord);

            IO.println("Updated words: " + words);
            IO.println("Word at position " + userNumber + " changed from '" + oldWord + "' to '" + newWord + "'");

        }
    }
}

//Exercise 6 - Interactive list
void E6() {

    ArrayList<String> list = new ArrayList<>();

    while (true) {

        String operation = IO.readln("Choose add, remove, print, or exit: ").toLowerCase().trim();

        if (operation.equals("add")) {
            String item = IO.readln("Enter item to add: ");
            list.add(item);
        } else if (operation.equals("remove")) {
            int index = Integer.parseInt(IO.readln("Enter index to remove: "));
            list.remove(index);
        } else if (operation.equals("print")) {
            IO.println(list);
        } else if (operation.equals("exit")) {
            break;
        } else {
            IO.println("Invalid command.");
        }
    }
}

//Exercise 7 - Find element
void E7() {

    String[] initialFruits = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "kiwi", "banana"};
    ArrayList<String> fruits = new ArrayList<>(Arrays.asList(initialFruits));

    while (true) {

        String input = IO.readln("Search for a fruit (or type 'exit' to stop): ").toLowerCase().trim();

        if (input.equals("exit")) {
            IO.println("Goodbye!");
            break;
        }

        boolean found = false;

        for (int index = 0; index < fruits.size(); index++) {

            if (fruits.get(index).equals(input)) {
                IO.println("The fruit " + input + " was found at index " + index + ".");
                found = true;
            }
        }

        if (!found) {
            IO.println("The fruit " + input + " was not found.");
        }
    }
}

//Exercise 8 - List App
void E8() {

    String[] initialItems = {"apple", "banana", "cherry", "fig", "grape", "kiwi", "banana"};
    ArrayList<String> listOfItems = new ArrayList<>(Arrays.asList(initialItems));

    boolean keepGoing = true;

    while (keepGoing) {

        IO.println("1. Add item");
        IO.println("2. Display list");
        IO.println("3. Remove item by index");
        IO.println("4. Remove item by single value");
        IO.println("5. Remove all occurrences");
        IO.println("6. Search for item");
        IO.println("7. Count items");
        IO.println("8. Clear list");
        IO.println("9. Replace item");
        IO.println("10. Exit");
        String input = IO.readln("Enter a number to select section: ").toLowerCase().trim();

        switch (input) {

            //Add item
            case "1":
                String item = IO.readln("Enter item to add: ");
                listOfItems.add(item);
                break;

            //Display list
            case "2":
                IO.println(listOfItems);
                break;

            //Remove by index
            case "3":
                IO.println(listOfItems);
                int removeIndex = Integer.parseInt(IO.readln("Enter index to remove: "));
                if (removeIndex >= 0 && removeIndex < listOfItems.size()) {
                    String removedItem = listOfItems.remove(removeIndex);
                    IO.println("'" + removedItem + "' was removed.");
                } else {
                    IO.println("Invalid index.");
                }
                break;

                //Remove single value
            case "4":
                IO.println(listOfItems);
                String removeValue = IO.readln("Enter value to remove: ").trim();
                if (listOfItems.remove(removeValue)) {
                    IO.println("'" + removeValue + "' was removed.");
                } else {
                    IO.println("'" + removeValue + "' was not found.");
                }
                break;

                //Remove all occurrences
            case "5":

                String removeOccurrence = IO.readln("Enter item to remove all occurrences of: ").trim();

                boolean removed = false;

                for (int i = listOfItems.size() - 1; i >= 0; i--) {
                    if (listOfItems.get(i).equals(removeOccurrence)) {
                        listOfItems.remove(i);
                        removed = true;
                    }
                }
                if (removed) {
                    IO.println("All occurrences of '" + removeOccurrence + "' were removed.");
                    IO.println("Updated list: " + listOfItems);
                } else {
                    IO.println("'" + removeOccurrence + "' was not found.");
                }
                break;

                //Search for item
            case "6":
                String searchValue = IO.readln("Enter an item to search for: ").trim();

                int index = listOfItems.indexOf(searchValue);

                if (index != -1) {
                    IO.println("'" + searchValue + "' was found at index " + index);
                } else {
                    IO.println("'" + searchValue + "' was not found.");
                }
                break;

                //Count items
            case "7":
                IO.println("There are " + listOfItems.size() + " items in the list.");
                break;

                // Clear list (could add yes/no confirmation.
            case "8":
                listOfItems.clear();
                IO.println("The list has been cleared");
                break;

                //Replace item
            case "9":
                int indexReplace = Integer.parseInt(IO.readln("Enter the index to replace: "));

                if (indexReplace >= 0 && indexReplace < listOfItems.size()) {
                    String newValue = IO.readln("Enter the new value: ").trim();
                    String oldValue = listOfItems.get(indexReplace);
                    listOfItems.set(indexReplace, newValue);
                    IO.println("'" + oldValue + "' was replaced with '" + newValue + "'.");
                    IO.println("Current list: " + listOfItems);
                } else {
                    IO.println("Invalid index.");
                }
                break;

                //Exit
            case "10":
                IO.println("Goodbye!");
                keepGoing = false;
                break ;

            default:
                IO.println("Invalid input. Please enter a number between 1 and 10.");

        }
        IO.println();
    }
}
