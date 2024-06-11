package br.com.santandercoders.poo.animais;

public class Gato extends Animal {
    static int numeroDeGatos;


    public Gato(String nome, String cor, String estadoDeEspirito, double peso, int altura) {
        super(nome, cor, estadoDeEspirito, peso, altura);
        numeroDeGatos++;
    }

    @Override
    public String toString(){
        return "Gato{" + "nome='" + this.nome + '\'' + '}';
    }

    @Override
    public void soar(){
        System.out.println("MIAU MIAU");
    }
}
