package br.com.santandercoders.estruturadedados.fila;

public class Fila {
    private Node first;
    private Node last;
    private int length;

    public Fila(String value){
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        this.length = 1;
    }

    public String getFirst(){
        if (this.length != 0){
            return this.first.getNodeData();
        }
        return "Fila vazia";
    }

    public String getLast(){
        if (this.length != 0){
            return this.last.getNodeData();
        }
        return "Fila vazia";
    }

    public int getLength(){
        return this.length;
    }

    public void print(){
        System.out.println("###########################");
        Node temp = this.first;
        while (temp != null){
            System.out.println(temp.getNodeData());
            temp = temp.next;
        }
        System.out.println("###########################");
    }

    public boolean enqueue(String value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.first = newNode;
            this.last = newNode;
            this.length++;
            return true;
        }
        this.last.next = newNode;
        this.last = newNode;
        this.length++;
        return true;
    }

    public Node dequeue(){
        if(this.length == 0){
            return null;
        }
        Node temp = this.first;
        if(this.length == 1){
            this.first = null;
            this.last = null;
        } else{
            this.first = temp.next;
        }
        temp.next = null;
        this.length--;
        return temp;
    }
}
