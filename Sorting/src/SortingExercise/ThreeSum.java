package SortingExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	
	public static void main(String[] args) {
		int[] arr = {0,0,0,0};
		List<List<Integer>> answerList= threeSum(arr);
		
		for(List<Integer> subList : answerList) {
			for(Integer num : subList) {
				System.out.print(num+" ");
			}
			System.out.print("\n");
		}
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> answerList = new ArrayList<>();
		
		if(nums.length == 3) {
			if(nums[0]+nums[1]+nums[2] == 0) {
			answerList.add(new ArrayList<>(Arrays.asList(nums[0], nums[1], nums[2])));}
            return answerList;
		}
        
        for(int i = 0; i <= nums.length-4;i++) {
        	for(int j = i+1; j < nums.length-2;j++) {
        		for(int k = j+1; k <= nums.length-1;k++) {
        			if(nums[i]+nums[j]+nums[k] == 0) {
        	
        				List<Integer> subList = new ArrayList<Integer>();
        				subList.add(nums[i]);
        				subList.add(nums[j]);
        				subList.add(nums[k]);
        				
//        				if(!checkDuplicate(answerList,subList)) {
        					answerList.add(subList);
        				
//        				}
        				
        			}
        		}
        	}
        }
        return answerList;
    }
	
	public static boolean checkDuplicate(List<List<Integer>> answerList,List<Integer> subList) {
		if(answerList.isEmpty()) {
			return false;
		}
		
		boolean check = false;
		int index1 = -1;
		int index2 = -1;
		int index3 = -1;
		
		for(List<Integer> temp : answerList) {
			int count = 0;
			for(int i = 0; i < temp.size(); i++) {
				for(int j = 0; j < 3; j++) {
					
					if(j != index3 && j != index1 && j != index2 && temp.get(i) == subList.get(j)) {
						if(index1 == -1) {
						index1 = j;}
						count++;
					}
					if(index2 == -1) {
						index2 = index1;
						index1 = -1;
					}else if(index2 != -1) {
						index3 = index1;
					}
				}
			}
			if(count == 3) {
				check = true;
			}
			
		}
		return check;
	}
}
