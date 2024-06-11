package br.com.santandercoders.poo.animais;

public class Cachorro extends Animal {
    /* ATRIBUTOS */
    private static int numeroDeCachorros;
    private int tamanhoRabo;

    /* MÉTODOS */
    //Construtor sem parâmetros
    //Construtor com parâmetros
    public Cachorro(String nome, String cor, String estadoDeEspirito, int altura, int tamanhoRabo, double peso){
        super(nome, cor, estadoDeEspirito, peso, altura);
        this.tamanhoRabo = tamanhoRabo;
        numeroDeCachorros++;
    }
    //Getters

    public int getTamanhoRabo() {
        return tamanhoRabo;
    }

    //Setters

    public void setTamanhoRabo(int tamanhoRabo) {
        this.tamanhoRabo = tamanhoRabo;
    }

    //Override Métodos


    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + this.nome + '\'' +
                ", cor='" + this.cor + '\'' +
                ", estadoDeEspirito='" + this.estadoDeEspirito + '\'' +
                ", peso=" + this.peso +
                ", altura=" + this.altura +
                ", tamanhoRabo=" + this.tamanhoRabo +
                '}';
    }

    @Override
    public void soar(){
        System.out.println("AU AU");
    }

    //Métodos restantes

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
