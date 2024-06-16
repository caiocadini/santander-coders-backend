package br.com.santandercoders.DesignPatterns.templatemethod;

public abstract class ReparoVeiculoService {
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

    private void entradaOficina(){
        System.out.println("Entrando na oficina...");
    }
    private void  analisarDados(){
        System.out.println("Analisando Dados...");
    }
    private void repararVeiculo(){
        System.out.println("Reparando veículo...");
    }
    private void notificarPerdaTotalParaSeguradora(){
        System.out.println("Perda total");
    }
    //Se colocar protected abre a oportunidade de conseguir sobrescrever o método
    protected void notificarReparoParaSeguradora(){
        System.out.println("Há reparo");
    }
    protected abstract boolean veiculoParaReparo();
}
