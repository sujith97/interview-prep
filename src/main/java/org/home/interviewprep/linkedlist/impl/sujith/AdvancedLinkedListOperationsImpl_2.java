package org.home.interviewprep.linkedlist.impl.sujith;

import org.home.interviewprep.core.SinglyLinkedNode;
import org.home.interviewprep.linkedlist.AdvancedLinkedListOperations;

public class AdvancedLinkedListOperationsImpl_2<T> extends AdvancedLinkedListOperations<T> {

	@Override
	public SinglyLinkedNode<T> getMiddleElement() {
		SinglyLinkedNode<T> middleNode, middleNodeDual;
		middleNode = middleNodeDual = rootNode;
		
		while(middleNodeDual != null && middleNodeDual.getNext() != null) {
			int i = 2;
			while (i > 0) {
				if (middleNodeDual.getNext() != null) {
					middleNodeDual = middleNodeDual.getNext();
					if (i == 1) {
						middleNode = middleNode.getNext();
					}
				} else {
					break;
				}
				--i;
			}
		}
			
		return middleNode;
	}

	@Override
	public void reverseTheList() {
		
	}


	public SinglyLinkedNode<Integer> mergeSortedLinkedLists(SinglyLinkedNode<Integer> rootNode1, SinglyLinkedNode<Integer> rootNode2) {
		return rootNode2;
		// Now you cab safely typecast to (Integer) => (Integer)rootNode1.getDataContent()
	}

	
}
