package org.home.interviewprep.linkedlist;

public class LinkedList_1Test {

	public static void main(String[] args) {
		AdvancedLinkedListOperationsImpl_2<Integer> ll1 = new AdvancedLinkedListOperationsImpl_2<Integer>();
		ll1.insert(1);
		ll1.insert(2);
		ll1.insert(3);
		ll1.insert(4);
		ll1.insert(5);
		
		System.out.println("Middle: " + ll1.getMiddleElement());
		
	}

}
