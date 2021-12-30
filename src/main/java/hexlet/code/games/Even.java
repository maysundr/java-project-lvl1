package hexlet.code.games;


import java.util.Scanner;


public class Even {

    //private static String userName = "";
    private static final String ANSWER_YES = "yes";
    private static final String ANSWER_NO = "no";
    private static final int CORRECT_ANSWER = 3;

    public static String greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner console = new Scanner(System.in);
        String userName = console.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    /*public static String getNameUser() {
        return userName;
    }

     */


    public static void evenGame() {
        var name = Even.greetUser();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int index = 0;
        for (int i = 0; i < CORRECT_ANSWER; i++) {
            final var factor = 100;
            int randomNumber = (int) ((Math.random()) * factor);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            Scanner console = new Scanner(System.in);
            String answerEven = console.nextLine();

            if ((answerEven.equals(ANSWER_YES) && randomNumber % 2 == 0)
                    || (answerEven.equals(ANSWER_NO) && randomNumber % 2 != 0)) {
                System.out.println("Correct!");
                index++;
            } else if (answerEven.equals(ANSWER_YES)) {
                System.out.println("'" + answerEven + "'"
                        + " is wrong answer ;(. Correct answer was " + ANSWER_NO + ".");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            } else if (answerEven.equals(ANSWER_NO)) {
                System.out.println("'" + answerEven + "'"
                        + " is wrong answer ;(. Correct answer was " + "'" + ANSWER_YES + "'.");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            } else {
                System.out.println("'" + answerEven + "'"
                        + " is wrong answer ;(. Correct answer was " + ANSWER_NO + ".");
                System.exit(0);
            }
        }
        if (index == CORRECT_ANSWER) {
            System.out.println("Congratulations, " + name + "!");
        }

    }

    /*public static String getNumber() {
        final var factor = 100;
        int randomNumber = (int) ((Math.random()) * factor);
        System.out.println("Question: " + randomNumber);
        System.out.print("Your answer: ");
        Scanner console = new Scanner(System.in);
        String answerEven = console.nextLine();
        return answerEven;
    }

     */



    /*public static void setUserName(String userName) {
        Even.userName = userName;
    }

     */
}
