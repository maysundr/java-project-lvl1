package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc extends Engine {

    public static void calcGame() {
        var name = Engine.greetUser();
        int index = 0;
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
            Scanner console = new Scanner(System.in);
            var answerEven = console.nextInt();
            if (answerEven == rightAnswer) {
                System.out.println("Correct!");
                index++;
            } else {
                System.out.println("'" + answerEven + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + rightAnswer + "'.");
                System.exit(0);
            }
        }
        if (index == CORRECT_ANSWER) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    /*public static int generateRandomInt(){
        Random random = new Random();
        var i = random.nextInt(3);
        return i;
    }

     */

    public static char getExpression() {
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

    public static int getResultExpression(int a, int b, char operator) {
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
