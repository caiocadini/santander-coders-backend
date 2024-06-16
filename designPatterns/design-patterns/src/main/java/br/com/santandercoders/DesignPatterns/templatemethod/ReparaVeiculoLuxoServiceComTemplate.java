package br.com.santandercoders.DesignPatterns.templatemethod;

public class ReparaVeiculoLuxoServiceComTemplate extends ReparoVeiculoService{

    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoLuxoServiceComTemplate(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }

    @Override
    protected void notificarReparoParaSeguradora(){
        System.out.println("Dá para salvar este carro de luxo");
    }
}
