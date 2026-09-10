package session4;

public class ExercisesSwitch {
    void main() {
        //select exercise to run
        E11();

    }

    //Exercise 1 - Grade conversion
    void E1() {

        String grade = IO.readln("Enter Danish grade: ").trim();

        switch (grade) {
            case "12":
                IO.println("International grade: A");
                break;
            case "10":
                IO.println("International grade: B");
                break;
            case "7":
                IO.println("International grade: C");
                break;
            case "4":
                IO.println("International grade: D");
                break;
            case "2":
                IO.println("International grade: E");
                break;
            case "0":
                IO.println("International grade: Fx");
                break;
            case "-3":
                IO.println("International grade: F");
                break;
            default:
                IO.println("Invalid Grade");
        }
    }

    //Exercise 2 - Days in a month
    void E2() {

        int month = Integer.parseInt(IO.readln("Enter Month 1-12: "));
        int year = Integer.parseInt(IO.readln("Enter the year: "));

        int remainder =
                (year % 400 == 0) ? 29 :               // leap year
                        (year % 100 == 0) ? 28 : // not leap year
                                (year % 4 == 0) ? 29 : // leap year
                                        28; //else

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                IO.println("31 days");
                break;
            case 4, 6, 9, 11:
                IO.println("30 days");
                break;
            case 2:
                if (remainder == 29) {
                    IO.println("29 days");
                } else {
                    IO.println("28 days");
                }
                break;
            default:
                IO.println("Invalid Month");
        }

    }


    //Exercise 3 - Seasons
    void E3() {

        int month = Integer.parseInt(IO.readln("Enter Month 1-12: "));

        switch (month) {
            case 1, 2, 12:
                IO.println("Winter");
                break;
            case 3, 4, 5:
                IO.println("Spring");
                break;
            case 6, 7, 8:
                IO.println("Summer");
                break;
            case 9, 10, 11:
                IO.println("Autumn");
                break;
            default:
                IO.println("Invalid Month");
        }

    }

    //Exercise 4 - Month with helper method
    void E4() {

        System.out.println(getSeason(1));
        System.out.println(getSeason(5));
        System.out.println(getSeason(8));
        System.out.println(getSeason(11));
    }

    // Helper method
    public static String getSeason(int month) {
        return switch (month) {
            case 1, 2, 3 -> "Winter";
            case 4, 5, 6 -> "Spring";
            case 7, 8, 9 -> "Summer";
            case 10, 11, 12 -> "Autumn";
            default -> "Invalid month";
        };

    }

    //Exercise 5 - Calculator
    void E5() {

        int firstNumber = Integer.parseInt(IO.readln("Enter first number: "));
        String operator = IO.readln("Enter operator (+, -, *, /): ");
        int secondNumber = Integer.parseInt(IO.readln("Enter second number: "));

        String result = switch (operator) {
            case "+" -> "The result is: " + (firstNumber + secondNumber);
            case "-" -> "The result is: " + (firstNumber - secondNumber);
            case "*" -> "The result is: " + (firstNumber * secondNumber);
            case "/" -> "The result is: " + (firstNumber / secondNumber);
            default -> "Invalid operator";
        };
        IO.println("The result is: " + result);
    }

    //Exercise 5 - animal sounds
    void E6() {

        String animal = IO.readln("Enter an animal: ").trim().toLowerCase();

        String sound = switch (animal) {
            case "dog" -> "Woof";
            case "cat" -> "Meow";
            case "cow" -> "Moo";
            case "sheep" -> "Baa";
            case "pig" -> "Oink";
            case "horse" -> "Neigh";
            case "bird" -> "Tweet";
            case "chicken" -> "Peep";
            default -> "Unknown animal";
        };
        IO.println("The sound of a " + animal + " is: " + sound + "!");
    }

    //Exercise 7 - Speed of sound
    void E7() {

        String medium = IO.readln("Enter a medium (air, water, steel): ").trim().toLowerCase();

        String speed = switch (medium) {
            case "air" -> "The speed of sound in air is 343 m/s.";
            case "water" -> "The speed of sound in water is 1482 m/s.";
            case "steel" -> "The speed of sound in steel is 5960 m/s.";
            default -> "Unknown medium";
        };
        IO.println(speed);

    }

    //Exercise 8 - The speed of sound
    void E8() {

        String medium = IO.readln("Enter a medium (air, water, steel): ").trim().toLowerCase();
        double distance = Integer.parseInt(IO.readln("Enter the distance in feet: "));

        double airtime = distance / 1100;
        double watertime = distance / 4900;
        double steeltime = distance / 16400;

        String time = switch (medium) {
            case "air" ->
                    "The time it takes for sound to travel " + distance + " feet in air is: " + airtime + " seconds.";
            case "water" ->
                    "The time it takes for sound to travel " + distance + " feet in water is: " + watertime + " seconds.";
            case "steel" ->
                    "The time it takes for sound to travel " + distance + " feet in steel is: " + steeltime + " seconds.";
            default -> "Unknown medium";
        };
        IO.println(time);
    }

    //Exercise 9 - Game Rock-Paper-Scissors
    void E9() {

        String choice = IO.readln("Enter your choice (rock, paper, scissors): ").trim().toLowerCase();

        int roll = (int) (Math.random() * 3) + 1;
        String computerChoice = switch (roll) {
            case 1 -> "rock";
            case 2 -> "paper";
            case 3 -> "scissors";
            default -> "Unknown choice";
        };

        String result = switch (choice) {
            case "rock" -> "You chose rock.";
            case "paper" -> "You chose paper.";
            case "scissors" -> "You chose scissors.";
            default -> "Invalid choice";
        };
        IO.println(result);

        if (result.equals("Invalid choice")) {
            IO.println("Please enter a valid choice.");
        } else if (computerChoice.equals(choice)) {
            IO.println("It's a tie! The computer also chose " + computerChoice + ".");
        } else if ((computerChoice.equals("rock") && choice.equals("scissors"))
                || (computerChoice.equals("paper") && choice.equals("rock"))
                || (computerChoice.equals("scissors") && choice.equals("paper")))
        {
            IO.println("You lose! The computer chose " + computerChoice + ".");
        } else {
            IO.println("You win! The computer chose " + computerChoice + ".");
        }

    }

    //Exercise 10 - Game Rock-Paper-Scissors exteneded
    void E10() {

        String choice = IO.readln("Enter your choice (rock, paper, scissors, lizard, Spock): ").trim().toLowerCase();

        int roll = (int) (Math.random() * 5) + 1;

        String computerChoice = switch (roll) {
            case 1 -> "rock";
            case 2 -> "paper";
            case 3 -> "scissors";
            case 4 -> "lizard";
            case 5 -> "Spock";
            default -> "Unknown choice";
        };

        String result = switch (choice) {
            case "rock" -> "You chose rock.";
            case "paper" -> "You chose paper.";
            case "scissors" -> "You chose scissors.";
            case "lizard" -> "You chose lizard.";
            case "Spock" -> "You chose Spock.";
            default -> "Invalid choice";
        };
        IO.println(result);

        if (result.equals("Invalid choice")) {
            IO.println("Please enter a valid choice.");
        } else if (computerChoice.equals(choice)) {
            IO.println("It's a tie! The computer also chose " + computerChoice + ".");
        } else if ((computerChoice.equals("rock") && choice.equals("scissors"))
                || (computerChoice.equals("rock") && choice.equals("lizard"))
                || (computerChoice.equals("paper") && choice.equals("rock"))
                || (computerChoice.equals("paper") && choice.equals("Spock"))
                || (computerChoice.equals("scissors") && choice.equals("paper"))
                || (computerChoice.equals("scissors") && choice.equals("lizard"))
                || (computerChoice.equals("lizard") && choice.equals("Spock"))
                || (computerChoice.equals("lizard") && choice.equals("paper"))
                || (computerChoice.equals("Spock") && choice.equals("scissors"))
                || (computerChoice.equals("Spock") && choice.equals("rock")))
        {
            IO.println("You lose! The computer chose " + computerChoice + ".");
        } else {
            IO.println("You win! The computer chose " + computerChoice + ".");
        }

    }

    //exercise 11 - Game Rock-Paper-Scissors extened with a loop to play multiple rounds

    // Exercise 11 - Magic spells
    void E11() {

        String spell = IO.readln("Enter a spell (Fireball, Heal, Teleport, Illusion, Chain-lightning, Punch): ").trim().toLowerCase();

        int randomNumber = (int) (Math.random() * 100)+1; // Generate a random number between 1 and 100
        int roll = (int) (Math.random() * 3) + 1;

        switch (spell) {
            case "fireball" -> {
                if (randomNumber > 15) {
                    IO.println("You cast fireball! It missed.");
                } else {
                    String effect1 = switch (roll) {
                        case 1 -> "You scorch your enemy!";
                        case 2 -> "You burn your enemy to ashes!";
                        default -> "The fireball fizzles out harmlessly.";
                    };
                    IO.println(effect1);
                }
            }
            case "heal" -> {
                if (randomNumber < 30) {
                    IO.println("You cast heal! It failed.");
                } else {
                    if (randomNumber < 50) {
                        IO.println("You restore a small amount of health.");
                    } else if (randomNumber < 80) {
                        IO.println("You restore a small amount of health.");
                    } else {
                        IO.println("You bring someone back from the brink of death!");
                    }
                }
            }
            case "teleport" -> {
                if (randomNumber > 50) {
                    IO.println("You cast teleport! It failed.");
                } else {
                    IO.println("You cast teleport! You moved to a new location.");
                }
            }
            case "illusion" -> {
                if (randomNumber > 70) {
                    IO.println("You cast illusion! It failed.");
                } else {
                    IO.println("You cast illusion! You became invisible.");
                }
            }
            case "chain-lightning" -> {
                if (randomNumber > 90) {
                    IO.println("You cast Chain-lightning! It failed.");
                } else {
                    IO.println("You cast Chain-lightning! It hit multiple targets and dealt 100 damage.");
                }
            }
            case "punch" -> {
                if (randomNumber <= 100) {
                    String effect = switch (roll) {
                        case 1 -> "You threw hands!";
                        case 2 -> "You punched their face!";
                        default -> "Your fist met their face";
                    };
                    IO.println(effect);
                }
            }
            default -> IO.println("The spell failed.");

        };
    }

    // Exercise 12 - Elemental reactions
    void E12() {

        String element1 = IO.readln("Enter first element (fire, water, earth, air): ").trim().toLowerCase();
        String element2 = IO.readln("Enter second element (fire, water, earth, air): ").trim().toLowerCase();

        String reaction = switch (element1 + "-" + element2) {
            case "fire-water" -> "Steam";
            case "water-earth" -> "Mud";
            case "earth-air" -> "Dust Cloud";
            case "fire-air" -> "Smoke";
            case "fire-fire" -> "Explosion";
            case "water-water" -> "Flood";
            case "earth-earth" -> "Mountain";
            case "air-air" -> "Tornado";
            case "earth-fire" -> "Lava";
            case "water-air" -> "Rain";
            case "air-fire" -> "Ash";

            default -> "No reaction";
        };
        IO.println("The reactions is: " + reaction);
    }

    // Exercise 13 - Restaurant
    void E13() {

    IO.println("Welcome to the Java Bistro!");
    IO.println("Please select a category:");
    IO.println("1 - Drinks");
    IO.println("2 - Food");
    int category = Integer.parseInt(IO.readln("Enter your choice (1 or 2): "));

    if (category == 1) {
        IO.println("Drinks Menu.");
        int drinkChoice = Integer.parseInt(IO.readln("Enter your drink choice (1-3)\n 1 - Water \n 2 - Soda \n 3 - Coffee \n "));
        switch (drinkChoice) {
            case 1:
                IO.println("You ordered: Water.");
                break;
            case 2:
                IO.println("You ordered: Soda.");
                break;
            case 3:
                IO.println("You ordered: Coffee.");
                break;
            default:
                IO.println("Invalid drink choice.");
        }
    }else if (category == 2) {
        IO.println("You selected Food.");
        int foodChoice = Integer.parseInt(IO.readln("Enter your food choice (1-3)\n 1 - Pizza \n 2 - Burger \n 3 - Salad \n "));
        switch (foodChoice) {
            case 1:
                IO.println("You ordered: Pizza.");
                break;
            case 2:
                IO.println("You ordered: Burger.");
                break;
            case 3:
                IO.println("You ordered: Salad.");
                break;
            default:
                IO.println("Invalid food choice.");
        }
    }

    }



}