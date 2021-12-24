package Aula4Parte2;

public class PagarSalario extends Pessoa {

    public PagarSalario(String nome, String cargo, double salarioBase, boolean metaBatida) {
        super(nome, cargo, salarioBase, metaBatida  );
    }

    public boolean isMetaBatida (){
        return metaBatida;
    }

    public double pagarSalario(double bonificacao){
        if (isMetaBatida()){
            return salarioBase + (salarioBase * bonificacao);
        }
        return salarioBase;
    }

}
