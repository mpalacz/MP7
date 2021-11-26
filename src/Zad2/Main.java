package Zad2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Tablica początkowa:\n" + Arrays.toString(array));

        int licznik = 0;
        boolean czySzukac = true;

        for (int j = 0; j < array.length && czySzukac; j++) {
            licznik++;
            czySzukac = false;
            int min = j;
            int max = array.length - 1 - j;
            for (int i = j; i < array.length - j; i++) {
                licznik++;
                if (array[i] < array[min]) {
                    min = i;
                    czySzukac = true;
                    licznik++;
                } else if (array[i] > array[max]){
                    max = i;
                    czySzukac = true;
                    licznik++;
                }
            }
            int x = array[min];
            if (j == max) max = min;
            array[min] = array[j];
            array[j] = x;

            x = array[max];
            array[max] = array[array.length - 1 - j];
            array[array.length - 1 - j] = x;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(licznik);
    }
}
