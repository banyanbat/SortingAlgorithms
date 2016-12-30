/**
 * This is the package where all the sorting algorithms will be implemented.
 */
package banyanbat.algorithms.sorting;
/**
 * The names of variables are chosen considering the following two points:
 * 1. It is an example of inline sorting, <code>arrayToBeSorted</code> is the input as well as output
 * 2. The number of elements in the outer loop is reduced one at a time putting the largest element at it's proper position in the sorted array.
 * @author Banyanbat
 *
 */
public class BubbleSort {
	
	public int[] sort(int [] arrayToBeSorted){
		if(arrayToBeSorted.length > 1){
			for(int elementsLeftToBeSorted = arrayToBeSorted.length -1;elementsLeftToBeSorted>0;elementsLeftToBeSorted--){
				for(int in = 0;in<elementsLeftToBeSorted;in++){
					if(arrayToBeSorted[in]>arrayToBeSorted[in+1]){
						int temp = arrayToBeSorted[in];
						arrayToBeSorted[in] = arrayToBeSorted[in+1];
						arrayToBeSorted[in+1] = temp;
					}
				}
			}
		}
		return arrayToBeSorted;
	}

}
