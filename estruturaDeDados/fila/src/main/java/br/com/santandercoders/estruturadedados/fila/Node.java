package br.com.santandercoders.estruturadedados.fila;

public class Node {
    private String value;
    Node next;

    Node(String value){
        this.value = value;
    }

    public String getNodeData(){
        return this.value;
    }
}
