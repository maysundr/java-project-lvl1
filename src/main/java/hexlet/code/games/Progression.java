package hexlet.code.games;

import hexlet.code.Engine;


public class Progression extends Engine {

    public static void progressionGame() {

        var name = Engine.greetUser();

        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < CORRECT_ANSWER; i++) {

            System.out.print("Question: ");

            var rightAnswer = getProgression();

            System.out.print("Your answer: ");

            if (getConsole().hasNextInt()) {
                var answerUser = getConsole().nextInt();
                if (rightAnswer == answerUser) {
                    getCorrectAnswer();
                } else {
                    getWrongAnswer(answerUser, rightAnswer, name);
                }
            } else {
                var answerUser = getConsole().nextLine();
                System.out.println(answerUser);
                getWrongAnswer(answerUser, rightAnswer, name);
            }
        }
        getCongratulation(name);
    }

    private static int getProgression() {

        final int lengthProgression = 10;
        final int missingElement = generateRandomInt(lengthProgression);
        final int startElement = generateRandomInt(lengthProgression);
        final int stepProgression = generateRandomInt(lengthProgression + 1);

        int[] progression = new int[lengthProgression];

        StringBuilder sb = new StringBuilder();

        int rightAnswer = 0;

        for (int i = 0; i < lengthProgression; i++) {

            progression[i] = startElement + stepProgression * i;

            if (i == missingElement) {
                rightAnswer = progression[i];
                sb.append(".. ");
            } else {
                sb.append(progression[i]).append(" ");
            }
        }
        System.out.println(sb);
        //System.out.println(rightAnswer);
        return rightAnswer;

    }
}
