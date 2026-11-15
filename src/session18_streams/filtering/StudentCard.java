package session18_streams.filtering;

public class StudentCard {

    private String name;
    private String programme;

    StudentCard(String name, String programme) {
        this.name = name;
        this.programme = programme;
    }

        String getName() {
            return name;
        }

        String getProgramme() {
            return programme;
        }


        @Override
        public String toString () {
            return name + "\n " + programme + "\n";
        }

    }