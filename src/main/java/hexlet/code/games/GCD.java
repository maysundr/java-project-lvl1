package hexlet.code.games;

import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.startEngine;

public class GCD {

    public static void gcdGame() {

        String description = "Find the greatest common divisor of given numbers.";
        String[][] questionAndRightAnswer = new String[CORRECT_ANSWER][2];
        for (int i = 0; i < questionAndRightAnswer.length; i++) {

            var randomNumberLeft = getRandomNumber();
            var randomNumberRight = getRandomNumber();

            questionAndRightAnswer[i][0] = randomNumberLeft + " " + randomNumberRight;
            questionAndRightAnswer[i][1] = String.valueOf(getGcd(randomNumberLeft, randomNumberRight));

        }
        startEngine(description, questionAndRightAnswer);
    }


    private static int getGcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
