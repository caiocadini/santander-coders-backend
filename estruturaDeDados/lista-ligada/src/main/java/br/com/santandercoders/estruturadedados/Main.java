package br.com.santandercoders.estruturadedados;

import br.com.santandercoders.estruturadedados.listaligada.ListaLigada;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaLigada listaTeste = new ListaLigada("elemento 1");
        listaTeste.append("elemento 2");
        listaTeste.append("elemento 3");
        listaTeste.prepend("elemento 0");
        listaTeste.delete(2);
        listaTeste.print();
    }
}