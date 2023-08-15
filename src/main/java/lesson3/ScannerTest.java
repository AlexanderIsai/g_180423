package lesson3;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the name");
        String name = scan.nextLine();

        System.out.println("Input your gender");
        char gender = scan.nextLine().charAt(0);

        System.out.println("Input your age");
        int age = scan.nextInt();

        System.out.println("Input your telephone number");
        long phoneNumber = scan.nextLong();

        System.out.println("Input ID");
        double id = scan.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("ID: " + id);


    }
}
