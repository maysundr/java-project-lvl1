package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.getCongratulation;
import static hexlet.code.Engine.getConsole;
import static hexlet.code.Engine.getCorrectAnswer;
import static hexlet.code.Engine.getDescription;
import static hexlet.code.Engine.getWrongAnswer;
import static hexlet.code.Engine.greetUser;


public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void progressionGame() {

        var name = greetUser();

        getDescription(DESCRIPTION);

        for (int i = 0; i < CORRECT_ANSWER; i++) {

            System.out.print("Question: ");

            var rightAnswer = getProgression();

            System.out.print("Your answer: ");

            if (getConsole().hasNextInt()) {
                var answerUser = getConsole().nextInt();
                if (rightAnswer == answerUser) {
                    getCorrectAnswer();
                } else {
                    getWrongAnswer(String.valueOf(answerUser), String.valueOf(rightAnswer), name);
                }
            } else {
                var answerUser = getConsole().nextLine();
                System.out.println(answerUser);
                getWrongAnswer(answerUser, String.valueOf(rightAnswer), name);
            }
        }
        getCongratulation(name);
    }

    private static int getProgression() {

        final int lengthProgression = 10;
        final int missingElement = Engine.generateRandomInt(lengthProgression);
        final int startElement = Engine.generateRandomInt(lengthProgression);
        final int stepProgression = Engine.generateRandomInt(lengthProgression + 1);

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
        return rightAnswer;

    }
}
