package org.home.interviewprep.trees.bst;

/**
 * Binary Search Tree
 * @author sujithrb
 *
 * @param <T> the type of BST
 */
public interface BinarySearchTree<T> {
	
	/**
	 * Insert into a BST.
	 * - Time Complexity:
	 * - Space Complexity:
	 * @param data the data to be inserted.
	 */
	void insert(final T data);
	
	/**
	 * Search for an element in a BST.
	 * - Time Complexity:
	 * - Space Complexity:
	 * @param data the data to be searched.
	 * @return searched result. Will be null if search fails.
	 */
	T find(final T data);
	
	/**
	 * Delete an element in a BST.
	 * - Time Complexity:
	 * - Space Complexity:
	 * @param data the data to be deleted.
	 * @return deleted element. Will be null if delete fails.
	 */
	T delete(final T data);
	
	/**
	 *  Perform BST traversals.
	 * - Time Complexity:
	 * - Space Complexity:
	 * @param traversal the traversal types.
	 * @return traversal result. Will be null if traversal fails.
	 */
	T[] doTraversal(final Traversal traversal);
	
	/**
	 * Balance the BST.
	 * - Time Complexity:
	 * - Space Complexity:
	 */
	void balanceTree();
	
	/**
	 * The traversal types
	 * @author sujithrb
	 *
	 */
	public enum Traversal {
		INORDER, PREORDER, POSTORDER
	}
}
