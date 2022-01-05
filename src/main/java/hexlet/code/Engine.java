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
        //Scanner console = new Scanner(System.in);
        String userName = console.nextLine();
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

    public static String getAnswerEven() {
        System.out.print("Your answer: ");
        String answerEven = console.nextLine();
        return answerEven;
    }

    public static Scanner getConsole() {
        return console;
    }

    public static void getGameBody(String rightAnswer, String answerEven, String name) {
        if (answerEven.equals(rightAnswer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("'" + answerEven + "'" + " is wrong answer ;(. Correct answer was "
                    + "'" + rightAnswer + "'.");
            System.exit(0);
        }

        if (score == CORRECT_ANSWER) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
