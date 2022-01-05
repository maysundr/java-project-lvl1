package hexlet.code.games;

import hexlet.code.Engine;


public class Progression extends Engine {

    public static void progressionGame() {
        int index = 0;
        var name = Engine.greetUser();
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < CORRECT_ANSWER; i++) {
            System.out.print("Question: ");
            var rightAnswer = getProgression();
            System.out.print("Your answer: ");

            if (getConsole().hasNextInt()) {
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

    public static int getProgression() {

        final int lengthProgression = 10;
        final int missingElement = generateRandomInt(lengthProgression);
        final int startElement = generateRandomInt(lengthProgression);
        final int stepProgression = generateRandomInt(lengthProgression);

        int[] progression = new int[lengthProgression];

        StringBuilder sb = new StringBuilder();

        int rightAnswer = 0;

        for (int i = 0; i < lengthProgression; i++) {

            progression[i] = startElement + stepProgression * i;

            if (i == missingElement) {
                rightAnswer = progression[i];
                sb.append("..");
                //System.out.println(rightAnswer);
            } else {
                sb.append(progression[i]).append(" ");
            }
        }
        System.out.println(sb);
        return rightAnswer;

    }
}
