package hexlet.code.games;


import static hexlet.code.Engine.ANSWER_NO;
import static hexlet.code.Engine.ANSWER_YES;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.startEngine;

public class Prime {

    public static void primeGame() {

        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndRightAnswer = new String[CORRECT_ANSWER][2];
        for (int i = 0; i < questionAndRightAnswer.length; i++) {

            var randomNumber = getRandomNumber();

            questionAndRightAnswer[i][0] = String.valueOf(randomNumber);
            questionAndRightAnswer[i][1] = isPrime(randomNumber) ? ANSWER_YES : ANSWER_NO;

        }
        startEngine(description, questionAndRightAnswer);

    }


    private static boolean isPrime(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
