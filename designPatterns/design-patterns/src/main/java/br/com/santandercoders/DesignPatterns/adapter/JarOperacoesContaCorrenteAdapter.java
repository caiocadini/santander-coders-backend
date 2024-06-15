package br.com.santandercoders.DesignPatterns.adapter;

import java.math.BigDecimal;

public class JarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrente jarContaCorrente;

    public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarContaCorrente) {
        this.jarContaCorrente = jarContaCorrente;
    }

    public void saca(BigDecimal valorPretendido){
        if(jarContaCorrente.validaSaldo(valorPretendido)){
            jarContaCorrente.saca(valorPretendido);
        }else{
            throw new IllegalArgumentException("Valor para saque não permitido");
        }
    }
    public void deposita(BigDecimal valor){
       jarContaCorrente.deposita(valor);
    }
}
