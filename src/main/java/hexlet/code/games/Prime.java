package hexlet.code.games;


import static hexlet.code.Engine.ANSWER_NO;
import static hexlet.code.Engine.ANSWER_YES;
import static hexlet.code.Engine.CORRECT_ANSWER;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.startEngine;

public class Prime {

    //private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void primeGame() {

        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questionArr = new String[CORRECT_ANSWER];
        String[] rightAnswerArr = new String[CORRECT_ANSWER];
        for (int i = 0; i < questionArr.length; i++) {

            var randomNumber = getRandomNumber();

            questionArr[i] = String.valueOf(randomNumber);
            rightAnswerArr[i] = isPrime(randomNumber) ? ANSWER_YES : ANSWER_NO;

        }
        startEngine(description, questionArr, rightAnswerArr);

        /*var name = greetUser();

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

         */
    }


    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
