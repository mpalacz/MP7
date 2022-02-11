package Zad3;

import java.util.Arrays;

public class Main {
    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                int x = array[i];
                array[i] = array[j];
                array[j] = x;
            }
        }
        int x = array[i + 1];
        array[i + 1] = array[end];
        array[end] = x;
        return i + 1;
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
