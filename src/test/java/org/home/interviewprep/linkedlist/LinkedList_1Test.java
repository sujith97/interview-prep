package org.home.interviewprep.linkedlist;

import org.home.interviewprep.linkedlist.impl.spoorthy.AmazonInterviewQuestionsImple_1;

public class LinkedList_1Test {

	public static void main(String[] args) {
		//AdvancedLinkedListOperationsImpl_2<Integer> ll1 = new AdvancedLinkedListOperationsImpl_2<Integer>();
		AmazonInterviewQuestionsImple_1<Integer> ll1 = new AmazonInterviewQuestionsImple_1<Integer>();
		ll1.insert(1);
		ll1.insert(2);
		
		ll1.reverseTheList();
		ll1.printNodes();
	
	}

}
