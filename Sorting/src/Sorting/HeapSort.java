package Sorting;

public class HeapSort {
	
	public static void main(String[] args) {
		int[] arr = {2,10,4,7,1,8,9,3,6,5};
		arr = sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	public static int[] sort(int[] arr) {
		int m = 0;
		int length = arr.length-1;
		
		while(m != arr.length-1) {
			
		int n = (length) / 2;
		
		for(int i = length; i >= 1; i--) {
			if(arr[n] < arr[i]) {
				int temp = arr[i];
				arr[i] = arr[n];
				arr[n] = temp;
			}
			if(i/2 != 0 && n != 0) {
				n--;
			}
		}
		
		int temp = arr[n];
		arr[n] = arr[length];
		arr[length] = temp;
		
		length--;
		m++;
		}
		return arr;
	}
}
