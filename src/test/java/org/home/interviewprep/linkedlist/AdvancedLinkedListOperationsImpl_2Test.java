package org.home.interviewprep.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class AdvancedLinkedListOperationsImpl_2Test {

	public AdvancedLinkedListOperationsImpl_2<Integer> prepareList(Integer... elements) {
		final AdvancedLinkedListOperationsImpl_2<Integer> list = new AdvancedLinkedListOperationsImpl_2<Integer>();
		for (int i = 0; i < elements.length; i++) {
			list.insert(elements[i]);
		}
		return list;
	}
	
	@Test
	public void checkForEmptyLinkedList() {
		Assert.assertEquals(null, prepareList().getMiddleElement());
	}
	
	@Test
	public void checkForEvenLinkedList() {
		Assert.assertEquals(new Integer(2)
			, prepareList(1, 2, 3, 4).getMiddleElement().getDataContent());
	}
	
	@Test
	public void checkForOddLinkedList() {
		Assert.assertEquals(new Integer(4)
			, prepareList(1, 2, 3, 4, 5, 6, 7).getMiddleElement().getDataContent());
	}
	
	@Test
	public void checkForLinkedListWithOneElement() {
		Assert.assertEquals(new Integer(1)
		, prepareList(1).getMiddleElement().getDataContent());
	}
	
	@Test
	public void checkForLinkedListWithTwoElements() {
		Assert.assertEquals(new Integer(1)
		, prepareList(1, 2).getMiddleElement().getDataContent());
	}
}
