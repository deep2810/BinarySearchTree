package com.test;

import junit.framework.TestCase;
import org.junit.Test;
import com.assignment2.*;

/**
 * 
 * @author Deep
 *
 */
public class BinaryTreeTest extends TestCase {

	@Test
	public void testNormalData() {
		String values[] = "karan don arun cat orange milay zeel raj".split(" ");
		String expectedoutput = "arun cat don karan milay orange raj zeel ";
		BinarySearchTree actualBST = new BinarySearchTree(new NormalComparison());
		actualBST.addAll(values);
		System.out.println(actualBST.toString());
		String actualTraversal = actualBST.toString();
		assertEquals(expectedoutput, actualTraversal);
	}

	@Test
	public void testReverseData() {
		String values[] = "karan don arun cat orange milay zeel raj".split(" ");
		String expectedoutput = "orange raj zeel karan don arun cat milay ";
		BinarySearchTree actualBST = new BinarySearchTree(new ReverseComparison());
		actualBST.addAll(values);
		System.out.println(actualBST.toString());
		String actualTraversal = actualBST.toString();
		assertEquals(expectedoutput, actualTraversal);
	}

	@Test
	public void testBinaryTreeSize() {
		String values[] = "karan don arun cat orange milay zeel raj".split(" ");
		int expectedSize = values.length;
		BinarySearchTree actualBST = new BinarySearchTree(new ReverseComparison());
		actualBST.addAll(values);
		assertEquals(expectedSize, actualBST.size());
	}

	@Test
	public void testToArray() {
		String values[] = "karan don arun cat orange milay zeel raj".split(" ");
		String[] expectedoutput = "arun cat don karan milay orange raj zeel"
				.split(" ");
		BinarySearchTree actualBST = new BinarySearchTree(new NormalComparison());
		actualBST.addAll(values);
		String[] actualTraversal = actualBST.toArray();
		for (int i = 0; i < actualBST.size(); i++) {
			assertEquals(expectedoutput[i], actualTraversal[i]);
		}
	}

}
