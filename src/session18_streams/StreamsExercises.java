package session18_streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExercises {

    void main() {
        //select exercise to run
        E7();

    }

    //Exercise 1 - Creating Streams
    void E1() {

        List<String> names = List.of("John", "Mary", "Jane", "Bob");

        names.forEach(IO::println);
        IO.println();
        names.stream().forEach(IO::println);
        IO.println();

        Stream.of("Red", "Green", "Blue")
                .forEach(IO::println);
        IO.println();

        List<Integer> numbers = List.of(10, 20, 30, 40);

        var s = numbers.stream();

        s.forEach(IO::println); // Works: this terminal operation consumes the stream (prints 10, 20, 30, 40)
        s.forEach(IO::println); // CRASHES: a stream is a one-shot pipeline; after a terminal operation it is used up
        // -> IllegalStateException: stream has already been operated upon or closed


    }


    //Exercise 2 - The Pipeline
    void E2() {

        List<String> names = List.of("Ann", "Bob", "Charlie", "Jo");

        names.stream()                 // source
                .filter(n -> n.length() > 3)  // intermediate
                .forEach(IO::println); // terminal
        IO.println();

        // Loop
        List<Integer> scores = List.of(7, 9, 4, 10);

        for (Integer score : scores) {
            IO.println(score);
        }
        IO.println();

        // Stream
        scores.stream().forEach(score -> IO.println(score));
        IO.println();

        // Method reference ::
        scores.stream().forEach(IO::println);
        IO.println();

        // Filtering

        scores.stream()
                .filter(s -> s >= 5)
                .forEach(IO::println);
        IO.println();

        List<String> words = List.of("hi", "stream", "java", "api");

        words.stream().filter(w -> w.length() > 3).forEach(IO::println);
        IO.println();

        // Rewrite the loop as a stream
        List<Integer> nums = List.of(2, 5, 8, 11, 14);
        for (Integer n : nums) {
            if (n % 2 == 0) {
                IO.println(n);
            }
        }
        IO.println();

        nums.stream().filter(n -> n % 2 == 0).forEach(IO::println);

    }

    //Exercise 3 - Filtering
    void E3() {

        // loop
        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<String> result = new ArrayList<>();

        for (String name : names) {
            result.add(name);
        }

        IO.println(result);  // [Alice, Bob, Charlie]
        IO.println();

        // Stream
        List<String> names1 = List.of("Alice", "Bob", "Charlie");

        List<String> copy = names1.stream().toList();

        IO.println(names1);  // [Alice, Bob, Charlie]
        IO.println(copy);
        IO.println();

        // Loop
        List<Integer> numbers = List.of(4, 15, 8, 22, 11);
        List<Integer> result2 = new ArrayList<>();

        for (Integer n : numbers) {
            if (n > 10) {
                result2.add(n);
            }
        }
        IO.println(result2);  // [15, 22, 11]
        IO.println();

        // Stream
        List<Integer> numbers1 = List.of(4, 15, 8, 22, 11);

        List<Integer> copy1 = numbers1.stream().filter(n -> n > 10).toList();

        IO.println(copy1);
        IO.println();

        List<String> names2 = List.of("Ann", "Bob", "Charlie", "Jo");

        List<String> longNames = names2.stream()
                .filter(n -> n.length() > 3)
                .toList();

        IO.println(longNames);  // [Charlie]

    }

    //Exercise 4 - Mapping
    void E4() {

        // Loop
        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<Integer> lengths = new ArrayList<>();

        for (String name : names) {
            lengths.add(name.length());
        }

        IO.println(lengths);  // [5, 3, 7]

        IO.println();

        // Stream

        List<String> names1 = List.of("Alice", "Bob", "Charlie");

        List<Integer> lengths1 = names1.stream()
                .map(name -> name.length())
                .toList();

        IO.println(lengths);  // [5, 3, 7]

        IO.println();

        List<String> names2 = List.of("Alice", "Bob", "Charlie");

        List<String> upper = names2.stream()
                .map(String::toUpperCase)
                .toList();

        IO.println(upper);  // [ALICE, BOB, CHARLIE]



    }

    // Exercise 5 - Pipeline
    void E5() {
        // Loop

        List<String> names = List.of("Ann", "Bob", "Charlie", "Jo", "Diana");
        List<String> result = new ArrayList<>();

        for (String name : names) {
            if (name.length() > 3) {
                result.add(name.toUpperCase());
            }
        }
        Collections.sort(result);

        IO.println(result);  // [CHARLIE, DIANA]

        // Streams

        List<String> names1 = List.of("Ann", "Bob", "Charlie", "Jo", "Diana");

        List<String> result1 = names1.stream()
                .filter(n -> n.length() > 3)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        IO.println(result1);  // [CHARLIE, DIANA]

        IO.println();

        List<String> titles = List.of("jaws", "up", "inception", "it", "dune");
        List<String> results = titles.stream()
                .filter(n -> n.length() > 2)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        IO.println(results);

        List<Integer> nums = List.of(9, 2, 7, 2, 5, 9, 1);

        List<Integer> result3 = nums.stream()
                .filter(n -> n > 3)
                .distinct()
                .sorted()
                .toList();

        IO.println(result3);

    }

    //Exercise 6 - Finding and Matching
    void E6 (){

        List<Integer> data = List.of(5, 1, 5, 3, 9, 1, 7, 3);

        List<Integer> result = data.stream()
                .sorted()
                .toList();

        IO.println(result);

        List<Integer> result1 = data.stream()
                .distinct()
                .sorted()
                .toList();

        IO.println(result1);

        List<Integer> result2 = data.stream()
                .distinct()
                .sorted()
                .toList();

        IO.println(result2);

        List<Integer> result3 = data.stream()
                .distinct()
                .limit(3)
                .sorted()
                .toList();

        IO.println(result3);

        long result4 = data.stream()
                .filter(n -> n > 4)
                .count();

        IO.println(result4);

        List<String> words = List.of("one", "two", "three", "two", "four", "three", "five");

        List<String> pipeline = words.stream()
                .distinct()
                .limit(4)
                .sorted()
                .toList();

        IO.println(pipeline);

    }

    // Exercise 7
    void E7 (){

        List<Integer> scores = List.of(4, 7, 2, 9, 5);

        IO.println("anyMatch");
        IO.println();

        // Loop
        boolean foundLoop = false;
        for (Integer s : scores) {
            if (s >= 10) {
                foundLoop = true;
                break;
            }
        }

        // Stream
        boolean foundStream = scores.stream()
                .anyMatch(s -> s >= 10);

        IO.println(foundLoop);    // false
        IO.println(foundStream);  // false

        IO.println();
        IO.println("allMatch");
        IO.println();

        // Loop
        boolean allPassLoop = true;
        for (Integer s : scores) {
            if (s < 2) {
                allPassLoop = false;
                break;
            }
        }

        // Stream
        boolean allPassStream = scores.stream()
                .allMatch(s -> s >= 2);

        IO.println(allPassLoop);    // true
        IO.println(allPassStream);  // true

        IO.println();
        IO.println("findFirst");
        IO.println();

        Integer foundStream1 = scores.stream()
                .filter(s -> s > 6)
                .findFirst()
                .orElse(-1);

        IO.println(foundStream1);

        Integer foundStream2 = scores.stream()
                .filter(s -> s > 100)
                .findFirst()
                .orElse(-1);

        IO.println(foundStream2);
        IO.println();

        List<String> names = List.of("Bea", "Amy", "Clara");
        String found = "nobody";
        for (String name : names) {
            if (name.startsWith("C")) {
                found = name;
                break;
            }
            if (found == null) {
                found= "none";
            }
        }
        IO.println(found);
    }

}