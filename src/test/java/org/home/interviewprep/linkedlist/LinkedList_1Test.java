package org.home.interviewprep.linkedlist;

import org.home.interviewprep.linkedlist.impl.spoorthy.AmazonInterviewQuestionsImple_1;

public class LinkedList_1Test {

	public static void main(String[] args) {
		//AdvancedLinkedListOperationsImpl_2<Integer> ll1 = new AdvancedLinkedListOperationsImpl_2<Integer>();
		AmazonInterviewQuestionsImple_1<Integer> ll1 = new AmazonInterviewQuestionsImple_1<Integer>();
		AmazonInterviewQuestionsImple_1<Integer> ll2 = new AmazonInterviewQuestionsImple_1<Integer>();
		AmazonInterviewQuestionsImple_1<Integer> ll3 = new AmazonInterviewQuestionsImple_1<Integer>();
		// 7 10 11 14 15  16
		// 3 6 8  9
		ll1.insert(7);
		ll1.insert(10);
		ll1.insert(11);
		ll1.insert(140);
		ll1.insert(15);
		ll1.insert(16);
		
		ll2.insert(3);
		ll2.insert(6);
		ll2.insert(8);
		ll2.insert(9);
		
		//ll3.rootNode= mergeSortedLinkedLists(ll1.rootNode,ll2.rootNode);
		ll3.printNodes();
	
	}

}
