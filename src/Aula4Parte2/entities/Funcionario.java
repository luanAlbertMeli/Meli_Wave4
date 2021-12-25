package Aula4Parte2.entities;

public class Funcionario {
    private String nome;
    private String tipoContrato;

    public Funcionario(String nome, String tipoContrato) {
        this.nome = nome;
        this.tipoContrato = tipoContrato;
    }

    public  String getNome() {
        return nome;
    }

    public  void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
