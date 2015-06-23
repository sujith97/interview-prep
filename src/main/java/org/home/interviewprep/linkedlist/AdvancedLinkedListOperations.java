package org.home.interviewprep.linkedlist;

public abstract class AdvancedLinkedListOperations<T> extends LinkedList_1<T> {
	public abstract Node<T> getMiddleElement();

	public abstract void reverseTheList();

	public abstract Node<Integer> mergeSortedLinkedLists(
			Node<Integer> rootNode1, Node<Integer> rootNode2);
}