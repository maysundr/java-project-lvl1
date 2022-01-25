package hexlet.code.games;

import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.startEngine;

public class GCD {

    //private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

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

        /*var name = greetUser();

        getDescription(DESCRIPTION);

        for (int i = 0; i < CORRECT_ANSWER; i++) {

            var randomNumberLeft = getRandomNumber();
            var randomNumberRight = getRandomNumber();

            System.out.print("Question: ");
            System.out.println(randomNumberLeft + " " + randomNumberRight);

            var rightAnswer = getGcd(randomNumberLeft, randomNumberRight);

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

         */

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
