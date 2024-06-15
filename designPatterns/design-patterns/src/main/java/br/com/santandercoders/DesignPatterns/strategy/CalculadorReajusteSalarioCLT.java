package br.com.santandercoders.DesignPatterns.strategy;


import java.math.BigDecimal;

public class CalculadorReajusteSalarioCLT implements CalcularReajusteAnualSalario{


    @Override
    public void calcularReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
    }
}
