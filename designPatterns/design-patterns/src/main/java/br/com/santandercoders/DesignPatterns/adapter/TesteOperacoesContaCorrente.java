package br.com.santandercoders.DesignPatterns.adapter;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente{

    public static void main(String[] args){
        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente clientConta = new ClientJarOperacoesContaCorrente(jarConta);

        BigDecimal valorPretendidoSaque = new BigDecimal(1000);
        if(clientConta.validaSaldo(valorPretendidoSaque)){
            clientConta.saca(valorPretendidoSaque);
        }

        clientConta.deposita(new BigDecimal(500));
    }
}
