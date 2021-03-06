package bfs_dfs_algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
    class Node{
        private int id;
        private LinkedList<Node> adjacent = new LinkedList<Node>();
        private Node(int id){
            this.id = id;
        }
    }
    private Node getNode(int id){
        return null;
    }
    public void addEdge(int source, int destination){

    }
    public boolean hasPathDfs(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> visited = new HashSet<Integer>();
        return hasPathDfs(s,d,visited);
    }
    public boolean hasPathDfs(Node source, Node destination, HashSet<Integer> visited){
        if(visited.contains(source.id))
            return false;
        visited.add(source.id);
        if(source == destination)
            return true;
        for(Node child : source.adjacent){
            if(hasPathDfs(child,destination,visited))
                return true;
        }
        return false;
    }
    public boolean hasPathBFS(int source, int destination){
        return hasPathBFS(getNode(source),getNode(destination));
    }
    private boolean hasPathBFS(Node source, Node destination){
        LinkedList<Node> nextToVisit = new LinkedList<Node>();
        HashSet<Integer> visited = new HashSet<Integer>();
        nextToVisit.add(source);

        while(!nextToVisit.isEmpty()){
            Node node = nextToVisit.remove();
            if(node == destination)
                return false;
            if(visited.contains(node.id))
                continue;
            visited.add(node.id);
            for(Node child : node.adjacent){
                nextToVisit.add(child);
            }
        }
        return false;
    }
}
