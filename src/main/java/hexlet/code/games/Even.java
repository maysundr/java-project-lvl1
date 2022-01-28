package hexlet.code.games;


import static hexlet.code.Engine.ANSWER_NO;
import static hexlet.code.Engine.ANSWER_YES;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.startEngine;


public class Even {

    public static void evenGame() {

        String description = "Answer 'yes' if number even otherwise answer 'no'.";

        String[] questionArr = new String[CORRECT_ANSWER];
        String[] rightAnswerArr = new String[CORRECT_ANSWER];
        for (int i = 0; i < questionArr.length; i++) {
            int number = getRandomNumber();
            questionArr[i] = String.valueOf(number);
            rightAnswerArr[i] = number % 2 == 0 ? ANSWER_YES : ANSWER_NO;

        }
        startEngine(description, questionArr, rightAnswerArr);
    }

}
