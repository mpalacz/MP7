package Zad1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Przed pętlą:\n" + Arrays.toString(array));

        int licznik = 0;

        for(int j = 0; j < array.length - 1; j++) {
            licznik++;
            boolean czyPosortowana = true;
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;
                    licznik++;
                    czyPosortowana = false;
                }
                licznik++;
            }
            if(czyPosortowana)
                break;
        }

        System.out.println();
        System.out.println("Po przejściu pętli:\n" + Arrays.toString(array));
        System.out.println("Ilość operacji: " + licznik);
    }
}
