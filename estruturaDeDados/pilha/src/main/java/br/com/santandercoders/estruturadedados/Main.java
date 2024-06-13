package br.com.santandercoders.estruturadedados;

import br.com.santandercoders.estruturadedados.pilha.Pilha;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Invertendo Conjunto de elementos usando a pilha
        String[] dados = {"Elemento 5", "Elemento 4", "Elemento 3", "Elemento 2", "Elemento 1"};

        inverter(dados);

    }

    private static void inverter(final String[] dados){
        Pilha pilha = new Pilha(dados[0]);

        for (int i = 1; i<dados.length; i++){
            pilha.push(dados[i]);
        }
        pilha.print();
    }
}