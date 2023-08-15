package lesson8;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        //createNewNumber();
        handlingString();


    }

    public static void createNewNumber(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");

        int first = scanner.nextInt();
        while (first <=0 || first > 9){
            System.out.println("Please again");
            first = scanner.nextInt();
        }

        System.out.println("Input second number");
        int second = scanner.nextInt();
        while (second <=0 || second > 9){
            System.out.println("Please again");
            second = scanner.nextInt();
        }
        System.out.println("Your new number = " + (first * 10 + second));
    }

    public static void handlingString(){
        String str = "Hello, friend!";

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) != ' ') {
                if (str.charAt(i) == '!'){
                    System.out.print(str.charAt(i));
                    break;
                }
                System.out.print(str.charAt(i) + "-");
            }
        }
    }
}
