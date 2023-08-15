package lesson7.task2;

public class CycleTest {

    public static void main(String[] args) {


        int res = 0;
         for (int i = 1; i < 21; i++) {
             if (i % 3 == 0) {
                 res = res + i;
             }
         }
        System.out.println(res);
    }
}
