package org.home.interviewprep.linkedlist;

public interface LinkedList<T> {

	void insert(T content);
	Node<T> delete(T content);
	Node<T> search(T content);
	void printNodes();
}
