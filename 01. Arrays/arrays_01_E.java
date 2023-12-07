//array - problem:01 - EASY
//Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

//Maximum and minimum of an array using Sorting:

import java.io.*;
import java.util.*;

class Pair {
	public int min;
	public int max;
}

public class arrays_01_E {
	static Pair getMinMax(int arr[], int n) {
		Pair minmax = new Pair();
		Arrays.sort(arr);
		minmax.min = arr[0];
		minmax.max = arr[n - 1];
		return minmax;
	}

	public static void main(String[] args) {
		int arr[] = { 1000, 11, 445, 1, 330, 3000 };
		int arr_size = arr.length;
		Pair minmax = getMinMax(arr, arr_size);
		System.out.println("Minimum element is " + minmax.min);
		System.out.println("Maximum element is " + minmax.max);
		
	}
}

//link: https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

//HERE:
// Time complexity: O(n log n), where n is the number of elements in the array, as we are using a sorting algorithm.
// Auxilary Space: is O(1), as we are not using any extra space.
