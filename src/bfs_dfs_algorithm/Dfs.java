package bfs_dfs_algorithm;

public class Dfs {
    public void traverse(Node node){
         if(node==null) return;
        System.out.println(node.data + " ");
        traverse(node.left);
        traverse(node.right);
    }
}
