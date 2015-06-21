package org.home.interviewprep.linkedlist;

public class Node<T> {
	private T dataContent;
	private Node<T> next;
	
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
	 * @return the next
	 */
	public Node<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return dataContent.toString();
	}
}
