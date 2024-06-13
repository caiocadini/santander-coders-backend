package br.com.santandercoders.estruturadedados.pilha;

public class Node {
    String data;
    Node next;

    Node (String data){
        this.data = data;
    }

    public String getData(){
        return this.data;
    }
}
