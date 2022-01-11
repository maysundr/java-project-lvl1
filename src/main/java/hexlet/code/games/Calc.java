package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.MAX_BOUND_RANDOM;
import static hexlet.code.Engine.getCongratulation;
import static hexlet.code.Engine.getConsole;
import static hexlet.code.Engine.getCorrectAnswer;
import static hexlet.code.Engine.getDescription;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.getWrongAnswer;

public class Calc {

    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void calcGame() {

        var name = Engine.greetUser();

        getDescription(DESCRIPTION);

        for (int i = 0; i < Engine.CORRECT_ANSWER; i++) {

            var randomNumberLeft = getRandomNumber();
            var randomNumberRight = getRandomNumber();
            var operator = getExpression();

            System.out.print("Question: ");
            System.out.print(randomNumberLeft + " ");
            System.out.print(operator);
            System.out.println(" " + randomNumberRight);

            var rightAnswer = getResultExpression(randomNumberLeft, randomNumberRight, operator);

            System.out.print("Your answer: ");
            if (getConsole().hasNextInt()) {
                var answerUser = getConsole().nextInt();
                if (answerUser == rightAnswer) {
                    getCorrectAnswer();
                } else {
                    getWrongAnswer(String.valueOf(answerUser), String.valueOf(rightAnswer), name);
                }
            } else {
                var answerUser = getConsole().nextLine();
                getWrongAnswer(answerUser, String.valueOf(rightAnswer), name);
            }
        }
        getCongratulation(name);
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
