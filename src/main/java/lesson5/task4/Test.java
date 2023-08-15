package lesson5.task4;

public class Test {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        boolean result = a < b;

        System.out.println(result);

        boolean x = true;
        boolean y = false;

        boolean result1 = x || y;
        System.out.println(result1);

        boolean result2 = (a > b || x) && !(a < b);
        System.out.println(result2);



    }
}
