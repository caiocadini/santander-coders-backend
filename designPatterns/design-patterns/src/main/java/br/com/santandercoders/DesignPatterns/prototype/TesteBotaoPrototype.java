package br.com.santandercoders.DesignPatterns.prototype;

public class TesteBotaoPrototype {
    public static void main(String[] args){
        Botao botao = BotaoRegistry.getInstance().getBotao("BOTAO_VERMELHO");
        System.out.println(botao);

        Botao botaoAmarelo = BotaoRegistry.getInstance().getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);

        Botao botaoAzul = BotaoRegistry.getInstance().getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        Botao botaoPreto = new Botao();
        botaoPreto.setCor("Preto");
        botaoPreto.setAltura(35);
        botaoPreto.setLargura(120);
        botaoPreto.setTipoBorda(TipoBordaEnum.TRACEJADA);

        BotaoRegistry.addRegistry("BOTAO_PRETO", botaoPreto);

        Botao botaoPreto1 = BotaoRegistry.getInstance().getBotao("BOTAO_PRETO");
        System.out.println(botaoPreto1);
    }
}
