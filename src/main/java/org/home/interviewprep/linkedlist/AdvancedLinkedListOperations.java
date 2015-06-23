package org.home.interviewprep.linkedlist;

import org.home.interviewprep.core.SinglyLinkedNode;
import org.home.interviewprep.linkedlist.impl.sujith.LinkedListImpl;

public abstract class AdvancedLinkedListOperations<T> extends LinkedListImpl<T> {
	public abstract SinglyLinkedNode<T> getMiddleElement();

	public abstract void reverseTheList();

	public abstract SinglyLinkedNode<Integer> mergeSortedLinkedLists(
			SinglyLinkedNode<Integer> rootNode1, SinglyLinkedNode<Integer> rootNode2);
}