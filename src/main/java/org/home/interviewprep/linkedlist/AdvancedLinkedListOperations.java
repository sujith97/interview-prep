package org.home.interviewprep.linkedlist;

import org.home.interviewprep.core.Node;
import org.home.interviewprep.linkedlist.impl.sujith.LinkedListImpl;

public abstract class AdvancedLinkedListOperations<T> extends LinkedListImpl<T> {
	public abstract Node<T> getMiddleElement();

	public abstract void reverseTheList();

	public abstract Node<Integer> mergeSortedLinkedLists(
			Node<Integer> rootNode1, Node<Integer> rootNode2);
}