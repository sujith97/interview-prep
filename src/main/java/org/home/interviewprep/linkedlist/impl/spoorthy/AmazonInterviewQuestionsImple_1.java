package org.home.interviewprep.linkedlist.impl.spoorthy;

import org.home.interviewprep.linkedlist.AdvancedLinkedListOperations;
import org.home.interviewprep.linkedlist.Node;

/**
 * Given an integer linked list of which both first half and second half are
 * sorted independently. Write a function to merge the two parts to create one
 * single sorted linked list in place [do not use any extra space].
 */
public class AmazonInterviewQuestionsImple_1<T> extends
		AdvancedLinkedListOperations<T> {

	@Override
	public Node<T> getMiddleElement() {

		Node<T> pointer1 = rootNode;
		Node<T> pointer2 = rootNode;

		while (pointer2 != null && pointer1 != null) {
			if (pointer2.getNext() != null) { 
				pointer2 = pointer2.getNext().getNext();
				pointer1 = pointer1.getNext();
			} else
				break;

		}

		return pointer1;

	}

	@Override
	public void reverseTheList() {
		Node<T> previousNode = rootNode;
		Node<T> currentNode = null ;
		Node<T> tempNode = null ;
		if (rootNode != null) {
			currentNode =tempNode= rootNode.getNext();//2nd
			rootNode.setNext(null);
		}
		while (tempNode!= null) {
			
			tempNode = currentNode.getNext();//3rd,4th,5th
			currentNode.setNext(previousNode);//root,2nd,3rd,
			previousNode = currentNode;//2nd,3rd,4th	
			currentNode= tempNode;

		}
		rootNode = previousNode;
	}

	@Override
	protected void mergeSortedLinkedLists(Node<T> rootNode1, Node<T> rootNode2) {
		// TODO Auto-generated method stub
		
	}
}
