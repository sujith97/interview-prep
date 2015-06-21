package org.home.interviewprep.linkedlist;

public class LinkedList_1Test {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList_1<String>();
		AmazonInterviewQuestionsImple_1<String> ll2 = new AmazonInterviewQuestionsImple_1<String>();
		ll2.insert("Suj");
		ll2.insert("Spoo");
		ll2.insert("Vij");	
		ll2.insert("SpooSuji's Baby");	
		ll2.printNodes();
		
		System.out.println("Middle Element: " + ll2.getMiddleElement());
		
		
	}

}
