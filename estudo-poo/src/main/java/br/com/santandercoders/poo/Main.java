package br.com.santandercoders.poo;


import br.com.santandercoders.poo.animais.Cachorro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Choquito", "Branco", 87, 28, 9.5);
        Cachorro cachorroSemParametro = new Cachorro();

        //Dados cachorroSemParametro
        System.out.println(cachorroSemParametro.getCor());
        System.out.println(cachorroSemParametro.getNome());

        //Dados cachorro1
        System.out.println(cachorro1.getNome());
        System.out.println(cachorro1.getAltura());
        System.out.println(cachorro1.getCor());
    }

}