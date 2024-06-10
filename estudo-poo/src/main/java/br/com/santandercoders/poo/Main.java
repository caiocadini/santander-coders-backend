package br.com.santandercoders.poo;


import br.com.santandercoders.poo.animais.Cachorro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Choquito";
        cachorro1.cor = "Branco";
        cachorro1.altura = 89;
        cachorro1.peso = 9.5;
        cachorro1.tamanhoRabo = 20;

        cachorro1.latir();

    }

}