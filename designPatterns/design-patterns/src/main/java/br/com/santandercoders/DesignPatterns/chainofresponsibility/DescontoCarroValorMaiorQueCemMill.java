package br.com.santandercoders.DesignPatterns.chainofresponsibility;

import java.math.BigDecimal;

public class DescontoCarroValorMaiorQueCemMill extends DescontoCarro{

    public DescontoCarroValorMaiorQueCemMill(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }
    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if(carro.getPreco().compareTo(new BigDecimal(100000.00))>0){
            return valorVenda.subtract(new BigDecimal(10000));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
