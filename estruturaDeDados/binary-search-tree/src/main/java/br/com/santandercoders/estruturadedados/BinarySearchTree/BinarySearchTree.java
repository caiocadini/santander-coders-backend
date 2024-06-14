package br.com.santandercoders.estruturadedados.BinarySearchTree;

public class BinarySearchTree {
    private Node root;

    public void insert(int value){
        Node newNode = new Node(value);
        if(root == null)
            root = newNode;
        else{
            insert(root, value);
        }
    }

    public Node getRoot(){
        return this.root;
    }

    private void insert(Node node, int value){
        if(node == null)
            return;
        if (value > node.getValue())
            if(node.getRight() == null)
                node.right = new Node(value);
            else
                insert(node.getRight(), value);
        if (value <= node.getValue())
            if (node.getLeft() == null)
                node.left = new Node(value);
            else
                insert(node.getLeft(), value);
    }

    public boolean contains(int value){
         return contains(this.getRoot(), value);
    }

    private boolean contains(Node node, int value){
        if(node == null) return false;
        if(node.getValue() == value) return true;
        if(value > node.value) return contains(node.right, value);
        else return contains(node.left, value);
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

    public int minValue(Node node){
        while (node.left != null){
            node = node.left;
        }
        return node.value;
    }

    public void deleteNode(int value){
        deleteNode(this.root, value);
    }
    private Node deleteNode(Node node, int value){
        if(node == null) return null;
        if(value < node.value){
            node.left = deleteNode(node.left, value);
        } else if(value > node.value){
            node.right = deleteNode(node.right,value);
        }else{
            if((node.left == null) && (node.right == null)){
                return null;
            } else if (node.left == null) {
                return node.right;
            } else if(node.right == null){
                return node.left;
            } else {
                int minValue = minValue(node.right);
                node.value = minValue;
                node.right = deleteNode(node.right, minValue);

            }
        }
        return node;
    }
}
