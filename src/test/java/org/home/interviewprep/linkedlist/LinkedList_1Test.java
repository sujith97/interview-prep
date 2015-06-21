package org.home.interviewprep.linkedlist;

public class LinkedList_1Test {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList_1<String>();
		ll1.insert("Suj");
		ll1.insert("Spoo");
		ll1.insert("Vij");
		
		ll1.printNodes();
		
		System.out.println("Searched: " + ll1.search("Suj"));
		ll1.printNodes();
		
	}

}
