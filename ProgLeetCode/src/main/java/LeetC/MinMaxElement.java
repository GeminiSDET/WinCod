package LeetC;

import java.util.Arrays;

public class MinMaxElement {

	public static void main(String[] args) {

		int[] input= {1,2,4,5,7,9,6};
		GetMinMax(input);
	}
	
	public static void GetMinMax(int[] arr)
	{
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[arr.length-1];
		System.out.println("max element:" + max);
		System.out.println("max element:" + min);

	}

}
