package lesson8.task4;

import java.util.Arrays;

import static lesson8.task4.Practice.createRandomArray;

public class StringArrayTest {

    public static void main(String[] args) {


        System.out.println("The last day of week");
        showLastDayOfWeek();
        System.out.println("Random array");
        searchMaxValueOfArray();
    }
    public static void showLastDayOfWeek(){
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(week[week.length-1]);
    }
    public static void searchMaxValueOfArray(){
        int[] randomIntArray = createRandomArray();
        System.out.println(Arrays.toString(randomIntArray));
        Arrays.sort(randomIntArray);
        System.out.println("The MAX of Random array - " + randomIntArray[randomIntArray.length-1]);
    }
}
