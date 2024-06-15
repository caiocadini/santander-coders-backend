package br.com.santandercoders.DesignPatterns.adapter;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrenteAdapter {
    private JarOperacoesContaCorrenteAdapter jarContaAdapter;


    public ClientJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jarContaAdapter) {
        this.jarContaAdapter = jarContaAdapter;
    }

    public void saca(BigDecimal valorPretendidoSaque){
        jarContaAdapter.saca(valorPretendidoSaque);
    }

    public void deposita(BigDecimal valor){
        jarContaAdapter.deposita(valor);
    }
}
