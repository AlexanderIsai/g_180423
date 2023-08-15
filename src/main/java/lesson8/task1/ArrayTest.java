package lesson8.task1;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] intArray = new int[10];
        double[] doubleArray;
        boolean[] booleanArray;

        int[] intArray1 = {7, 2, 8, 9, 2, 5, 7, 1, 0};

        intArray[5] = 15;

        for (int i = 0; i < intArray1.length; i++){
            System.out.print(intArray1[i] + ", ");
        }

        System.out.println();
        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray1).length());

        for (int value: intArray1) {
            System.out.print(value + ", ");
        }

        System.out.println();

        for (int i = intArray1.length - 1; i >= 0; i -= 2){
            System.out.print(intArray1[i] + ", ");
        }


    }
}
