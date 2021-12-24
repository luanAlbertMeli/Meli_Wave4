package Aula4Parte2;

import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Tecnicos tecnicos = new Tecnicos("Luan Abert", "tecnico",3.200, true);
        PagarSalario pagarSalario = new PagarSalario(tecnicos.nome, tecnicos.cargo, tecnicos.salarioBase, tecnicos.metaBatida);

        double result = pagarSalario.pagarSalario(tecnicos.bonificacao);
        System.out.printf("%.4f",result);

    }
}
