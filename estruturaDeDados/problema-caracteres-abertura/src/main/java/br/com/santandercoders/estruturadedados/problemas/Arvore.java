package br.com.santandercoders.estruturadedados.problemas;

import java.util.LinkedList;
import java.util.Queue;

public class Arvore {
    Node root;

    public void insert(int value){
        if (root == null)
            root = new Node(value);
        else{
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(queue.size() > 0){
                Node currentNode = queue.remove();
                if(currentNode.left == null){
                    currentNode.left = newNode;
                    break;
                }else{
                    queue.add(currentNode.left);
                }
                if(currentNode.right == null){
                    currentNode.right = newNode;
                    break;
                } else {
                    queue.add(currentNode.right);
                }
            }
        }
    }
    public Node getRoot(){
        return this.root;
    }

    public void preOrderPrint(){
        preOrder(this.getRoot());
    }

    private void preOrder(final Node node){
        if (node == null)
            return;
        System.out.println(node.getValue());
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public void inOrderPrint(){
        inOrder(this.getRoot());
    }
    private void inOrder(final Node node){
        if (node == null)
            return;
        inOrder(node.getLeft());
        System.out.println(node.getValue());
        inOrder(node.getRight());
    }

    public void posOrderPrint(){
        posOrder(this.getRoot());
    }
    private void posOrder(final Node node){
        if (node == null)
            return;
        posOrder(node.getLeft());
        posOrder(node.getRight());
        System.out.println(node.getValue());
    }

    public void BFS(){
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.getRoot());
        while (queue.size() > 0){
            Node currentNode = queue.remove();
            if (currentNode.getLeft() != null)
                queue.add(currentNode.getLeft());
            if(currentNode.getRight() != null)
                queue.add(currentNode.getRight());
            System.out.println(currentNode.getValue());
        }
    }
}
