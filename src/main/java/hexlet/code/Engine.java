package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final String ANSWER_YES = "yes";
    public static final String ANSWER_NO = "no";
    public static final int CORRECT_ANSWER = 3;
    public static final int MAX_BOUND_RANDOM = 3;
    private static int score = 0;

    public static final int GAME_EXIT = 0;
    protected static final int GAME_GREET = 1;
    protected static final int GAME_EVEN = 2;
    protected static final int GAME_CALC = 3;
    protected static final int GAME_GCD = 4;
    protected static final int GAME_PROGRESSION = 5;
    protected static final int GAME_PRIME = 6;

    private static Scanner scanner = new Scanner(System.in);


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

    public static Scanner getConsole() {
        return scanner;
    }

    public static void startEngine(String description, String[][] questionAndRightAnswer) {
        var name = greetUser();
        System.out.println(description);
        for (int i = 0; i < Engine.CORRECT_ANSWER; i++) {

            System.out.println("Question: " + questionAndRightAnswer[i][0]);

            System.out.print("Your answer: ");

            var answerUser = getConsole().next();

            if (String.valueOf(answerUser).equals(questionAndRightAnswer[i][1])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + answerUser + "'"
                            + " is wrong answer ;(. Correct answer was " + "'"
                            + questionAndRightAnswer[i][1] + "'" + ".");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
