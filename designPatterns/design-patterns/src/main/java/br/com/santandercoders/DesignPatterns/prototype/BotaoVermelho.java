package br.com.santandercoders.DesignPatterns.prototype;

public class BotaoVermelho extends Botao{
    public BotaoVermelho() {
        setAltura(30);
        setCor("vermelho");
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
