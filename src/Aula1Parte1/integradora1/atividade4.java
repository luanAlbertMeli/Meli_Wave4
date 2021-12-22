package Aula1Parte1.integradora1;

import java.util.Scanner;

import static Aula1Parte1.integradora1.Atividade3.ehPrimo;


public class atividade4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor limite para a exibicao de numeros primos");
        int m = sc.nextInt();

        for (int i = 2; i <m; i++) {
            if( ehPrimo(i)){
                System.out.println(i + " é primo.");
            }
        }
    }
}

