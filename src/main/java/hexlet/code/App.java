package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_CALC;
import static hexlet.code.Engine.GAME_EVEN;
import static hexlet.code.Engine.GAME_EXIT;
import static hexlet.code.Engine.GAME_GCD;
import static hexlet.code.Engine.GAME_GREET;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner console = new Scanner(System.in);
        int numberGame = console.nextInt();
        System.out.println();

        if (numberGame == GAME_EXIT) {
            console.close();
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
    }
}
