package Sorting;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = {31,12,55,26,15,14,17,43,22};
		arr = sort(arr,arr.length-1,0);

		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+","); 
		}
	}
	
	public static int[] sort(int[] arr,int pivot,int secondpointer) {
	
		int m = secondpointer;
		int count = 0;
		
		if(secondpointer >= pivot) {
			return arr;
		}
		
		for(int i = m; i < arr.length; i++) {
			
			if(arr[pivot] > arr[i]) {
				
				if(count != 0) {
					m++;
				}
				count++;
				
				if(arr[m] > arr[i]) {
					int temp = arr[m];
					arr[m] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		m++;
		int temp = arr[pivot];
		arr[pivot] = arr[m];
		arr[m] =temp;
		
		
		arr = sort(arr,m-1,secondpointer);
		arr = sort(arr,pivot,m+1);
		
		return arr;
	}
}
