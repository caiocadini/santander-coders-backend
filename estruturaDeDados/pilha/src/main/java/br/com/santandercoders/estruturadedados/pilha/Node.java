package br.com.santandercoders.estruturadedados.pilha;

public class Node {
    String data;
    Node next;

    Node (String data){
        this.data = data;
    }

    public void printData(){
        System.out.println(this.data);
    }
}
