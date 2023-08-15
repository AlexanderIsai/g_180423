package lesson7.task4;

import java.util.Scanner;

public class CycleDoWhileTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {

            System.out.println("Change the game mod");
            System.out.println("1. VS Player");
            System.out.println("2. VS Computer");

        option= scanner.nextInt();
        } while (option != 1 && option != 2);
    }
}
