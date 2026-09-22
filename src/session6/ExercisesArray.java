import java.util.Arrays;

void main() {
    //select exercise to run
    E10();

}

//Exercise 1
void E1() {
    int[] age = new int[5];

    age[0] = Integer.parseInt(IO.readln("Enter number 1: "));
    age[1] = Integer.parseInt(IO.readln("Enter number 2: "));
    age[2] = Integer.parseInt(IO.readln("Enter number 3: "));
    age[3] = Integer.parseInt(IO.readln("Enter number 4: "));
    age[4] = Integer.parseInt(IO.readln("Enter number 5: "));

    int[] scores = {18, 19, 20, 17, 21};

    // Create a 2D array with 3 rows and 4 columns
    int[][] matrix = new int[3][4];

    // Create and initialize a 2D array with values
    int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            scores};

    // Create the outer array first
    int[][] matrix2 = new int[3][];
    // Then create each inner array
    matrix[0] = new int[]{1, 2, 3};
    matrix[1] = new int[]{4, 5, 6};
    matrix[2] = new int[]{7, 8, 9};


    IO.println("The middle of the matrix is: " + matrix1[1][1]);
    // Modify elements
    matrix1[0][1] = 25;
    System.out.println(matrix1[0][1]); // Output: 25

    // age[0] = 18;
    // age[1] = 19;
    // age[2] = 20;
    // age[3] = 17;
    // age[4] = 21;

    String[] name = {"Alice", "Bob", "Charlie", "David", "Eve"};
    String[] name2 = new String[5];

    int total = age[0] + age[1] + age[2] + age[3] + age[4];

    IO.println("The total is: " + total);
    IO.println("The scores are: " + Arrays.toString(scores));
    IO.println("The length of the age array is: " + age.length);
    IO.println("The last element of the age array is: " + age[age.length - 1]);
}

//Exercise 2
void E2() {

    int[] intArray = new int[7];
    String[] stringArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    double[] doubleArray = new double[4];
    int [] safeArray = {10, 20, 30, 40, 50};

    IO.println("Integer Array:");
    IO.println("- Length:" + intArray.length);
    IO.println("- First element:" + intArray[0]);
    IO.println("- Last element" + intArray[intArray.length - 1]);
    IO.println();
    IO.println("String Array:");
    IO.println("- " + stringArray.length);
    IO.println("- " + stringArray[0]);
    IO.println("- " + stringArray[stringArray.length - 1]);
    IO.println();
    IO.println("Double Array:");
    IO.println("- " + doubleArray.length);
    IO.println("- " + doubleArray[0]);
    IO.println("- " + intArray[intArray.length - 1]);
    IO.println();
    IO.println("Safe Array length: " + safeArray.length);
    IO.println("Element at index 0: " + safeArray[0]);
    IO.println("Element at index 2: " + safeArray[2]);
    IO.println("Last valid index: " + safeArray[safeArray.length - 1]);
    IO.println("Attempting to access index 5");
    IO.println(safeArray[5]);
}

//Exercise 3
void E3() {

    int[] number = new int[4];

    for (int i = 0; i < 4; i++) {
        number[i] = Integer.parseInt(IO.readln("Enter number " + i + 1 + ": "));
    }
    IO.println("Array contents:" + Arrays.toString(number));

}

//Exercise 4
void E4() {

    int[] number = {10,20,30,40,50};
    int sum = 0;

    IO.println("Array elements:");
    for (int i = 0; i < number.length; i++) {
        IO.println("Index " + i + ": " + number[i]);
        sum += number[i];
    }
    IO.println("Total sum: " + sum);
    IO.println("Average:" + (sum / number.length));
}

//Exercise 5 - Find largest number
void E5() {

    int[] number = {12, -45, 7, -89, 23, 3, 17, 16, 33};
    int largest = 0;

    for (int i = 0; i < number.length; i++) {
        if (number[i] > largest) {
            largest = number[i];
        }
    }
    IO.println(largest);
    IO.println();

    //New Exercise
    String[] fruit = {"Apple", "Banana","Orange","Grape"};

    for  (int i = 0; i < fruit.length; i++) {
        IO.println("Fruit " + (i+1) + ": "+ fruit[i]);
    }
    IO.println();

    //New Exercise
    int[] array = {1,2,3,4,5,6,7,8,9};

    IO.println("Reverse Array:");
    for (int i = array.length-1; i >= 0; i--) {
        IO.print(array[i] + " ");
    }
    IO.println();

    //New Exercise using values from previous
    int[] reverse = new int[9];

    for (int i = array.length -1; i >= 0; i--) {
        reverse[i] = array.length +1 - array[i];
    }

    IO.println("Array contents:" + Arrays.toString(array));
    IO.println("Reverse Array contents:" + Arrays.toString(reverse));
}

//Exercise 6 -
void E6() {

    int[] numbers = {10,20,30,40,50};

    IO.println("Array contents:");

    for (int number : numbers){
        IO.println(number);
    }

    String[] fruits = {"Apple", "Banana", "Orange", "Grape"};


}

void E7 () {
    int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
    };

// Get number of rows
    int rows = matrix.length;           // 3
// Get number of columns in first row
    int columns = matrix[0].length;     // 4

    System.out.println("Rows: " + rows);
    System.out.println("Columns: " + columns);

// Print all elements
    System.out.println("Matrix contents:");
    for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix[row].length; col++) {
            System.out.print(matrix[row][col] + " ");
        }
        System.out.println(); // New line after each row
    }
    // Print all elements using enhanced for loops
    System.out.println("Matrix contents:");
    for (int[] row : matrix) {
        for (int element : row) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}

//Exercise 8 - Search in Array
void E8 () {

    String[] fruit = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi"};

    String input = IO.readln("Enter a fruit to search index: ").toLowerCase().trim();

    boolean found = false;

    for  (int index = 0; index < fruit.length; index++) {
        if (fruit[index].equals(input)) {
            IO.println("The fruit at index " + index + " is " + fruit[index]);
            found = true;
            break;
        }
        }
    if (!found) {
        IO.println(input + " not found in the array");
    }
}

//Exercise 9
void E9 () {

    int[] array = {5,10,15,20,25};
    int[] doubledArray = new int[5];

    for (int row = 0; row < array.length; row++) {
        doubledArray[row] = array[row] * 2;
    }
    IO.println("The original array is " + Arrays.toString(array));
    IO.println("The doubled array is: " + Arrays.toString(doubledArray));

}
//Exercise 10
void E10 () {

    String[] fruit = {"apple", "banana", "cherry", "date", "elderberry"};
    String[] formattedString = new String [5];

    for (int index = 0; index < fruit.length; index++) {
        IO.println(fruit[index] + " - " + fruit[index].length() + ", First character: " + fruit[index].charAt(0));
    }

    for (int index = 0; index < fruit.length; index++) {
        formattedString[index] = fruit[index].substring(0,1).toUpperCase() + fruit[index].substring(1);
    }
    IO.println("Formatted Fruits: " + String.join(". ", formattedString) + ".");
}