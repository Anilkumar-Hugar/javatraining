package com.leafNodes;

public class FindLeafNode {

	public void getLeafNode(Node node) {
		if(node==null)return;
		if (node.leftNode == null && node.rightNode == null)
			System.out.println(node.value);
		else {
			getLeafNode(node.leftNode);
			getLeafNode(node.rightNode);
		}
	}

	public static void main(String[] args) {
		FindLeafNode findLeafNode = new FindLeafNode();
		Node node = new Node(1);
		node.leftNode = new Node(2);
		node.rightNode = new Node(3);
		node.leftNode.leftNode=new Node(4);
		node.leftNode.rightNode=new Node(5);
		node.rightNode.leftNode=new Node(7);
		findLeafNode.getLeafNode(node);

	}
}
