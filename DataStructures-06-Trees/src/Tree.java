public class Tree {
    //Nested node class

    private class Node {
        private Node leftChild;
        private Node rightChild;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    //My insert method for BST
    public void insert(int value) {
        Node node = new Node(value);
        //if tree is empty
        if (root == null) {
            root = node;
            return;
        }
        //if tree is not empty
        Node current = root;
        while (true) {
            // check if less
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    //Preorder root-left-right
    public void traversePreOrder(){
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.value + ", ");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }


    //Inorder left-root-right
    public void traverseInOrder(){
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root){
        if (root==null){
            return;
        }
        traverseInOrder(root.leftChild);
        System.out.print(root.value + ", ");
        traverseInOrder(root.rightChild);
    }

    



}














