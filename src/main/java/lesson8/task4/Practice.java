package lesson8.task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {


        printOddsInReverseOrder();
        System.out.println();

        int[] randomArray = createRandomArray();
        System.out.println(Arrays.toString(randomArray));
        System.out.println(calculateAmountOfEvents(randomArray));

    }

    public static int calculateAmountOfEvents (int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static int[] createRandomArray() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a size of array");
        int size = scanner.nextInt();
        System.out.println("Input a max value for diapason");
        int value = scanner.nextInt();
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++){
            result[i] = random.nextInt(value+1);
        }
        return result;
    }

    public static void printOddsInReverseOrder(){

        int sizeArray = 0;
        for (int i = 1; i < 100; i++){
            if (i % 2 != 0){
                sizeArray++;
            }
        }

        int[] array = new int[sizeArray];



        for (int i = 1; i < array.length; i++){
            array[i] = i * 2 + 1;
        }

        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + ", ");
        }
    }
}
