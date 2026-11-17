package session18_streams.filtering;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StudentMain {

    void printStudents(List<Student> students) {
        IO.println("----------------------------------------");
        for (Student student : students) {
            IO.println(student);
        }
        IO.println("Total: " + students.size());
        IO.println("----------------------------------------");
    }

    void main() {
        List<Student> students = List.of(
                new Student("Alice", 19, 10.5, "Software"),
                new Student("Ben", 17, 7.0, "Business"),
                new Student("Cara", 22, 11.2, "Software"),
                new Student("Dan", 18, 5.5, "Design"),
                new Student("Eva", 20, 9.0, "Business"),
                new Student("Finn", 16, 8.5, "Software"),
                new Student("Gina", 21, 6.0, "Design"),
                new Student("Hugo", 19, 12.0, "Software"),
                new Student("Ivy", 23, 4.5, "Business"),
                new Student("Jack", 18, 9.5, "Design"),
                new Student("Kara", 17, 10.0, "Software"),
                new Student("Leo", 20, 7.5, "Business"),
                new Student("Mia", 19, 11.0, "Design"),
                new Student("Noah", 24, 8.0, "Software"),
                new Student("Olga", 18, 3.5, "Business"),
                new Student("Pete", 21, 9.8, "Design"),
                new Student("Quinn", 17, 6.5, "Software"),
                new Student("Rita", 22, 10.2, "Business"),
                new Student("Sam", 19, 5.0, "Design"),
                new Student("Tess", 20, 11.5, "Software")
        );

        printStudents(students);

        IO.println();

        // Filter

        printStudents(students.stream()
                .filter(s -> s.getAge() >= 18)
                .toList());

        IO.println();

        printStudents(students.stream().filter(s -> s.getAverage() >= 10.0).toList());

        IO.println();

        printStudents(students.stream().filter(s -> s.getProgramme().equals("Software")).toList());

        IO.println();

        printStudents(students.stream().filter(s -> s.getProgramme().equals("Design") && s.getAge() < 20).toList());

        IO.println();

        printStudents(students.stream().filter(s -> s.getAverage() >= 6.0).toList());

        IO.println();

        printStudents(students.stream().filter(s -> isPassing(s)).toList());

        IO.println();

        // -----------------------------------------------------------------------------------------

        // Mapping

        List<String> names = students.stream().map(Student::getName).toList();

        IO.println(names);

        IO.println();

        List<String> overview = students.stream().map(s -> s.getName() + " - " + s.getProgramme() + " - " + s.getAverage()).toList();

        IO.println(overview);

        IO.println();

        List<StudentCard> studentcard = students.stream().map(s -> new StudentCard(s.getName(), s.getProgramme())).toList();

        IO.println(studentcard);

        IO.println();

        List<String> software = students.stream().filter(s -> s.getProgramme().equals("Software"))
                .map(s -> s.getName() + " - " + s.getAverage())
                .toList();

        IO.println(software);

        IO.println();

        List<String> oldSmart = students.stream().filter(s -> s.getAverage() >= 10.0)
                .map(s -> s.getName().toUpperCase() + " (" + s.getProgramme() + "): " + s.getAverage())
                .toList();

        IO.println(oldSmart);

        IO.println();

        oldSmart.forEach(IO::println);

    }

    public boolean isPassing(Student s) {
       return s.getAverage() >= 6.0;
    }

}


