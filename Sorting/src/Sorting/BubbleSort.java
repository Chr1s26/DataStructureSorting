package Sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {54,34,2,42,4,21,1};
		arr = recursiveSort(arr,0);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	public static int[] recursiveSort(int[] arr,int n) {
		
		if(n == arr.length - 1) {
			return arr;
		}
		
		for(int i = 0; i < arr.length-1-n; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		n++;
		
		return recursiveSort(arr,n);
	}
	
//	public static int[] normalSort(int[] arr) {
//	
//	for(int i = 0; i < arr.length-1; i++) {
//		for(int j = 0; j < arr.length-1-i; j++) {
//			if(arr[j+1] < arr[j]) {
//				int temp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] = temp;
//			}
//		}
//	}
//	return arr;	
//}
	
}
