package bfs_dfs_algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static void main(String[] args) {

    }
    public void traverse(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            node = queue.remove();
            System.out.println(node.data + " ");
            if(node.left != null)
                queue.add(node.left);
            if(node.right !=null)
                queue.add(node.right);
        }
    }
}
