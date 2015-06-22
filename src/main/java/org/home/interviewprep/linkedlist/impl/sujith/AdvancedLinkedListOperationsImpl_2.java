package org.home.interviewprep.linkedlist.impl.sujith;

import org.home.interviewprep.linkedlist.AdvancedLinkedListOperations;
import org.home.interviewprep.linkedlist.Node;

public class AdvancedLinkedListOperationsImpl_2<T> extends AdvancedLinkedListOperations<T> {

	@Override
	public Node<T> getMiddleElement() {
		Node<T> middleNode, middleNodeDual;
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

	@Override
	protected void mergeSortedLinkedLists(Node<T> rootNode1, Node<T> rootNode2) {
		
		
	}

	
}
