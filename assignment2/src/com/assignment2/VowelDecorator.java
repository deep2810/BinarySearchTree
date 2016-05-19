package com.assignment2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * 
 * @author Deep
 *
 */

public class VowelDecorator extends IteratorDecorator {

	private String next = null;

	public VowelDecorator(Iterator<String> stringIterator) {
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
		Set<Character> vowelList = new HashSet<Character>(Arrays.asList('a',
				'e', 'i', 'o', 'u'));
		if (stringIterator.hasNext()) {
			while (stringIterator.hasNext()) {
				String value = (String) stringIterator.next();
				if (vowelList.contains(Character.toLowerCase(value
						.toLowerCase().charAt(0)))) {
					next = value;
					break;
				}
				next = null;
			}
		} else
			next = null;
	}
}
