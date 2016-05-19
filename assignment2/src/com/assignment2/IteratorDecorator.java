package com.assignment2;

import java.util.Iterator;

/**
 * 
 * @author Deep
 *
 */

public abstract class IteratorDecorator implements Iterator<String> {
	    
	    protected Iterator<String> stringIterator; 
	
		public IteratorDecorator(Iterator<String> stringIterator) {
			this.stringIterator=stringIterator;
		}
}
