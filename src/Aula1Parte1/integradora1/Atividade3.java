package Aula1Parte1.integradora1;
import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor para saber ele se é primo:");
        int n = sc.nextInt();

        if(ehPrimo(n)){
            System.out.println(n + " é primo.");
        }else{
            System.out.println(n + " não é primo.");
        }
    }
    //false se não primo e true se primo

    public static boolean ehPrimo(int numero){
        if((numero%2==0)&&(numero>2)||(numero<2)){
            return false;
        }
        return true;
    }

}


    