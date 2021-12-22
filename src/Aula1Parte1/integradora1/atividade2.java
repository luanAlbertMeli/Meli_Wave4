package Aula1Parte1.integradora1;
import java.util.Scanner;

public class atividade2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Informe um valor para n:");
            int n = sc.nextInt();

            System.out.println("Informe um valor para m:");
            int m = sc.nextInt();

            System.out.println("Numeros multiplos de " + m + ":");
            for(int i =1; i <=n;i++ ){
                System.out.print(m * i + ";");
            }

        }
 }
