package binarysearchtree;

public class BinarySearchTree {

	private Node root;
	private int index = 0;
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNode(new Node(5));
		bst.addNode(new Node(4));
		bst.addNode(new Node(6));
		bst.addNode(new Node(2));
		
		System.out.println(bst.searchVal(bst.root,1));
	}
	void addNode(Node node) {
		if(root==null) {
			root = node;
		}else {
			insertNode(root, node);
		}
	}
	void insertNode(Node parent, Node node) {
		if(parent.getVal()>node.getVal()) {
			if(parent.leftNode==null) {
				parent.leftNode = node;
			}else {
				insertNode(parent.leftNode,node);
			}
			System.out.println(index++);
		}else {
			if(parent.rightNode==null) {
				parent.rightNode = node;
			}else {
				insertNode(parent.rightNode,node);
			}
			System.out.println(index++);
		}
	}
	boolean searchVal(Node root, int val) {
		if(root==null) return false;
		if(root.getVal()==val) return true;
		if(root.getVal()>val) {
			return searchVal(root.leftNode,val);
		}else {
			return searchVal(root.rightNode,val);
		}
	}
}
