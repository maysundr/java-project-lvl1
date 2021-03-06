package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_CALC;
import static hexlet.code.Engine.GAME_EVEN;
import static hexlet.code.Engine.GAME_EXIT;
import static hexlet.code.Engine.GAME_GCD;
import static hexlet.code.Engine.GAME_GREET;
import static hexlet.code.Engine.GAME_PRIME;
import static hexlet.code.Engine.GAME_PROGRESSION;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        var numberGame = scanner.nextInt();
        System.out.println();

        if (numberGame == GAME_EXIT) {
            System.exit(0);
        }
        if (numberGame == GAME_GREET) {
            Engine.greetUser();
        }
        if (numberGame == GAME_EVEN) {
            Even.evenGame();
        }
        if (numberGame == GAME_CALC) {
            Calc.calcGame();
        }
        if (numberGame == GAME_GCD) {
            GCD.gcdGame();
        }
        if (numberGame == GAME_PROGRESSION) {
            Progression.progressionGame();
        }
        if (numberGame == GAME_PRIME) {
            Prime.primeGame();
        }
    }
}
