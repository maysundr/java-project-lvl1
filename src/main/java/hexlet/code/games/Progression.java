package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.startEngine;


public class Progression {

    //private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int LENGTH_PROGRESSION = 10;
    private static int[] progression = new int[LENGTH_PROGRESSION];

    public static void progressionGame() {

        String description = "What number is missing in the progression?";

        String[] questionArr = new String[CORRECT_ANSWER];
        String[] rightAnswerArr = new String[CORRECT_ANSWER];
        int[] checkArr = new int[CORRECT_ANSWER];
        for (int i = 0; i < questionArr.length; i++) {

            checkArr[i] = getProgression();
            questionArr[i] = "Question: " + getViewOfProgression(checkArr[i]);
            rightAnswerArr[i] = String.valueOf(checkArr[i]);
        }
        startEngine(description, questionArr, rightAnswerArr);

        /*var name = greetUser();

        getDescription(DESCRIPTION);

        for (int i = 0; i < CORRECT_ANSWER; i++) {

            var rightAnswer = getProgression();

            System.out.println("Question: " + getViewOfProgression(rightAnswer));

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

         */
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
        return sb.toString();
    }

    private static int getProgression() {

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
}
