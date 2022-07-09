package bfs_dfs_algorithm;

public class Test_Dfs_Bfs {
    public static void main(String[] args) {
        Test_Dfs_Bfs test = new Test_Dfs_Bfs();
        Bfs bfs = new Bfs();
        Dfs dfs = new Dfs();
        dfs.traverse(test.treeNode());
//        bfs.traverse(test.treeNode());
    }
    Node treeNode(){
        /*
                                                A
                                              /   \
                                            B       E
                                          /  \    /  \
                                        C     D  F    G
                                                      |
                                                      H
           depth-first-search -> A B E C D F G H
           breadth-first-searh -> A B C D E F G H
         */
        Node leftNode = new Node("B",new Node("C"),new Node("D"));
        Node rightNodeLeaf = new Node("E",new Node("F"),new Node("G",null,new Node("H")));
        Node node = new Node("A",leftNode,rightNodeLeaf);
        return node;
    }
}
