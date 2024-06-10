package br.com.santandercoders.poo.animais;

public class Cachorro {
    public String nome, cor, estadoDeEspirito;
    public double peso;
    public int altura, tamanhoRabo;

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
