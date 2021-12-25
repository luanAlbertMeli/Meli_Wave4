package Aula4Parte2.entities;

public class FuncionarioPj extends Funcionario implements Pagamento{
    public double valorHora;
    public double horasTrabalhadas;

    public FuncionarioPj(String nome, String tipoContrato, double valorHora, double horasTrabalhadas) {
        super(nome, tipoContrato);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }


    @Override
    public double pagarSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }
    @Override
    public String toString() {
        return "Nome funcionario: " + getNome() + "\n"
                + "Horas trabalhadas: " + getHorasTrabalhadas() + "\n"
                + "Salario total pago: " + pagarSalario();
    }
}
