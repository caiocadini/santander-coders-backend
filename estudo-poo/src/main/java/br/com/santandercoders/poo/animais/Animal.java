package br.com.santandercoders.poo.animais;

public abstract class Animal {
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


    //Getters


    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public double getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Outros Métodos

    public void comer(){};

    public void dormir(){};

    //Necessário definir o soar de cada animal que herda a classe Animal
    public abstract void soar();
}
