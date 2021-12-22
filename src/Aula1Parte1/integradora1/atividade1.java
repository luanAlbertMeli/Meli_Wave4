package Aula1Parte1.integradora1;

import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe quantos números pares deseja exibir:");
        int n = entrada.nextInt();

        System.out.println("Números pares:");
        for(int i =1; i<=n; i++) {
            System.out.print(i * 2 + "; ");
        }
    }
}
