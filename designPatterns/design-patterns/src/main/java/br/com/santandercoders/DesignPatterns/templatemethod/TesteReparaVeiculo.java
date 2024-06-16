package br.com.santandercoders.DesignPatterns.templatemethod;

public class TesteReparaVeiculo {
    public static void main (String[] args){
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(50);

        ReparaVeiculoLuxoService rpl = new ReparaVeiculoLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("-----------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparaVeiculoComumService rcs = new ReparaVeiculoComumService(veiculoComum);
        rcs.reparaVeiculo();

    }
}
