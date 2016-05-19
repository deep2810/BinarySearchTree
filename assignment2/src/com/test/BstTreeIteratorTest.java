package com.test;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import com.assignment2.*;

/**
 * 
 * @author Deep
 *
 */
public class BstTreeIteratorTest {

	@Test
	public void simpleIteratorTest() {
		String[] values = "karan don arun cat orange milay zeel raj".split(" ");
		String[] expectedoutput = "arun cat don karan milay orange raj zeel ".split(" ");
		BinarySearchTree actualBST = new BinarySearchTree(new NormalComparison());
		actualBST.addAll(values);
		Iterator<String> simpleIterator=actualBST.iterator();
		for(int i=0;simpleIterator.hasNext();i++){
			assertEquals(simpleIterator.next(), expectedoutput[i]);
		}
	}

}
