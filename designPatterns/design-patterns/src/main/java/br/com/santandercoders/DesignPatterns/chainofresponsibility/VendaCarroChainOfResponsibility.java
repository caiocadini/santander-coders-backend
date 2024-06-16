package br.com.santandercoders.DesignPatterns.chainofresponsibility;

import java.math.BigDecimal;

public class VendaCarroChainOfResponsibility {
    public BigDecimal calcularValorVenda(Carro carro){
        DescontoCarro desconto = new DescontoCarroFiat(new DescontoCarroFord(new DescontoCarroValorMaiorQueCemMill(new SemDireitoADesconto(null))));
        return desconto.aplicaDesconto(carro);
    }
}
