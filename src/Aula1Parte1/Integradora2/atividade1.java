package Aula1Parte1.Integradora2;

import java.util.Arrays;
import java.util.Collections;

public class atividade1 {
    public static void main(String[] args) {

        Integer [] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12,127};

        Arrays.sort(array, Collections.reverseOrder());
        show(array);

        System.out.println();

        Arrays.sort(array);
        show(array);

    }
    public static void show(Integer[] a){
        for (int n : a) {
            System.out.print(n + " ");
        }
    }
}
