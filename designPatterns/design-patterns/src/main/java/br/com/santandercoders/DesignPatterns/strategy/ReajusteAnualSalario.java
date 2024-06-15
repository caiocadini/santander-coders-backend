package br.com.santandercoders.DesignPatterns.strategy;

import java.math.BigDecimal;

public class ReajusteAnualSalario {

    public void calculoReajusteAnual(Funcionario funcionario){

        if (TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacaoEnum().name())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
        }else if(TipoContratacaoEnum.PJ.name().equals(funcionario.getTipoContratacaoEnum().name())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));

        }else if(TipoContratacaoEnum.ESTAGIO.name().equals(funcionario.getTipoContratacaoEnum().name())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));

        }
    }
}
