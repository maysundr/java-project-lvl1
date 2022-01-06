package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    protected static final String ANSWER_YES = "yes";
    protected static final String ANSWER_NO = "no";
    protected static final int CORRECT_ANSWER = 3;
    protected static final int MAX_BOUND_RANDOM = 3;
    private static int score = 0;

    public static final int GAME_EXIT = 0;
    protected static final int GAME_GREET = 1;
    protected static final int GAME_EVEN = 2;
    protected static final int GAME_CALC = 3;
    protected static final int GAME_GCD = 4;
    protected static final int GAME_PROGRESSION = 5;
    protected static final int GAME_PRIME = 6;

    private static Scanner console = new Scanner(System.in);


    public static String greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = getConsole().nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static int getRandomNumber() {
        final var factor = 100;
        int randomNumber = (int) ((Math.random()) * factor);
        return randomNumber;
    }

    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public static String getAnswerUser() {
        System.out.print("Your answer: ");
        String answerUser = console.nextLine();
        return answerUser;
    }

    public static Scanner getConsole() {
        return console;
    }

    public static void getCorrectAnswer() {
        System.out.println("Correct!");
        score++;
    }

    public static void getWrongAnswer(String answerUser, String rightAnswer, String name) {
        System.out.println("'" + answerUser + "'"
                + " is wrong answer ;(. Correct answer was " + "'" + rightAnswer + "'" + ".");
        System.out.println("Let's try again, " + name + "!");
        System.exit(0);
    }

    public static void getWrongAnswer(int answerUser, int rightAnswer, String name) {
        System.out.println("'" + answerUser + "'"
                + " is wrong answer ;(. Correct answer was " + "'" + rightAnswer + "'" + ".");
        System.out.println("Let's try again, " + name + "!");
        System.exit(0);
    }

    public static void getWrongAnswer(String answerUser, int rightAnswer, String name) {
        System.out.println("'" + answerUser + "'"
                + " is wrong answer ;(. Correct answer was " + "'" + rightAnswer + "'" + ".");
        System.out.println("Let's try again, " + name + "!");
        System.exit(0);
    }

    public static void getCongratulation(String name) {
        if (score == CORRECT_ANSWER) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
