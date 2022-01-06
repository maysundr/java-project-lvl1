package hexlet.code.games;

import hexlet.code.Engine;

public class GCD extends Engine {


    public static void gcdGame() {

        var name = Engine.greetUser();

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < CORRECT_ANSWER; i++) {

            var randomNumberLeft = Engine.getRandomNumber();
            var randomNumberRight = Engine.getRandomNumber();

            System.out.print("Question: ");
            System.out.println(randomNumberLeft + " " + randomNumberRight);

            var rightAnswer = getGcd(randomNumberLeft, randomNumberRight);

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
