package bfs_dfs_algorithm;

public class Node {
    public Node left;
    public Node right;
    String data;
    int value;
    public Node(String data){
        this.data = data;
    }
    public Node(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public Node(int value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right =right;
    }
    public Node(String data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
