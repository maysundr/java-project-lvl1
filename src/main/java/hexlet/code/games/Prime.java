package hexlet.code.games;

import hexlet.code.Engine;

public class Prime extends Engine {

    public static void primeGame() {
        int index = 0;
        var name = Engine.greetUser();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < CORRECT_ANSWER; i++) {
            System.out.print("Question: ");
            var randomNumber = Engine.getRandomNumber();
            var rightAnswer = getPrime(randomNumber);
            System.out.println(randomNumber);
            System.out.print("Your answer: ");
            var answerEven = getConsole().nextLine();
            if ((answerEven.equals(ANSWER_YES) && randomNumber == rightAnswer)
                    || (answerEven.equals(ANSWER_NO) && randomNumber != rightAnswer)) {
                System.out.println("Correct!");
                index++;
            } else if (answerEven.equals(ANSWER_YES)) {
                System.out.println("'" + answerEven + "'"
                        + " is wrong answer ;(. Correct answer was " + "'" + ANSWER_NO + "'" + ".");
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


    public static int getPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return i;
            }
        }
        return number;
    }
}
