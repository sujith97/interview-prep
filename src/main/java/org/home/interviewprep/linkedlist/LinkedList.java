package org.home.interviewprep.linkedlist;

import org.home.interviewprep.core.Node;

public interface LinkedList<T> {

	void insert(T content);
	Node<T> delete(T content);
	Node<T> search(T content);
	void printNodes();
}
