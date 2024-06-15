package br.com.santandercoders.DesignPatterns.prototype;

public class BotaoAmarelo extends Botao{
    public BotaoAmarelo() {
        setCor("amarelo");
        setAltura(35);
        setLargura(125);
        setTipoBorda(TipoBordaEnum.GROSSA);
    }
}
