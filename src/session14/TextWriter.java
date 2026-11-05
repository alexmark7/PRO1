package session14;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextWriter {
    public static void main(String[] args) {
        // Safe text writer
        try (FileWriter writer = new FileWriter("src/session14/output.txt")) {
            writer.write("Hello World!");
            writer.write("\nThis is line 2");
            writer.write("\nThis is line 3");
            IO.println("Output file written successfully!");
        } catch (IOException e) {
            IO.println("Error writing file: " + e.getMessage());
        }
        // PrintWriter
        try {
            FileWriter fileWriter = new FileWriter("src/session14/greeting.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Welcome to Java File I/O!");
            printWriter.println("Today's date: " + java.time.LocalDate.now());
            printWriter.printf("Temperature: %.1f degrees%n", 23.5);
            printWriter.println("Status: Active");

            printWriter.close();
            System.out.println("Gettings file written successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        // Writing Different Data Types
        try (PrintWriter writer = new PrintWriter(new FileWriter("src/session14/data_types.txt"))) {

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

        {
            Path filePath = Paths.get("src/session14/output.txt");

            if (Files.exists(filePath)) {
                System.out.println("File exists!");
            } else {
                System.out.println("File does not exist.");
            }
        }
    }
}
