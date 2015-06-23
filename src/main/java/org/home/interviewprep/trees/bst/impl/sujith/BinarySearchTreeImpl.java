package org.home.interviewprep.trees.bst.impl.sujith;

import java.util.LinkedList;
import java.util.List;

import org.home.interviewprep.core.DoublyLinkedNode;
import org.home.interviewprep.trees.bst.BinarySearchTree;

/**
 * BST Implementation.
 * @author sujithrb
 *
 * @param <T> BST type.
 */
public class BinarySearchTreeImpl<T extends Integer> implements BinarySearchTree<T> {

	/** The root or head node. */
	private DoublyLinkedNode<T> rootNode;
	
	/**
	 * Inserting an elememt in BST
	 */
	public void insert(T data) {
		// Lets implement insert
		if (rootNode == null) {
			rootNode = new DoublyLinkedNode<T>(data);
		} else {
			DoublyLinkedNode<T> traversalNode, parentNode;
			parentNode = traversalNode = rootNode;;
			while(true) {
				parentNode = traversalNode;
				if (traversalNode.getDataContent() < data) {
					traversalNode = traversalNode.getRightNode();
					if (traversalNode == null) {
						parentNode.setRightNode(new DoublyLinkedNode<T>(data));
						break;
					}
				} else {
					traversalNode = traversalNode.getLeftNode();
					if (traversalNode == null) {
						parentNode.setLeftNode(new DoublyLinkedNode<T>(data));
						break;
					}
				}
			}
			
		}
	}

	public T find(T data) {
		// TODO Auto-generated method stub
		return null;
	}

	public T delete(T data) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Does in-order traversal.
	 * @return list of results
	 */
	public List<T> doTraversal(Traversal traversal) {
		final List<T> result = new LinkedList<T>();
		switch (traversal) {
			case INORDER: doInorderTraversal(rootNode, result);
				break;
			case PREORDER: doPreOrderTraversal(rootNode, result);
				break;
			case POSTORDER: doPostOrderTraversal(rootNode, result);
				break;
			default:
				throw new IllegalArgumentException("Traversal type is not supported.");
		}
		return result;
	}

	private void doInorderTraversal(DoublyLinkedNode<T> node, final List<T> result) {
		if (node != null) {
			doInorderTraversal(node.getLeftNode(), result);
			result.add(node.getDataContent());
			doInorderTraversal(node.getRightNode(), result);
		}
	}
	
	private void doPreOrderTraversal(DoublyLinkedNode<T> node, final List<T> result) {
		if (node != null) {
			result.add(node.getDataContent());
			doInorderTraversal(node.getLeftNode(), result);
			doInorderTraversal(node.getRightNode(), result);
		}
	}
	
	private void doPostOrderTraversal(DoublyLinkedNode<T> node, final List<T> result) {
		if (node != null) {
			doInorderTraversal(node.getLeftNode(), result);
			doInorderTraversal(node.getRightNode(), result);
			result.add(node.getDataContent());
		}
	}
	
	public void balanceTree() {
		// TODO Auto-generated method stub

	}

}
