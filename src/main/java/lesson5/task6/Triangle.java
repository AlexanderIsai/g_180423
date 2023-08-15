package lesson5.task6;

public class Triangle {

    public static void main(String[] args) {

        int a = 7;
        int b = 6;
        int c = 7;

        if (a == b && a == c){
            System.out.println("Triangle - ravnostoronniy");
        } else if (a != b && a != c && b != c) {
            System.out.println("Triangle - raznostoronniy");
        } else {
            System.out.println("Triangle - ravnobedrenniy");
        }
    }
}
