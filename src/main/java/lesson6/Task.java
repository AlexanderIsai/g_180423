package lesson6;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the language - ru/eng/ge");
        String lang = scanner.nextLine().toLowerCase();

        switch (lang) {
            case "ru":
                System.out.println("You`ve chosen RU");
                break;
            case "eng":
                System.out.println("You`ve chosen ENG");
                break;
            case "ge":
                System.out.println("You`ve chosen GE");
                break;
            default:
                System.out.println("I don`t understand what you`ve done");
        }

    }
}
