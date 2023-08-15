package lesson12.task1;

import lesson11.task7.Cat;

import java.util.Arrays;

public class UtilsTestT {

    public static void main(String[] args) {

        System.out.println(Utils.calculate(2, 5, 1, 0));

        int[] array = Utils.getArrayBySize(5);
        System.out.println(Arrays.toString(array));

        Cat cat = new Cat();
        System.out.println(cat.feedCat(9));
        System.out.println(cat.feedCat(10));


    }
}
