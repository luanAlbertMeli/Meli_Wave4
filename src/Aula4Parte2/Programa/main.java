package Aula4Parte2.Programa;

import Aula4Parte2.entities.Funcionario;
import Aula4Parte2.entities.FuncionarioClt;
import Aula4Parte2.entities.FuncionarioPj;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe o nome do funcionario");
        String nome = sc.next();

        System.out.println("Informe o nome do tipo do contrato");
        String tipoContrato = sc.next().toLowerCase();

        Funcionario funcionario = new Funcionario(nome, tipoContrato);
        if(tipoContrato.equals("clt")){
            System.out.println("Informe o nome do cargo");
            String cargo = sc.next();

            System.out.println("Informe se a meta foi batida");
            System.out.println("Informe s- para SIM e n- para Não");
            String repostaMetaBatida = sc.next().toLowerCase();
            boolean metaBatida = false;

            if(repostaMetaBatida.equals("s")){
                metaBatida = true;
            }
            FuncionarioClt funcionarioClt = new FuncionarioClt(funcionario.getNome(), funcionario.getTipoContrato(), cargo, metaBatida);

            System.out.println("Deseja pagar esse funcionario?");
            System.out.println("Informe s- para SIM e n- para Não");
            String repostaPagarSalario = sc.next().toLowerCase();

            if(repostaPagarSalario.equals("s")){
                System.out.println(funcionarioClt.toString());
            }


        }else{
            System.out.println("Informe o valor da Hora");
            double valorHora = sc.nextDouble();

            System.out.println("Informe quantas horas foram trabalhadas");
            double horasTrabalhadas = sc.nextDouble();
            FuncionarioPj funcionarioPj = new FuncionarioPj(funcionario.getNome(), funcionario.getTipoContrato(),valorHora, horasTrabalhadas);

            System.out.println("Deseja pagar esse funcionario?");
            System.out.println("Informe s- para SIM e n- para Não");
            String repostaPagarSalario = sc.next().toLowerCase();

            if(repostaPagarSalario.equals("s")) {
                System.out.println(funcionarioPj.toString());
            }
        }
    }
}
