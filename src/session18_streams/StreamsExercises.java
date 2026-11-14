package session18_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExercises {

    void main() {
        //select exercise to run
        E2();

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


    }

    //Exercise 4
    void E4() {


    }

}