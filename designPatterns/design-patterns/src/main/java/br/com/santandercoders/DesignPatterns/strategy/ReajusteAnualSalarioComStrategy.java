package br.com.santandercoders.DesignPatterns.strategy;

import java.math.BigDecimal;

public class ReajusteAnualSalarioComStrategy {
    public void calculoReajusteAnual(Funcionario funcionario, CalcularReajusteAnualSalario calculador){
        calculador.calcularReajusteAnual(funcionario);

    }
}
