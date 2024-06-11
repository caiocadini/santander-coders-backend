package br.com.santandercoders.poo.animais;

public class Animal {
    protected String nome, cor, estadoDeEspirito;
    protected double peso;
    protected int altura;

    public Animal(String nome, String cor, String estadoDeEspirito, double peso, int altura) {
        this.nome = nome;
        this.cor = cor;
        this.estadoDeEspirito = estadoDeEspirito;
        this.peso = peso;
        this.altura = altura;
    }

    public void comer(){};

    public void dormir(){};

    public void soar(){
        System.out.println("cri cri");
    };
}
