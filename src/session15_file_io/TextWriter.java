package session15_file_io;

import java.io.*;
import java.time.LocalDateTime;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class TextWriter {
    public static void main(String[] args) {
        // Safe text writer
        try (FileWriter writer = new FileWriter("src/session14_interfaces/output.txt")) {
            writer.write("Hello World!");
            writer.write("\nThis is line 2");
            writer.write("\nThis is line 3");
            IO.println("Output file written successfully!");
        } catch (IOException e) {
            IO.println("Error writing file: " + e.getMessage());
        }
        try (FileWriter writer = new FileWriter("src/session14_interfaces/output.txt", true)) {
            writer.write("\nThis is line 4");
            writer.write("\nThis is line 5");
            IO.println("Lines added to output file successfully!");
        } catch (IOException e) {
            IO.println("Error writing file: " + e.getMessage());
        }

        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get("src/session14_interfaces/output.txt"));

            // Insert new line at position 2 (0-based index)
            lines.add(2, "This line was inserted in the middle!");

            // Write all lines back to the file
            try (PrintWriter writer = new PrintWriter(new FileWriter("src/session14_interfaces/output.txt"))) {
                for (String line : lines) {
                    writer.println(line);
                }
            }

            System.out.println("Line inserted successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // PrintWriter
        try {
            FileWriter fileWriter = new FileWriter("src/session14_interfaces/greeting.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Welcome to Java File I/O!");
            printWriter.println("Today's date: " + java.time.LocalDate.now());
            printWriter.printf("Temperature: %.1f degrees%n", 23.5);
            printWriter.println("Status: Active");

            printWriter.close();
            System.out.println("Greetings file written successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        // Writing Different Data Types
        try (PrintWriter writer = new PrintWriter(new FileWriter("src/session14_interfaces/data_types.txt"))) {

            // String — println(String)
            writer.println("Hello World");

            // Integer — println(int)
            int number = 42;
            writer.println(number);

            // Double — println(double), or printf for formatting
            double price = 19.99;
            writer.println(price);
            writer.printf("%.2f%n", price);

            // Boolean — println(boolean)
            boolean isActive = true;
            writer.println(isActive);

            // Object — println(Object), which uses toString()
            LocalDateTime now = LocalDateTime.now();
            writer.println(now);

            System.out.println("Data file written successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("src/session14_interfaces/data_types.txt", true))) {
            writer.println("Added to the file using PrintWriter.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        {
            Path filePath = Paths.get("src/session14_interfaces/output.txt");

            if (Files.exists(filePath)) {
                System.out.println("File exists!");
            } else {
                System.out.println("File does not exist.");
            }
        }

        try {
            Files.createDirectories(Paths.get("src/session14_interfaces/myNewParentFolder/myNewChildFolder/MyNewGrandChildFolder"));
            System.out.println("Folder created successfully!");
        } catch (IOException e) {
            System.out.println("Error creating folder: " + e.getMessage());
        }

        if (Files.exists(Path.of("src/session14_interfaces/myNewParentFolder/myNewChildFolder"))) {
            System.out.println("Folder already exists!");
        } else {
            try {
                Files.createDirectories(Path.of("src/session14_interfaces/myNewParentFolder/myNewChildFolder"));
                System.out.println("Folder created successfully!");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("src/session14_interfaces/output.txt"))) {
            String line;
            IO.println();
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Serialize one Person object
        Person person = new Person("John Doe", 25, "john@example.com");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/session14_interfaces/person.bin"))) {
            outputStream.writeObject(person);
            System.out.println("Person saved to src/session14_interfaces/person.bin");
        } catch (IOException e) {
            System.out.println("Error saving person: " + e.getMessage());
        }

        // Serialize a list of Person objects
        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(new Person("Jane Doe", 30, "jane@example.com"));

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/session14_interfaces/people.bin"))) {
            outputStream.writeObject(people);
            System.out.println("People saved to src/session14_interfaces/people.bin");
        } catch (IOException e) {
            System.out.println("Error saving people: " + e.getMessage());
        }

        // Read one Person object from the binary file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/session14_interfaces/person.bin"))) {
            Person loadedPerson = (Person) inputStream.readObject();
            System.out.println("\nPerson loaded from src/session14_interfaces/person.bin:");
            System.out.println(loadedPerson);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading person: " + e.getMessage());
        }

        // Read a list of Person objects from the binary file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/session14_interfaces/people.bin"))) {
            List<Person> loadedPeople = (List<Person>) inputStream.readObject();
            System.out.println("\nLoaded " + loadedPeople.size() + " people:");
            for (int i = 0; i < loadedPeople.size(); i++) {
                System.out.println((i + 1) + ": " + loadedPeople.get(i));
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading collection: " + e.getMessage());
        }

    }
}
