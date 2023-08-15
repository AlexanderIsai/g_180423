package lesson4.task2;

public class MethodTest {

    public static void main(String[] args) {

        System.out.println("Program starts");
        System.out.println("Call the method");
        int result = sumTwoNumbers(7, 2);
        System.out.println("Result is - " + result);
        System.out.println("End the program");

        System.out.println(concatStrings("Hello, ", "World!"));

    }

    public static String concatStrings (String first, String second) {
        return first + second;
    }

    public static int sumTwoNumbers (int first, int second){
        System.out.println("Method is working");
        int sum = first + second;
        System.out.println("Method is finished");
        return sum;
    }
}
