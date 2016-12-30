package banyanbat.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void testEmptyArray(){
		int[] array = {};
		BubbleSort bubbleSort = new BubbleSort();
		assertEquals(array,bubbleSort.sort(array));
	}
	@Test
	public void testArrayWithOneElement(){
		int[] array = {4};
		BubbleSort bubbleSort = new BubbleSort();
		assertEquals(array,bubbleSort.sort(array));
	}
	@Test
	public void testArrayWith2Elements(){
		int[] inputArray = {5,2};
		int[] outputArray = {2,5};
		BubbleSort bubbleSort = new BubbleSort();
		assertArrayEquals(outputArray,bubbleSort.sort(inputArray));
	}
	@Test
	public void testArrayWith5SortedElements(){
		int[] inputArray = {1,2,3,4,5};
		int[] outputArray = {1,2,3,4,5};
		BubbleSort bubbleSort = new BubbleSort();
		assertArrayEquals(outputArray,bubbleSort.sort(inputArray));
	}
	@Test
	public void testArrayWith5ReverseSortedElements(){
		int[] inputArray = {5,4,3,2,1};
		int[] outputArray = {1,2,3,4,5};
		BubbleSort bubbleSort = new BubbleSort();
		assertArrayEquals(outputArray,bubbleSort.sort(inputArray));
	}
}
