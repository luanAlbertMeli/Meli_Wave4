package Aula1Parte1.integradora1;

import java.util.Scanner;

public class atividade5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor para n");
        int n = entrada.nextInt();
        System.out.println("Informe um valor para m");
        int m = entrada.nextInt();
        System.out.println("Informe um valor para d");
        int d = entrada.nextInt();

        int quantidade = 0, k=0;
        int cont;
        String valor = "";

        while (quantidade < n) { //enquanto quantidade for menor que n
            cont=1; //contador
            valor=String.valueOf(k);//converte par string
            if(valor.charAt(valor.length()-1)==(char)d+'0') {
                for (int i = 0; i < valor.length()-1; i++) {
                    if(valor.charAt(i)==d+'0'){
                        cont++;
                        if(cont==m){
                            System.out.println(k+"");
                            quantidade++;
                            break;
                        }
                    }
                }
            }
            k++;
        }
    }
}
