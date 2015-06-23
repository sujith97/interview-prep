package org.home.interviewprep.core;

/**
 * 
 * @author sujithrb
 *
 * @param <T>
 */
public class DoublyLinkedNode<T> {
	
	/**
	 * The data content of this node.
	 */
	private T dataContent;
	
	/**
	 * The left node or the previous node of this node.
	 */
	private DoublyLinkedNode<T> leftNode;
	
	/**
	 * The right node or the next node of this node.
	 */
	private DoublyLinkedNode<T> rightNode;
	
	/**
	 * @return the dataContent
	 */
	public T getDataContent() {
		return dataContent;
	}
	/**
	 * @param dataContent the dataContent to set
	 */
	public void setDataContent(T dataContent) {
		this.dataContent = dataContent;
	}
	/**
	 * @return the leftNode
	 */
	public DoublyLinkedNode<T> getLeftNode() {
		return leftNode;
	}
	/**
	 * @param leftNode the leftNode to set
	 */
	public void setLeftNode(DoublyLinkedNode<T> leftNode) {
		this.leftNode = leftNode;
	}
	/**
	 * @return the rightNode
	 */
	public DoublyLinkedNode<T> getRightNode() {
		return rightNode;
	}
	/**
	 * @param rightNode the rightNode to set
	 */
	public void setRightNode(DoublyLinkedNode<T> rightNode) {
		this.rightNode = rightNode;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("DoublyLinkedNode [dataContent=%s]", dataContent);
	}
	
}
