package br.com.santandercoders.DesignPatterns.strategy;

import java.math.BigDecimal;

public class Funcionario {
    private String nome;
    private BigDecimal salario;
    private TipoContratacaoEnum tipoContratacaoEnum;


    public Funcionario() {
        this.nome = nome;
        this.salario = salario;
        this.tipoContratacaoEnum = tipoContratacaoEnum;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public TipoContratacaoEnum getTipoContratacaoEnum() {
        return tipoContratacaoEnum;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setTipoContratacaoEnum(TipoContratacaoEnum tipoContratacaoEnum) {
        this.tipoContratacaoEnum = tipoContratacaoEnum;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", tipoContratacaoEnum=" + tipoContratacaoEnum +
                '}';
    }
}
