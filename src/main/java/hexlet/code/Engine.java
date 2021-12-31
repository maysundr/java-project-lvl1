package hexlet.code;

import java.util.Scanner;

public class Engine {

    protected static final String ANSWER_YES = "yes";
    protected static final String ANSWER_NO = "no";
    protected static final int CORRECT_ANSWER = 3;
    protected static final int MAX_BOUND_RANDOM = 3;

    public static final int GAME_EXIT = 0;
    protected static final int GAME_GREET = 1;
    protected static final int GAME_EVEN = 2;
    protected static final int GAME_CALC = 3;


    public static String greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner console = new Scanner(System.in);
        String userName = console.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static int getRandomNumber() {
        final var factor = 100;
        int randomNumber = (int) ((Math.random()) * factor);
        return randomNumber;
    }

    public static String getAnswerEven() {
        System.out.print("Your answer: ");
        Scanner console = new Scanner(System.in);
        String answerEven = console.nextLine();
        return answerEven;
    }

}
