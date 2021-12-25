package Aula4Parte2.entities;

public class FuncionarioClt extends  Funcionario implements Pagamento{
    public  String cargo;
    public  double salarioBase;
    public  boolean metaBatida;
    final double BONIFICACAO_TEC = 0.05;
    final double BONIFICACAO_ANALIST = 0.08;
    final double BONIFICACAO_GEREN = 0.125;
    final double BONIFICACAO_DIR = 0.03;
    final double SALARIO_TEC = 3200;
    final double SALARIO_ANALIST = 4000;
    final double SALARIO_GEREN = 6000;


    public FuncionarioClt(String nome, String tipoContrato, String cargo, boolean metaBatida) {
        super(nome, tipoContrato);
        this.cargo = cargo;
        this.metaBatida =metaBatida;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isMetaBatida() {
        return metaBatida;
    }

    public void setMetaBatida(boolean metaBatida) {
        this.metaBatida = metaBatida;
    }


    @Override
    public double pagarSalario() {

        switch (this.cargo){
            case "tecnico":
                return  SALARIO_TEC + (SALARIO_TEC * BONIFICACAO_TEC);

            case "gerente":
                return  SALARIO_GEREN + (SALARIO_GEREN * BONIFICACAO_GEREN);

            case "analista":
                return  SALARIO_ANALIST + (SALARIO_ANALIST * BONIFICACAO_ANALIST);

            case "diretor":
                return 0;

            default:
                return 0;
        }
    }

    public double getSalarioBase() {

        switch (this.cargo){
            case "tecnico":
                return  SALARIO_TEC;

            case "gerente":
                return  SALARIO_GEREN;

            case "analista":
                return  SALARIO_ANALIST;

            case "diretor":
                return 0;

            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return "Nome funcionario: " + getNome() + "\n"
                + "salario Base do calculo: " + this.getSalarioBase() + "\n"
                + "Salario total pago: " + pagarSalario();
    }
}
