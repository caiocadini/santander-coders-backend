package br.com.santandercoders.estruturadedados;

import br.com.santandercoders.estruturadedados.BinarySearchTree.BinarySearchTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bstTeste = new BinarySearchTree();

        bstTeste.insert(37);
        bstTeste.insert(11);
        bstTeste.insert(66);
        bstTeste.insert(8);
        bstTeste.insert(17);
        bstTeste.insert(42);
        bstTeste.insert(72);

        bstTeste.deleteNode(66);
        bstTeste.inOrderPrint();
    }
}