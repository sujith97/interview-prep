package org.home.interviewprep.sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MergeSort {
	
	public static List<Integer> sortList(final List<Integer> unsortedList) {
		int size = unsortedList.size();
		if (size > 1) {
			List<Integer> leftSubProblem = sortList(unsortedList.subList(0, size/2));
			List<Integer> rightSubProblem = sortList(unsortedList.subList(size/2, size));
			List<Integer> sortedList = new ArrayList<Integer>();
			
			Iterator<Integer> leftItr = leftSubProblem.iterator();
			Iterator<Integer> rightItr = rightSubProblem.iterator();
			Integer leftValue = leftItr.next();
			Integer rightValue = rightItr.next();
			
			while(true) {
				if (leftValue < rightValue) {
					sortedList.add(leftValue);
					if (leftItr.hasNext()) {
						leftValue = leftItr.next();	
					} else {
						sortedList.add(rightValue);
						while (rightItr.hasNext()) {
							sortedList.add(rightItr.next());
						}
						break;
					}
				} else {
					sortedList.add(rightValue);
					if (rightItr.hasNext()) {
						rightValue = rightItr.next();
					} else {
						sortedList.add(leftValue);
						while (leftItr.hasNext()) {
							sortedList.add(leftItr.next());
						}
						break;
					}
				}
			}

			return sortedList;
			
		} else if (size == 1) {
			return unsortedList;
		} else {
			throw new IllegalStateException("Should not come here!");
		}
	}
	
	public static void main(String argv[]) {
		final List<Integer> unsortedList = new LinkedList<Integer>();
		unsortedList.add(new Integer(10));
		unsortedList.add(new Integer(3));
		unsortedList.add(new Integer(14));
		unsortedList.add(new Integer(12));
		unsortedList.add(new Integer(1));
		unsortedList.add(new Integer(9));
		unsortedList.add(new Integer(4));
		
		final List<Integer> sortedList = sortList(unsortedList);
		for (Integer integer : sortedList) {
			System.out.print(integer + ",");
		}
	}
}
