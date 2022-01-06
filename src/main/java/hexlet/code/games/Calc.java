package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc extends Engine {

    public static void calcGame() {

        var name = Engine.greetUser();

        System.out.println("What is the result of the expression?");

        for (int i = 0; i < CORRECT_ANSWER; i++) {

            var randomNumberLeft = Engine.getRandomNumber();
            var randomNumberRight = Engine.getRandomNumber();
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
                    getWrongAnswer(answerUser, rightAnswer, name);
                }
            } else {
                var answerUser = getConsole().nextLine();
                getWrongAnswer(answerUser, rightAnswer, name);
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
