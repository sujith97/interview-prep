package org.home.interviewprep.linkedlist;

/**
 * This linked list will have 
 * - Insertion
 * - Deleting
 * - Searching
 * 
 * @author sujithrb
 *
 */
public class LinkedList_1<T> implements LinkedList<T> {
	protected Node<T> rootNode;
	
	public void insert(T content) {
		Node<T> newNode;
		
		if (rootNode == null) {
			newNode = rootNode = new Node<T>();
		} else {
			newNode = rootNode;
			while (newNode.getNext() != null) {
				newNode = newNode.getNext();
			}
			// If the leaf node's next is null, it reaches here and the new node will have the leaf node content;
			Node<T> tempNode = newNode;
			newNode = new Node<T>();
			tempNode.setNext(newNode);
		}
		newNode.setDataContent(content);
	}

	
	public Node<T> delete(T content) {
		
		Node<T> currentParent, tempNode;
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

	public Node<T> search(T content) {
		Node<T> tempNode = rootNode;
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
			Node<T> pointer = rootNode;
			System.out.print("[");
			do {
				System.out.print(pointer.getDataContent() + ","); // The last value will have a ',' which has to be corrected in future.
			} while ((pointer = pointer.getNext()) != null);
			System.out.print("]\n");
		}
	}
}
