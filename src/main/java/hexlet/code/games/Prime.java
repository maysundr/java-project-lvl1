package hexlet.code.games;


import static hexlet.code.Engine.ANSWER_NO;
import static hexlet.code.Engine.ANSWER_YES;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.startEngine;

public class Prime {

    public static void primeGame() {

        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questionArr = new String[CORRECT_ANSWER];
        String[] rightAnswerArr = new String[CORRECT_ANSWER];
        for (int i = 0; i < questionArr.length; i++) {

            var randomNumber = getRandomNumber();

            questionArr[i] = String.valueOf(randomNumber);
            rightAnswerArr[i] = isPrime(randomNumber) ? ANSWER_YES : ANSWER_NO;

        }
        startEngine(description, questionArr, rightAnswerArr);

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
