package br.com.santandercoders.estruturadedados.listaligada;

public class ListaLigada {
    private Node head;
    private Node tail;
    private int length;

    public ListaLigada(String data){
        length = 1;
        Node newnode = new Node(data);
        head = newnode;
        tail = newnode;
    }

    public Node getHead(){
        if (this.head == null){
            return null;
        } else{
            return this.head;
        }
    }

    public Node getTail(){
        if (this.tail == null){
            return null;
        } else{
            return this.tail;
        }
    }

    public Node get(int index){
        if(index < 0 || index >= this.length){
            return null;
        } else{
            Node temp = head;
            for(int i = 0; i<index; i++){
                temp = temp.next;
            }
            return temp;
        }
    }

    public int getLength(){
        return this.length;
    }

    public void makeEmpty(){
        this.head = null;
        this.tail = null;
        this.length = 0;
        System.out.println("Lista esvaziada");
    }

    public void print() {
        Node temporario = this.head;
        while(temporario != null){
            System.out.println(temporario.data);
            temporario = temporario.next;
        }
    }

    public void append(String data){
        Node nodeAppend = new Node(data);
        if(this.length == 0) {
            this.head = this.tail = nodeAppend;
        }else {
            this.tail.next = nodeAppend;
            this.tail = nodeAppend;
        }
        length++;
        System.out.println("Elemento adicionado como sucesso");
    }

    public void prepend(String data){
        Node nodePrepend = new Node(data);
        if (length == 0){
            this.head = this.tail = nodePrepend;
        }else{
            nodePrepend.next = this.head;
            this.head = nodePrepend;
        }
        length++;
        System.out.println("Elemento adicionado com sucesso");
    }

    public void insert(int index, String data){
        if (index < 0 || index > this.length){
            System.out.println("O índice não é um valor válido ou é maior do que o tamanho da lista");
        } else if(index == 0){
            this.prepend(data);
            System.out.println("Elemento adicionado com sucesso");
        } else if (index == this.length){
            this.append(data);
            System.out.println("Elemento adicionado com sucesso");
        }else{
            Node nodeInsert = new Node(data);
            Node temp = get(index-1);
            nodeInsert.next = temp.next;
            temp.next = nodeInsert;
            length++;
            System.out.println("Elemento adicionado com sucesso");

        }
    }

    public void set(int index, String data){
        Node temp = get(index);
        if (temp != null){
            temp.data = data;
            System.out.println("Elemento alterado com sucesso");
        }else{
            System.out.println("Falha em alterar o elemento");
        }
    }


    public Node deleteLast(){
        if(this.length == 0){
            return null;
        } else{
            Node pre = this.head;
            Node temp = null;
            while (pre.next != this.tail){
                pre = pre.next;
            }
            this.tail = pre;
            temp = pre.next;
            pre.next = null;
            length--;
            if (length == 0){
                head = null;
                tail = null;
            }
            return temp;
        }
    }

    public Node deleteFirst(){
        if (this.length == 0){
            return null;
        } else {
            Node newHead = this.head;
            this.head = newHead.next;
            length--;
            if(this.length == 0){
                head = null;
                tail = null;
            }
            return newHead;
        }
    }

    public Node delete(int index){
        if (index < 0 || index >= this.length){
            return null;
        }
        if (index == 0){
            return deleteFirst();
        }
        if (index == this.length-1){
            return deleteLast();
        }
        Node prev = get(index -1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }


}
