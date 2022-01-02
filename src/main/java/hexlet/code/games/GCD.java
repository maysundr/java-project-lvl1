package hexlet.code.games;

import hexlet.code.Engine;

public class GCD extends Engine {


    public static void gcdGame() {
        var name = Engine.greetUser();
        System.out.println("Find the greatest common divisor of given numbers.");
        int index = 0;
        for (int i = 0; i < CORRECT_ANSWER; i++) {
            var randomNumberLeft = Engine.getRandomNumber();
            var randomNumberRight = Engine.getRandomNumber();
            System.out.print("Question: ");
            System.out.println(randomNumberLeft + " " + randomNumberRight);
            var rightAnswer = getGcd(randomNumberLeft, randomNumberRight);
            System.out.print("Your answer: " + rightAnswer);
            if (getConsole().hasNextInt()) {
                //Engine.getGameBody(String.valueOf(rightAnswer), String.valueOf(answerEven), name);
                var answerEven = getConsole().nextInt();
                if (answerEven == rightAnswer) {
                    System.out.println("Correct!");
                    index++;
                } else {
                    System.out.println("'" + answerEven + "'" + " is wrong answer ;(. Correct answer was "
                            + "'" + rightAnswer + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    System.exit(0);
                }
            } else {
                var answerEven = getConsole().nextLine();
                System.out.println("'" + answerEven + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + rightAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        if (index == CORRECT_ANSWER) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    public static int getGcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
