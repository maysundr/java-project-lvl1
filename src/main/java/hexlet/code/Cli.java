package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {

    }

    public static void greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Hello, " + name + "!");
        console.close();
    }
}
