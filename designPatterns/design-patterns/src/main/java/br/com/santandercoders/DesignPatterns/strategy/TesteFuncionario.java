package br.com.santandercoders.DesignPatterns.strategy;

import java.math.BigDecimal;

public class TesteFuncionario {
    public static void main(String[] args){
        ReajusteAnualSalario reajuste = new ReajusteAnualSalario();

        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("Caio");
        funcionarioCLT.setTipoContratacaoEnum(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("Marcos");
        funcionarioPJ.setTipoContratacaoEnum(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(10000));

        Funcionario funcionarioEstagio = new Funcionario();
        funcionarioEstagio.setNome("Caio");
        funcionarioEstagio.setTipoContratacaoEnum(TipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setSalario(new BigDecimal(2000));


        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);

        reajuste.calculoReajusteAnual(funcionarioCLT);

        reajuste.calculoReajusteAnual(funcionarioPJ);
        reajuste.calculoReajusteAnual(funcionarioEstagio);

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
    }


}
