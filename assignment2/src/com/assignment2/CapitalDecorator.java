package com.assignment2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 
 * @author Deep
 *
 */

public class CapitalDecorator extends IteratorDecorator {

	private String next = null;

	public CapitalDecorator(Iterator<String> stringIterator) {
		super(stringIterator);
		getNext();
	}

	@Override
	public boolean hasNext() {
		return !(next == null);
	}

	@Override
	public String next() {
		if (hasNext()) {
			String currentValue = next;
			getNext();
			return currentValue;
		} else
			throw new NoSuchElementException("Illegal Access..");
	}

	public void getNext() {
		if (stringIterator.hasNext()) {
			while (stringIterator.hasNext()) {
				String value = (String) stringIterator.next();
				next = value.toUpperCase();
				break;
			}
		} else
			next = null;
	}
}
