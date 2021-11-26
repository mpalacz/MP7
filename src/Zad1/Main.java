package Zad1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Przed pętlą:\n" + Arrays.toString(array));

        int licznik = 0;

        for(int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;
                    licznik++;
                }
                licznik++;
            }
        }

        System.out.println();
        System.out.println("Po przejściu pętli:\n" + Arrays.toString(array));
        System.out.println("Ilość operacji: " + licznik);
    }
}
