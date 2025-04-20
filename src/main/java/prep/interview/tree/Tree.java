package prep.interview.tree;

public class Tree {
    Node root;
    public Tree() {
        root = null;
    }
    void print() {
        Node tmp = root;
        System.out.println(tmp.data);
        while(tmp.left != null) {
            System.out.println(tmp.left.data);
            tmp = tmp.left;
        }

    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);
        tree.print();
    }
}

class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
