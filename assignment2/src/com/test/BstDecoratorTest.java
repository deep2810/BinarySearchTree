package com.test;

import static org.junit.Assert.*;
import java.util.Iterator;
import org.junit.Test;
import com.assignment2.BinarySearchTree;
import com.assignment2.CapitalDecorator;
import com.assignment2.NormalComparison;
import com.assignment2.VowelDecorator;

/**
 * 
 * @author Deep
 *
 */
public class BstDecoratorTest {

	@Test
	public void testCapitalDecorator() {
		String values[] = "karan don arun cat orange milay zeel raj".split(" ");
		String[] expectedoutput = "ARUN CAT DON KARAN MILAY ORANGE RAJ ZEEL ".split(" ");
		BinarySearchTree actualBST = new BinarySearchTree(new NormalComparison());
		actualBST.addAll(values);
		Iterator<String> simpleIterator=actualBST.iterator();
		CapitalDecorator caps=new CapitalDecorator(simpleIterator);
		for(int i=0;caps.hasNext();i++){
			assertEquals(caps.next(), expectedoutput[i]);
		}
	}
	
	@Test
	public void testVowelDecorator() {
		String values[] = "karan don arun eat orange milay zeel raj".split(" ");
		String[] expectedoutput = "arun eat orange ".split(" ");
		BinarySearchTree actualBST = new BinarySearchTree(new NormalComparison());
		actualBST.addAll(values);
		Iterator<String> simpleIterator=actualBST.iterator();
		VowelDecorator vowels=new VowelDecorator(simpleIterator);
		for(int i=0;vowels.hasNext();i++){
				assertEquals(vowels.next(), expectedoutput[i]);
		}
	}

}
