package org.home.interviewprep.linkedlist;

/**
 * Given an integer linked list of which both first half and second half are
 * sorted independently. Write a function to merge the two parts to create one
 * single sorted linked list in place [do not use any extra space].
 */
public class AmazonInterviewQuestionsImple_1<T> extends
		AdvancedLinkedListOperations<T> {

	@Override
	Node<T> getMiddleElement() {

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
	LinkedList<T> getReverse() {
		Node<T> temp = null;
		if(rootNode!=null){
			temp = rootNode;
			rootNode.setNext(null);
		}
		while(temp.getNext() != null) {
		    		temp = temp.getNext().getNext();
		    		temp.getNext().setNext(t);
		    		
				temp = rootNode.getNext();
			
			
		}
		return null;
	}
}
