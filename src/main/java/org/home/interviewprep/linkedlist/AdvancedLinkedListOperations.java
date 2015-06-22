package org.home.interviewprep.linkedlist;

public abstract class AdvancedLinkedListOperations<T> extends LinkedList_1<T> {
	protected abstract Node<T> getMiddleElement();
	
	protected abstract void reverseTheList() ;
	
	protected abstract void mergeSortedLinkedLists(Node<T> rootNode1, Node<T> rootNode2); 
		
}