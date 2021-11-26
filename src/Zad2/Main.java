package Zad2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Tablica początkowa:\n" + Arrays.toString(array));

        int licznik = 0;
        //boolean czySzukac = true;

        for (int j = 0; j < array.length /*&& czySzukac*/; j++) {
            licznik++;
            //czySzukac = false;
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                licznik++;
                if (array[i] < array[min]) {
                    min = i;
                    //czySzukac = true;
                    licznik++;
                }
            }
            int x = array[min];
            array[min] = array[j];
            array[j] = x;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(licznik);
    }
}
