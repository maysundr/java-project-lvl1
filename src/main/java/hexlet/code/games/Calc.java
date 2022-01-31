package hexlet.code.games;


import java.util.Random;

import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.MAX_BOUND_RANDOM;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.startEngine;

public class Calc {


    public static void calcGame() {
        String description = "What is the result of the expression?";
        String[][] questionAndRightAnswer = new String[CORRECT_ANSWER][2];
        for (int i = 0; i < questionAndRightAnswer.length; i++) {
            var randomNumberLeft = getRandomNumber();
            var randomNumberRight = getRandomNumber();
            var operator = getExpression();
            questionAndRightAnswer[i][0] = randomNumberLeft + " " + operator + " " + randomNumberRight;
            questionAndRightAnswer[i][1]
                    = String.valueOf(getResultExpression(randomNumberLeft, randomNumberRight, operator));

        }
        startEngine(description, questionAndRightAnswer);
    }


    private static char getExpression() {
        char operator = ' ';
        Random random = new Random();
        switch (random.nextInt(MAX_BOUND_RANDOM)) {
            case 0:
                operator = '*';
                break;
            case 1:
                operator = '+';
                break;
            case 2:
                operator = '-';
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + random.nextInt(MAX_BOUND_RANDOM));
        }
        return operator;
    }

    private static int getResultExpression(int a, int b, char operator) {
        int result = 0;
        switch (operator) {
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        return result;
    }

}
