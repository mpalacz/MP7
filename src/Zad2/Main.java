package Zad2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Tablica początkowa:\n" + Arrays.toString(array));

        int min = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] < array[min])
                min = i;

        System.out.println("Wartość minimalna zajduje się na indeksie o numerze: " + min);
    }
}
