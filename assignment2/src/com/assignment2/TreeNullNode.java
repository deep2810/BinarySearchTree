package com.assignment2;

/**
 * 
 * @author Deep
 *
 */
public class TreeNullNode extends Node {

	public TreeNullNode(Node parent) {
		this.parent=parent;
	}

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public void add(String value, TreeStrategy strategyObject) {
		if (parent.setLeftChild) {
			parent.setLeftChild = false;
			Node newBstNode = new TreeRealNode(value,parent);
			parent.leftChild = newBstNode;
		} else if (parent.setRightChild) {
			parent.setRightChild = false;
			Node newBstNode = new TreeRealNode(value,parent);
			parent.rightChild = newBstNode;
		}
	}
	
	}	

