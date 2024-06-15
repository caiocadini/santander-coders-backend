package br.com.santandercoders.DesignPatterns.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {

    private static BotaoRegistry botaoRegistry;

    private static Map<String, Botao> REGISTRY = new HashMap<>();

    private BotaoRegistry(){
        initializeRegistry();
    }

    private void initializeRegistry(){
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("amarelo");
        botaoAmarelo.setAltura(35);
        botaoAmarelo.setLargura(125);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.GROSSA);

        Botao botaoVermelho = new Botao();
        botaoVermelho.setCor("vermelho");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(TipoBordaEnum.TRACEJADA);

        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho); // Corrected key
        REGISTRY.put("BOTAO_AZUL", botaoAzul);
    }

    public static BotaoRegistry getInstance(){
        if(Objects.isNull(botaoRegistry)) {
            botaoRegistry = new BotaoRegistry();
        }
        return botaoRegistry;
    }

    public static Botao getBotao(String chave){
        return BotaoFactory.getInstance(REGISTRY.get(chave));// Return null if no matching prototype is found
    }

    public static void addRegistry(String chave, Botao newButton){
        REGISTRY.put(chave, newButton);
    }
}
