package br.com.santandercoders.DesignPatterns.templatemethod;

public class TesteReparaVeiculoComTemplate {
    public static void main (String[] args){
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(50);

        ReparoVeiculoService rpl = new ReparaVeiculoLuxoServiceComTemplate(veiculoDeLuxo);
        rpl.reparaVeiculo();

        System.out.println("-----------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparoVeiculoService rpc = new ReparaVeiculoComumServiceComTemplate(veiculoComum);
        rpc.reparaVeiculo();


    }
}
