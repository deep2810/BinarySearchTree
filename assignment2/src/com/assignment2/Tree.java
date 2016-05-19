package com.assignment2;

import java.util.AbstractCollection;

/**
 *
 * @author Deep
 */
public abstract class Tree extends AbstractCollection<String> {
	public abstract boolean addAll(String values[]);

	public abstract String toString();

	public abstract String[] toArray();
}
