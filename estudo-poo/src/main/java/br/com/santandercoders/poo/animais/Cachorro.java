package br.com.santandercoders.poo.animais;

public class Cachorro {
    /* ATRIBUTOS */
    private String nome, cor, estadoDeEspirito;
    private double peso;
    private int altura, tamanhoRabo;

    /* MÉTODOS */
    //Construtor sem parâmetros
    public Cachorro(){
        //Aqui dentro podemos colocar valores default para caso nada seja passado no construtor
        this.nome = "Rex";
        this.cor = "Marrom";
        this.peso = 8.4;
        this.altura = 67;
        this.tamanhoRabo = 5;
    }
    //Construtor com parâmetros
    public Cachorro(String nome, String cor, int altura, int tamanhoRabo, double peso){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.tamanhoRabo = tamanhoRabo;
        this.peso = peso;
    }
    //Getters
    public String getNome(){
        return this.nome;
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

    public int getTamanhoRabo() {
        return tamanhoRabo;
    }

    //Setters
    public void setNome(String nome){
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

    public void setTamanhoRabo(int tamanhoRabo) {
        this.tamanhoRabo = tamanhoRabo;
    }

    //Métodos restantes
    public void comer(){}
    public void latir(){System.out.println("AU AU");}

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        if(acao.equals("carinho")){
            this.estadoDeEspirito = "Feliz";
        }else if(acao.equals("dorme")){
            this.estadoDeEspirito = "Triste";
        }else{
            this.estadoDeEspirito = "Neutro";
        }
        return this.estadoDeEspirito;
    }
}
