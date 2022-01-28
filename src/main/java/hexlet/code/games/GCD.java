package hexlet.code.games;

import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.startEngine;

public class GCD {

    public static void gcdGame() {

        String description = "Find the greatest common divisor of given numbers.";

        String[] questionArr = new String[CORRECT_ANSWER];
        String[] rightAnswerArr = new String[CORRECT_ANSWER];
        for (int i = 0; i < questionArr.length; i++) {

            var randomNumberLeft = getRandomNumber();
            var randomNumberRight = getRandomNumber();

            questionArr[i] = randomNumberLeft + " " + randomNumberRight;
            rightAnswerArr[i] = String.valueOf(getGcd(randomNumberLeft, randomNumberRight));

        }
        startEngine(description, questionArr, rightAnswerArr);
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
