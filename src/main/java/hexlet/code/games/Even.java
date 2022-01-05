package hexlet.code.games;


import hexlet.code.Engine;


public class Even extends Engine {

    public static void evenGame() {
        var name = Engine.greetUser();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int index = 0;
        for (int i = 0; i < CORRECT_ANSWER; i++) {
            var randomNumber = Engine.getRandomNumber();
            System.out.println("Question: " + randomNumber);
            var answerEven = Engine.getAnswerEven();
            if ((answerEven.equals(ANSWER_YES) && randomNumber % 2 == 0)
                    || (answerEven.equals(ANSWER_NO) && randomNumber % 2 != 0)) {
                System.out.println("Correct!");
                index++;
            } else if (answerEven.equals(ANSWER_YES)) {
                System.out.println("'" + answerEven + "'"
                        + " is wrong answer ;(. Correct answer was " + ANSWER_NO + ".");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            } else if (answerEven.equals(ANSWER_NO)) {
                System.out.println("'" + answerEven + "'"
                        + " is wrong answer ;(. Correct answer was " + "'" + ANSWER_YES + "'.");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            } else {
                System.out.println("'" + answerEven + "'"
                        + " is wrong answer ;(. Correct answer was " + "'" + ANSWER_NO + "'" + ".");
                System.exit(0);
            }
        }
        if (index == CORRECT_ANSWER) {
            System.out.println("Congratulations, " + name + "!");
        }

    }

}
