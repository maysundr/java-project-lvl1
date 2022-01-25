package hexlet.code.games;


import static hexlet.code.Engine.ANSWER_NO;
import static hexlet.code.Engine.ANSWER_YES;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.getCongratulation;
import static hexlet.code.Engine.getConsole;
import static hexlet.code.Engine.getCorrectAnswer;
import static hexlet.code.Engine.getDescription;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.getWrongAnswer;
import static hexlet.code.Engine.greetUser;

public class Prime {

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void primeGame() {

        var name = greetUser();

        getDescription(DESCRIPTION);

        for (int i = 0; i < CORRECT_ANSWER; i++) {

            System.out.print("Question: ");

            var randomNumber = getRandomNumber();
            var rightAnswer = getPrime(randomNumber);

            System.out.println(randomNumber);


            System.out.print("Your answer: ");

            var answerUser = getConsole().nextLine();

            if ((answerUser.equals(ANSWER_YES) && randomNumber == rightAnswer)
                    || (answerUser.equals(ANSWER_NO) && randomNumber != rightAnswer)) {
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


    private static int getPrime(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return j;
            }
        }
        return number;
    }
}
