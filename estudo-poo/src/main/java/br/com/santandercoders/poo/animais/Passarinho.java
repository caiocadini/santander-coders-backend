package br.com.santandercoders.poo.animais;

public class Passarinho extends Animal{
    static int numeroDePassaros;

    public Passarinho(String nome, String cor, String estadoDeEspirito, double peso, int altura){
        super(nome, cor, estadoDeEspirito, peso, altura);
        numeroDePassaros++;
    }

    @Override
    public void soar(){
        System.out.println("PIU PIU");
    }
}
