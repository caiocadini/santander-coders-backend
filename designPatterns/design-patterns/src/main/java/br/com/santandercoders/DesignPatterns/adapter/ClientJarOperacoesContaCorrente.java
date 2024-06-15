package br.com.santandercoders.DesignPatterns.adapter;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrente {
    private JarOperacoesContaCorrente jocc;


    public ClientJarOperacoesContaCorrente(JarOperacoesContaCorrente jocc) {
        this.jocc = jocc;
    }

    public boolean validaSaldo(BigDecimal valorPretendidoSaque){
        return jocc.validaSaldo(valorPretendidoSaque);
    }

    public void saca(BigDecimal valorPretendidoSaque){
        jocc.saca(valorPretendidoSaque);
    }

    public void deposita(BigDecimal valor){
        jocc.deposita(valor);
    }
}
