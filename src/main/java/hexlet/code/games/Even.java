package hexlet.code.games;


import static hexlet.code.Engine.ANSWER_NO;
import static hexlet.code.Engine.ANSWER_YES;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.startEngine;


public class Even {

    public static void evenGame() {

        String description = "Answer 'yes' if number even otherwise answer 'no'.";
        String[][] questionAndRightAnswer = new String[CORRECT_ANSWER][2];
        for (int i = 0; i < questionAndRightAnswer.length; i++) {
            int number = getRandomNumber();
            questionAndRightAnswer[i][0] = String.valueOf(number);
            questionAndRightAnswer[i][1] = number % 2 == 0 ? ANSWER_YES : ANSWER_NO;

        }
        startEngine(description, questionAndRightAnswer);
    }

}
