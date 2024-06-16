package br.com.santandercoders.DesignPatterns.templatemethod;

public class ReparaVeiculoComumServiceComTemplate extends ReparoVeiculoService{

    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoComumServiceComTemplate(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }
}
