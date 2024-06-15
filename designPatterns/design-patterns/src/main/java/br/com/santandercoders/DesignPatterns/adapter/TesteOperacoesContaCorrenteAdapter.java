package br.com.santandercoders.DesignPatterns.adapter;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrenteAdapter {
    public static void main(String[] args){
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);
        ClientJarOperacoesContaCorrenteAdapter clientConta = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoSaque = new BigDecimal(1000);
        clientConta.saca(valorPretendidoSaque);

        clientConta.deposita(new BigDecimal(500));
    }
}
