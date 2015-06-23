package org.home.interviewprep.linkedlist;

import org.home.interviewprep.core.SinglyLinkedNode;

public interface LinkedList<T> {

	void insert(T content);
	SinglyLinkedNode<T> delete(T content);
	SinglyLinkedNode<T> search(T content);
	void printNodes();
}
