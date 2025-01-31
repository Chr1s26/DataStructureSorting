package Sorting;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr = {54,34,2,42,4,21,1};
		arr = normalSort(arr);
//		arr = rsort(arr,1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	public static int[] normalSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			
			int j = i - 1;
			
			while(j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}
	
	
	public static int[] recursiveSort(int[] arr, int n) {
		
		if(n == arr.length) {
			return arr;
		}
		
		int key = arr[n];
		int j = n - 1;
		
		while(j >= 0 && key < arr[j]) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = key;
		
		return recursiveSort(arr,n+1);
	}
	
//	public static int[] sort(int[] arr) {
//		
//		for(int j = 0; j < arr.length - 1; j++) {
//			int n = 0;
//			int m = -1;
//			
//			while(n <= j) {
//			if(arr[j - m] < arr[j - n]) {
//				int temp = arr[j - n];
//				arr[j - n] = arr[j - m];
//				arr[j - m] = temp;
//			}
//			n++;
//			m++;
//			}
//		}
//		return arr;
//	}
	
//	public static int[] dsort(int[] arr) {
//		int n ;
//		
//		for(int i = 0; i < arr.length-1; i++) {
//			n = 0;
//			while(n <= i) {
//				if(arr[i-n] > arr[i-n+1]) {
//					int temp = arr[i-n];
//					arr[i-n] = arr[i-n+1];
//					arr[i-n+1] = temp;
//				}
//				n++;
//			}
//		}
//		return arr;
//	}
	

	
}
