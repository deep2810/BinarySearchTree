package com.assignment2;

/**
 * 
 * @author Deep
 *
 */

public class TreeRealNode extends Node {

	public TreeRealNode(String value,Node parent) {
		this.value = value;
		leftChild = new TreeNullNode(this);
		rightChild = new TreeNullNode(this);
		this.parent=parent;
	}

	public boolean isNull() {
		return false;
	}

	@Override
	public void add(String value, TreeStrategy strategyObj) {
		
	 if (((strategyObj.getData(value)).toLowerCase().compareTo(strategyObj
				.getData(this.value))) < 0) {
			if (this.leftChild.isNull()) {
				setLeftChild = true;
			}
			leftChild.add(value, strategyObj);
		} else {
			if (this.rightChild.isNull()) {
				setRightChild = true;
			}
			rightChild.add(value, strategyObj);
		}
	}
}
