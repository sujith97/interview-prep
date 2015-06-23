package org.home.interviewprep.trees.bst.impl.sujith;

import java.util.List;

import org.home.interviewprep.trees.bst.BinarySearchTree;
import org.home.interviewprep.trees.bst.BinarySearchTree.Traversal;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for BST
 * @author sujithrb
 *
 */
public class BinarySearchTreeImplTest {

	@Test
	public void testInsertionThreeElements() {
		final BinarySearchTree<Integer> bst = new BinarySearchTreeImpl<Integer>();
		bst.insert(new Integer(10));
		bst.insert(new Integer(5));
		bst.insert(new Integer(12));
		
		final List<Integer> items = bst.doTraversal(Traversal.INORDER);
		Assert.assertEquals(items.size(), 3);
		
		Assert.assertEquals(5, items.get(0));
		Assert.assertEquals(10, items.get(1));
		Assert.assertEquals(12, items.get(2));
	}
	
	@Test
	public void testPreOrderThreeElements() {
		final BinarySearchTree<Integer> bst = new BinarySearchTreeImpl<Integer>();
		bst.insert(new Integer(10));
		bst.insert(new Integer(5));
		bst.insert(new Integer(12));
		
		final List<Integer> items = bst.doTraversal(Traversal.PREORDER);
		Assert.assertEquals(items.size(), 3);
		
		Assert.assertEquals(10, items.get(0));
		Assert.assertEquals(5, items.get(1));
		Assert.assertEquals(12, items.get(2));
	}
	
	@Test
	public void testPostOrderThreeElements() {
		final BinarySearchTree<Integer> bst = new BinarySearchTreeImpl<Integer>();
		bst.insert(new Integer(10));
		bst.insert(new Integer(5));
		bst.insert(new Integer(12));
		
		final List<Integer> items = bst.doTraversal(Traversal.POSTORDER);
		Assert.assertEquals(items.size(), 3);
		
		Assert.assertEquals(5, items.get(0));
		Assert.assertEquals(12, items.get(1));
		Assert.assertEquals(10, items.get(2));
	}
}
