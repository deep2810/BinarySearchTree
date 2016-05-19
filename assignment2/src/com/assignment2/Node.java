package com.assignment2;

/**
 * 
 * @author Deep
 *
 */

public abstract class Node {
	protected String value;
	protected Node parent=null;
	protected Node leftChild=null;
	protected Node rightChild=null;
	protected boolean setLeftChild = false;
    protected boolean setRightChild = false;
	public abstract boolean isNull();
	public abstract void add(String value, TreeStrategy strategyObj);
}
