package com.java.tree;

import java.util.Stack;

public class FindLeafNodeMain {

	// iterative approch
	public static void findLeafNodeiterative(Node root) {
		if(root==null) {
			return ;
		}
		Stack<Node> s= new Stack<>();
		s.push(root);
		
		while (!s.isEmpty()) 
		{
			Node node = s.pop();
			if(node.leftNode!=null) {
				s.push(node.leftNode);
			}
			if(node.rightNode!=null) {
				s.push(node.rightNode);
			}
			if(node.leftNode == null && node.rightNode == null)
			{
				System.out.print(" " + node.value);
			}
		}
		
	}

	// recursive approch
	public static void findLeafNode(Node root) {
		if (root == null) {
			return;
		}
		if (root.leftNode == null && root.rightNode == null) {
			System.out.println("Leaf node " + root.value);
			return;
		}
		if (root.leftNode != null) {
			findLeafNode(root.leftNode);
		}
		if (root.rightNode != null) {
			findLeafNode(root.rightNode);
		}

	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode = new Node(7);
		root.rightNode.leftNode.leftNode = new Node(8);
		root.rightNode.leftNode.rightNode = new Node(9);
		System.out.println("Recursive approch");
		findLeafNode(root);
		System.out.println("Iterative approch");		
		findLeafNodeiterative(root);
	}

}
