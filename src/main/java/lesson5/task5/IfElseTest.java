package lesson5.task5;

public class IfElseTest {

    public static void main(String[] args) {

        System.out.println("Program is beginning");


        int a = 10;
        int b = 15;

        if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a != b");
        }

        System.out.println();
        System.out.println("Exercise 2");

        if (a > b) {
            System.out.println("a > b");
            if (a % 2 == 0){
                System.out.println("a is even");
            }
        }


        System.out.println("Program is end");

    }
}
