package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.startEngine;


public class Progression {

    private static final int LENGTH_PROGRESSION = 10;
    private static int[] progression = new int[LENGTH_PROGRESSION];

    public static void progressionGame() {

        String description = "What number is missing in the progression?";
        String[][] questionAndRightAnswer = new String[CORRECT_ANSWER][2];
        for (int i = 0; i < questionAndRightAnswer.length; i++) {
            int rightAnswer = getRightAnswer();
            questionAndRightAnswer[i][0] = getViewOfProgression(rightAnswer);
            questionAndRightAnswer[i][1] = String.valueOf(rightAnswer);
        }
        startEngine(description, questionAndRightAnswer);
    }


    private static int getRightAnswer() {
        int missingElement = Engine.generateRandomInt(LENGTH_PROGRESSION);
        int startElement = Engine.generateRandomInt(LENGTH_PROGRESSION);
        int stepProgression = Engine.generateRandomInt(LENGTH_PROGRESSION + 1);
        int rightAnswer = 0;
        for (int i = 0; i < LENGTH_PROGRESSION; i++) {
            progression[i] = startElement + stepProgression * i;
            if (i == missingElement) {
                rightAnswer = progression[i];
            }
        }
        return rightAnswer;
    }


    private static String getViewOfProgression(int missingElement) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < LENGTH_PROGRESSION; i++) {
            if (progression[i] == missingElement) {
                sb.append(".. ");
            } else {
                sb.append(progression[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
