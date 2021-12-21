package hexlet.code;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner console = new Scanner(System.in);
        int numberGame = console.nextInt();
        System.out.println();
        if (numberGame == 1) {
            Cli.greetUser();
        }
        if (numberGame == 0) {
            console.close();
        }
        //Cli.greetUser();
    }
}
