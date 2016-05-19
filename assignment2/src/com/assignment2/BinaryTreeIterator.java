package com.assignment2;

import java.util.Iterator;
import java.util.Stack;

/**
 * 
 * @author Deep
 *
 */
public class BinaryTreeIterator implements Iterator<String> {

	//Stack to store data
	private Stack<Node> traversed = new Stack<Node>();

	public BinaryTreeIterator(Node root) {
		while (!(root.isNull())) {
			traversed.push(root);
			root = root.leftChild;
		}
	}

	@Override
	public boolean hasNext() {
		return (!traversed.isEmpty());
	}

	@Override
	public String next() {
		Node currentNode;

		if (traversed.isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		currentNode = (Node) traversed.pop();
		String next = currentNode.value;
		if (!(currentNode.rightChild.isNull())) {
			currentNode = currentNode.rightChild;
			while (!(currentNode.isNull())) {
				traversed.push(currentNode);
				currentNode = currentNode.leftChild;
			}
		}
		return next;
	}

}
