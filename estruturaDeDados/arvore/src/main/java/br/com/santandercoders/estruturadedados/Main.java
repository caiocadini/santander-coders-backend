package br.com.santandercoders.estruturadedados;

import br.com.santandercoders.estruturadedados.arvore.Arvore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Arvore testeArvore = new Arvore();

        testeArvore.insert(37);
        testeArvore.insert(11);
        testeArvore.insert(66);
        testeArvore.insert(8);
        testeArvore.insert(17);
        testeArvore.insert(42);
        testeArvore.insert(72);

        testeArvore.BFS();

    }
}