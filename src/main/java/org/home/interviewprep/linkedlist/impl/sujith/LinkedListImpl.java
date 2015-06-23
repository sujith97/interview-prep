package org.home.interviewprep.linkedlist.impl.sujith;

import org.home.interviewprep.core.SinglyLinkedNode;
import org.home.interviewprep.linkedlist.LinkedList;

/**
 * This linked list will have 
 * - Insertion
 * - Deleting
 * - Searching
 * 
 * @author sujithrb
 *
 */
public class LinkedListImpl<T> implements LinkedList<T> {
	protected SinglyLinkedNode<T> rootNode;
	
	public void insert(T content) {
		SinglyLinkedNode<T> newNode;
		
		if (rootNode == null) {
			newNode = rootNode = new SinglyLinkedNode<T>();
		} else {
			newNode = rootNode;
			while (newNode.getNext() != null) {
				newNode = newNode.getNext();
			}
			// If the leaf node's next is null, it reaches here and the new node will have the leaf node content;
			SinglyLinkedNode<T> tempNode = newNode;
			newNode = new SinglyLinkedNode<T>();
			tempNode.setNext(newNode);
		}
		newNode.setDataContent(content);
	}

	
	public SinglyLinkedNode<T> delete(T content) {
		
		SinglyLinkedNode<T> currentParent, tempNode;
		currentParent = tempNode = rootNode;
		
		while(tempNode != null) {
			if(content.equals(tempNode.getDataContent())) {
				if (currentParent == tempNode) {
					rootNode = tempNode.getNext();
				} else {
					currentParent.setNext(tempNode.getNext());
				}
				break;
			}
			else {
				currentParent = tempNode;
				tempNode = tempNode.getNext();	
			}
		}
		return tempNode;
	}

	public SinglyLinkedNode<T> search(T content) {
		SinglyLinkedNode<T> tempNode = rootNode;
		while(tempNode != null) {
			if(content.equals(tempNode.getDataContent())) {
				break;
			}
			else {
				tempNode = tempNode.getNext();					
			}
		}
		return tempNode;
	}


	public void printNodes() {
		if (rootNode != null) {
			SinglyLinkedNode<T> pointer = rootNode;
			System.out.print("[");
			do {
				System.out.print(pointer.getDataContent() + ","); // The last value will have a ',' which has to be corrected in future.
			} while ((pointer = pointer.getNext()) != null);
			System.out.print("]\n");
		}
	}
}
