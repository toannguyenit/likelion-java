package vn.edu.likelion.app.Day17.Exercise.Bai1;

class Node {
    Node next;
    int value;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}