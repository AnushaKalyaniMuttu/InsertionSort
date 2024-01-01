package com.bean;

public class Test {

	public static void main (String [] args) {

			//1
			//2

		int[] arr= {4,-12,8,9,1,3,13,-2,9};
		print(arr);
		System.out.println();
		
		for(int gap=arr.length/2;gap>0;gap/=2) {
			
			for(int i=gap;i<arr.length;i++) {
				int newElement=arr[i];
				
				int j=i;
				while(j>=gap && arr[j-gap]>newElement) {
					arr[j]=arr[j-gap];
					j-=gap;
				}
				arr[j]=newElement;
			}
			
		}
		print(arr);
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ "   ");
		}
	}
}
