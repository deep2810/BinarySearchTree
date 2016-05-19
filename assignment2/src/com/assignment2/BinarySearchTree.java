package com.assignment2;

import java.util.Iterator;

/**
 *
 * @author Deep
 */
public class BinarySearchTree extends Tree {

	private Node root;
	private int size = 0;
	private TreeStrategy bstStrategy;

	public BinarySearchTree(TreeStrategy strategy) {
		this.bstStrategy = strategy;
	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}

	@Override
	public boolean add(String value) {
		if (size == 0) {
			root = new TreeRealNode(value,new TreeNullNode(null));
		} else {
			root.add(value, bstStrategy);
		}
		size++;
		return true;
	}

	@Override
	public boolean addAll(String[] values) {
		for (int i = 0; i < values.length; i++) {
			add(values[i]);
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuffer traversalString = new StringBuffer();
		Iterator<String> stringIterator = iterator();
		while (stringIterator.hasNext()) {
			traversalString.append(stringIterator.next() + " ");
		}
		return traversalString.toString();
	}

	@Override
	public Iterator<String> iterator() {
		return new BinaryTreeIterator(root);
	}

	@Override
	public String[] toArray() {
		String[] binaryTreeData = new String[size];
		Iterator<String> binarySearchIterator = iterator();
		for (int i = 0; binarySearchIterator.hasNext(); i++) {
			binaryTreeData[i] = binarySearchIterator.next();
		}
		return binaryTreeData;
	}

	@Override
	public int size() {
		return size;
	}
}
