package hexlet.code;

import java.util.Scanner;

public class Cli {

    static void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner console = new Scanner(System.in);
        String userName = console.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

}
