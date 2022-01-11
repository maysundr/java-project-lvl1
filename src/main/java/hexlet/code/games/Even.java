package hexlet.code.games;


import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWER_NO;
import static hexlet.code.Engine.ANSWER_YES;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.getCongratulation;
import static hexlet.code.Engine.getCorrectAnswer;
import static hexlet.code.Engine.getDescription;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.getWrongAnswer;
import static hexlet.code.Engine.greetUser;


public class Even {

    private static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static void evenGame() {

        var name = greetUser();

        getDescription(DESCRIPTION);

        for (int i = 0; i < CORRECT_ANSWER; i++) {

            var randomNumber = getRandomNumber();

            System.out.println("Question: " + randomNumber);
            var answerUser = Engine.getAnswerUser();

            if ((answerUser.equals(ANSWER_YES) && randomNumber % 2 == 0)
                    || (answerUser.equals(ANSWER_NO) && randomNumber % 2 != 0)) {
                getCorrectAnswer();
            } else if (answerUser.equals(ANSWER_YES)) {
                getWrongAnswer(answerUser, ANSWER_NO, name);
            } else if (answerUser.equals(ANSWER_NO)) {
                getWrongAnswer(answerUser, ANSWER_YES, name);
            } else {
                getWrongAnswer(answerUser, ANSWER_NO, name);
            }
        }
        getCongratulation(name);
    }
}
