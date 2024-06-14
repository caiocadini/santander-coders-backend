package br.com.santandercoders.estruturadedados.arvore;

public class Node {
    int value;
    Node left;
    Node right;

    public Node (int value){
        this.value = value;
    }

    public boolean isLeaf(){
        return (this != null) && (this.left==null) && (this.right==null);
    }

    public int getValue() {
        return this.value;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }
}
