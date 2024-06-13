package br.com.santandercoders.estruturadedados.pilha;

public class Pilha {
    private Node top;
    private int height;

    public Pilha(String data){
        Node newNode = new Node(data);
        this.top = newNode;
        this.height = 1;
    }

    public Node getTop(){
        if (this.top == null){
            return null;
        }
        return this.top;
    }

    public int getHeight(){
        return this.height;
    }

    public void print(){
        Node temp = this.top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public boolean push(String data){
        Node newNode = new Node(data);
        if (this.height == 0){
            top = newNode;
            return true;
        }
        newNode.next = top;
        top = newNode;
        height++;
        return true;
    }

    public Node pop(){
        if (this.height == 0){
            return null;
        }
        Node temp = this.top;
        top = temp.next;
        temp.next = null;
        height--;
        return temp;
    }

}
