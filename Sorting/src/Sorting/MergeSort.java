package Sorting;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] array = {5,8,3,6,4,7,8,1};
		print(merge(array));
		
	}
	
	public static void print(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}	
	
	
	public static int[] merge(int[] array) {
		
		//Base Case
		if(array.length == 1) {
			return array;
		}
		
		// find mid
		int mid = array.length / 2;
		int[] array1 = new int[mid];
		int[] array2 = new int[array.length-mid];
		
		
		// split array1 and array2 
		for(int i = 0; i < mid;i++) {
			array1[i] = array[i];
		}
		int count = 0;
		for(int j = mid; j < array.length; j++) {
			array2[count] = array[j];
			count++;
		}
		
		
		//recursive call 
		return sort(merge(array1),merge(array2));
	}
	
	public static int[] sort(int[] array1,int[] array2) {
		
		int[] result = new int[array1.length+array2.length];
		int temp1 = 0;
		int temp2 = 0;
		
		while(temp1+temp2 < array1.length + array2.length) {
			
			if(temp1 == array1.length) {
				result[temp1+temp2] = array2[temp2++];
				
			}else if(temp2 == array2.length) {
				result[temp1+temp2] = array1[temp1++];
			}else {
				if(array1[temp1] <= array2[temp2]) {
					result[temp1+temp2] = array1[temp1++];
				}else {
					result[temp1+temp2] = array2[temp2++];
				}
			}
		}
		
		return result;
	}
} 
