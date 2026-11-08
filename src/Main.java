import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    private record Program(String title, String className) {
    }

    private record Session(String topic, List<Program> programs) {
    }

    private static Program program(String title, String className) {
        return new Program(title, className);
    }

    private static final List<Session> SESSIONS = List.of(
            new Session("Java basics, arithmetic and operators", List.of(
                    program("First class", "FirstClass"),
                    program("Arithmetic", "ArithmeticExample"),
                    program("Relational operators", "RelationalOperators"),
                    program("Sales tax", "SalesTax"),
                    program("Weather", "Weather"),
                    program("Simple weather", "WeatherSimple"))),
            new Session("Types, strings and booleans", List.of(
                    program("Primitive defaults", "PrimitiveDefaults"),
                    program("Reference defaults", "ReferenceDefaults"),
                    program("Counting numbers", "CountingNumbers"),
                    program("Exercises in class", "ExercisesInClass"),
                    program("Live exercises", "ExerciseLive"),
                    program("String exercises", "StringExercises"),
                    program("String exercises 2", "StringExercisesTwo"),
                    program("String exercises 3", "StringExercisesThree"),
                    program("IndexOf exercises", "IndexOfExercises"),
                    program("Replace and cut", "ReplaceCut"),
                    program("Boolean exercises", "BooleanExercises"))),
            new Session("If statements and conditions", List.of(
                    program("If exercises", "IfExercises"),
                    program("If/else exercises", "IfElseExercises"),
                    program("If statement exercises", "IfStatementExercises"))),
            new Session("Switch and enums", List.of(
                    program("Switch exercises", "session4_switches.ExercisesSwitch"),
                    program("Enum exercises", "session4_switches.EnumExercises"))),
            new Session("For and while loops", List.of(
                    program("For loops", "ForLoopExercises"),
                    program("While loops", "ExercisesWhileLoop"))),
            new Session("Arrays", List.of(program("Array exercises", "ExercisesArray"))),
            new Session("Lists and records", List.of(
                    program("List exercises", "ListExercises"),
                    program("Record exercises", "RecordExercises"))),
            new Session("Exceptions", List.of(program("Exception exercises", "Exceptions"))),
            new Session("Classes and objects", List.of(
                    program("Book", "session9_classes.BookTester"),
                    program("Person", "session9_classes.PersonTester"),
                    program("Circle", "session9_classes.CircleTester"))),
            new Session("Methods, dates, static members and Object", List.of(
                    program("Method overloading", "session10_methods.MethodOverloading"),
                    program("MyDate", "session10_methods.MyDate"),
                    program("Static counter", "session10_methods.StaticCounter"),
                    program("Car and Object", "session10_methods.InheritFromObjectCarTest"))),
            new Session("Songs, wizards and detectives", List.of(
                    program("Songs", "session11_objects.SongMain"),
                    program("Wizards", "session11_objects.WizardMain"),
                    program("Detectives", "session11_objects.DetectiveMain"))),
            new Session("Inheritance: superheroes and magical creatures", List.of(
                    program("Superhero team", "session12_inheritance.Superheroes.SuperheroTeamMain"),
                    program("Magical creature zoo", "session12_inheritance.MagicalCreatureZoo.MagicalCreatureMain"))),
            new Session("Abstract animals: dogs, cats and birds", List.of(
                    program("Animal demo", "session13_abstraction.AnimalMain"))),
            new Session("Interfaces (not yet runnable)", List.of()),
            new Session("Writing text files", List.of(
                    program("Text writer", "session15_file_io.TextWriter")))
    );

    public static void main(String[] args) {
        while (true) {
            IO.println("\n=== PRO1 sessions ===");
            for (int i = 0; i < SESSIONS.size(); i++) {
                IO.println((i + 1) + ". Session " + (i + 1) + " - " + SESSIONS.get(i).topic());
            }
            IO.println("0. Exit");

            int choice = readChoice("Choose a session: ");
            if (choice == 0) return;
            if (choice < 1 || choice > SESSIONS.size()) {
                IO.println("That session does not exist.");
                continue;
            }
            showSession(SESSIONS.get(choice - 1));
        }
    }

    private static void showSession(Session session) {
        while (true) {
            IO.println("\n=== " + session.topic() + " ===");
            if (session.programs().isEmpty()) {
                IO.println("No runnable main program in this session yet.");
            }
            for (int i = 0; i < session.programs().size(); i++) {
                IO.println((i + 1) + ". " + session.programs().get(i).title());
            }
            IO.println("0. Back to sessions");

            int choice = readChoice("Choose a program: ");
            if (choice == 0) return;
            if (choice < 1 || choice > session.programs().size()) {
                IO.println("That program does not exist.");
                continue;
            }
            Program program = session.programs().get(choice - 1);
            List<Method> exercises = findExercises(program);
            if (exercises.isEmpty()) {
                run(program);
            } else {
                showExercises(program, exercises);
            }
        }
    }

    private static List<Method> findExercises(Program program) {
        try {
            return Arrays.stream(Class.forName(program.className()).getDeclaredMethods())
                    .filter(method -> method.getName().matches("E[1-9][0-9]*")
                            && method.getParameterCount() == 0
                            && method.getReturnType() == void.class)
                    .sorted(Comparator.comparingInt(method -> Integer.parseInt(method.getName().substring(1))))
                    .toList();
        } catch (ClassNotFoundException e) {
            IO.println("Could not find " + program.className() + ": " + e.getMessage());
            return List.of();
        }
    }

    private static void showExercises(Program program, List<Method> exercises) {
        while (true) {
            IO.println("\n=== " + program.title() + " ===");
            for (int i = 0; i < exercises.size(); i++) {
                Method method = exercises.get(i);
                IO.println((i + 1) + ". " + exerciseTitle(program, method));
            }
            IO.println("0. Back to programs");

            int choice = readChoice("Choose an exercise: ");
            if (choice == 0) return;
            if (choice < 1 || choice > exercises.size()) {
                IO.println("That exercise does not exist.");
                continue;
            }

            Method method = exercises.get(choice - 1);
            IO.println("\n--- " + exerciseTitle(program, method) + " ---");
            try {
                var constructor = method.getDeclaringClass().getDeclaredConstructor();
                constructor.setAccessible(true);
                method.setAccessible(true);
                method.invoke(constructor.newInstance());
            } catch (ReflectiveOperationException | SecurityException e) {
                Throwable cause = e instanceof InvocationTargetException && e.getCause() != null
                        ? e.getCause() : e;
                IO.println("Exercise failed: " + cause);
            }
        }
    }

    private static String exerciseTitle(Program program, Method method) {
        if (program.className().equals("session4_switches.ExercisesSwitch")) {
            String[] titles = {"Grade conversion", "Days in a month", "Seasons", "Season helper method",
                    "Calculator", "Animal sounds", "Speed of sound", "Sound travel time",
                    "Rock-paper-scissors", "Rock-paper-scissors-lizard-Spock", "Magic spells",
                    "Elemental reactions", "Restaurant"};
            int number = Integer.parseInt(method.getName().substring(1));
            if (number <= titles.length) return method.getName() + " - " + titles[number - 1];
        }
        return method.getName();
    }

    private static int readChoice(String prompt) {
        String input = IO.readln(prompt);
        if (input == null) return 0;
        try {
            return Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void run(Program program) {
        IO.println("\n--- " + program.title() + " ---");
        String java = Path.of(System.getProperty("java.home"), "bin", "java").toString();
        String classPath = System.getProperty("java.class.path");
        try {
            int exitCode = new ProcessBuilder(java, "-cp", classPath, program.className())
                    .inheritIO()
                    .start()
                    .waitFor();
            if (exitCode != 0) IO.println("Program exited with code " + exitCode);
        } catch (IOException e) {
            IO.println("Could not start the program: " + e.getMessage());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            IO.println("Program interrupted.");
        }
    }
}
