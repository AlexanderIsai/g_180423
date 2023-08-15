package lesson9.search;

import lesson9.sort.SortUtils;

import java.util.Arrays;

import static lesson9.search.SearchUtils.*;

public class SearchTest {

    public static void main(String[] args) {

        int[] array = {3, 7, 1, 3, 8, 9, 14, 68, 12, 0, 7, 2, 16};

        System.out.println("Result of searching: ");
        System.out.println(linearSearch(array, 31));

        Arrays.sort(array);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array, 14));
        System.out.println("Result of jumping: ");
        System.out.println(jumpSearch(array, 68));

        array = new int[]{3, 7, 1, 3, 8, 9, 14, 68, 12, 0, 7, 2, 16};
        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(array));

        SortUtils.bubbleSort(array);
        System.out.println("Sort with bubble");
        System.out.println(Arrays.toString(array));

        array = new int[]{3, 7, 1, 3, 8, 9, 14, 68, 12, 0, 7, 2, 16};
        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(array));
        SortUtils.insertionSort(array);
        System.out.println("Sort with insert");
        System.out.println(Arrays.toString(array));

        array = new int[]{3, 7, 1, 3, 8, 9, 14, 68, 12, 0, 7, 2, 16};
        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(array));
        SortUtils.selectionSort(array);
        System.out.println("Sort with selection");
        System.out.println(Arrays.toString(array));
    }
}
