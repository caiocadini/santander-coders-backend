package br.com.santandercoders.DesignPatterns.templatemethod;

public class ReparaVeiculoComumService {

    private VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoComumService(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    public void reparaVeiculo(){
        entradaOficina();
        analisarDados();
        if(veiculoParaReparo()){
            repararVeiculo();
            notificarReparoParaSeguradora();
        }else{
            notificarPerdaTotalParaSeguradora();
        }
    }

    public void entradaOficina(){
        System.out.println("Entrando na oficina...");
    }
    public void  analisarDados(){
        System.out.println("Analisando Dados...");
    }
    public void repararVeiculo(){
        System.out.println("Reparando veículo...");
    }
    public void notificarPerdaTotalParaSeguradora(){
        System.out.println("Perda total");
    }
    public void notificarReparoParaSeguradora(){
        System.out.println("Há reparo");
    }
    private boolean veiculoParaReparo(){
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }
}
