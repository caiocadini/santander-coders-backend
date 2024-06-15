package br.com.santandercoders.DesignPatterns.strategy;

import java.math.BigDecimal;

public class TesteFuncionarioComStrategy {
    public static void main(String[] args){
        ReajusteAnualSalarioComStrategy reajuste = new ReajusteAnualSalarioComStrategy();

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

        reajuste.calculoReajusteAnual(funcionarioCLT, new CalculadorReajusteSalarioCLT());

        reajuste.calculoReajusteAnual(funcionarioPJ, new CalculadorReajusteSalarioPJ());
        reajuste.calculoReajusteAnual(funcionarioEstagio, new CalculadorReajusteSalarioESTAGIO());

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
    }


}
