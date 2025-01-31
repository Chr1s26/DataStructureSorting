package Sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr = {54,34,2,42,4,21,1};
		arr = sort(arr,0);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	public static int[] sort(int[] arr,int n) {
		if(n == arr.length -1) {
			return arr;
		}
		int index = n;
		for(int j = n+1; j < arr.length; j++) {
			if(arr[index] > arr[j]) {
				index = j;
			}
		}
		
		if(n != index) {
			int temp = arr[n];
			arr[n] = arr[index];
			arr[index] = temp;
			}
		
		return sort(arr,n+1);
	}
	
//	public static int[] sort(int[] arr) {
//		
//		int index = 0;
//		
//		for(int i = 0; i < arr.length - 1; i++) {
//			
//			index = i;
//			
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[index] > arr[j]) {
//					index = j;
//				}
//			}
//			
//				int temp = arr[i];
//				arr[i] = arr[index];
//				arr[index] = temp;
//			
//		}
//		
//		return arr;
//	}
	

}
