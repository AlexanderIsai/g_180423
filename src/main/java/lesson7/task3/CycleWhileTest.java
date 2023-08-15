package lesson7.task3;

import java.util.Scanner;

public class CycleWhileTest {

    public static void main(String[] args) {

        int i = 0;

//        while (i < 10) {
//            System.out.print(i + " ");
//            i++;
//        }

        System.out.println("Input login min 6 symbols");
        String login = "";
        Scanner scanner = new Scanner(System.in);

        while (login.length() < 6){
            login = scanner.nextLine();
        }
        System.out.println("You`ve chosen your login - " + login);
    }
}
