package com.bean;

public class Test {

	public static void main (String [] args) {
		int[] arr= {4,-12,8,9,1,3,13,-2,9};
		print(arr);
		System.out.println();
		for(int firstUnsortedArray=1;firstUnsortedArray<arr.length;firstUnsortedArray++) {
			int valueToInsert=arr[firstUnsortedArray];
			
			int i;
			for(i=firstUnsortedArray;i>0 && arr[i-1]>valueToInsert;i--) {
				arr[i]=arr[i-1];
			}
			arr[i]=valueToInsert;
		}
		print(arr);
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ "   ");
		}
	}
}
