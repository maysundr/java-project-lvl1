package hexlet.code.games;

import hexlet.code.Engine;

public class Prime extends Engine {

    public static void primeGame() {

        var name = Engine.greetUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < CORRECT_ANSWER; i++) {

            System.out.print("Question: ");

            var randomNumber = Engine.getRandomNumber();
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
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return i;
            }
        }
        return number;
    }
}
