package Aula1Parte1.Integradora2;

import java.time.LocalDate;

public class atividade2 {
    public static void main(String[] args) {
        double empresaX = 1.13;
        double percentualEmpresaX = 148.0 / 100.0;
        
        double empresaY = 18.4;
        double percentualEmpresaY = 38.0 / 100.0;

        int year = LocalDate.now().getYear();//pegando apenas o ano

        for (int i = year; i < year + 1000; i++) {
            empresaX += empresaX + (percentualEmpresaX * empresaX);
            empresaY += empresaY + (percentualEmpresaY * empresaY);

            System.out.println("Empresa X: " + i + " - " + empresaX);
            System.out.println("Empresa Y: " + i + " - " + empresaY);

            if (empresaX > empresaY) {
                System.out.println("Em " + i + " a empresaX passará a empresaY");
                break;
            }
        }
    }
}