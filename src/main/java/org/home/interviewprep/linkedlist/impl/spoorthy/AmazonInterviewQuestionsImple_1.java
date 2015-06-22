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

	@SuppressWarnings("unchecked")
	@Override
	protected void mergeSortedLinkedLists(Node<Integer> rootNode1, Node<Integer> rootNode2) {
	Node<Integer> tempNode = null;
		if(rootNode1==null){
			tempNode = rootNode1;
		}
		else if(rootNode2 == null)
		{
			tempNode = rootNode2;			
		}
		else if(rootNode1!=null &&rootNode2!=null)
		{
			while(rootNode1.getNext()!=null && rootNode2.getNext()!=null){
				if(rootNode1.getDataContent()>=rootNode2.getDataContent()){
					rootNode = (Node<T>) rootNode1;
					
				}
				else if(rootNode1.getDataContent()>rootNode2.getDataContent()){
					rootNode = (Node<T>) rootNode2;
					rootNode2 = rootNode1.getNext();
				}
			}
			while(rootNode1.getNext()!=null)
			{
				tempNode = rootNode1.getNext();
			}
			while(rootNode2.getNext()!=null)
			{
				tempNode = rootNode2.getNext();
			}
			
		}
		
	}
}
