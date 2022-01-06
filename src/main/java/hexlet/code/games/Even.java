package hexlet.code.games;


import hexlet.code.Engine;


public class Even extends Engine {

    public static void evenGame() {

        var name = Engine.greetUser();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (int i = 0; i < CORRECT_ANSWER; i++) {

            var randomNumber = Engine.getRandomNumber();

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
