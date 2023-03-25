package CollectionsPractice2Online;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FindingMajorityElement {
	
	public static void main(int []nums) {
		HashMap<Integer,Integer>HP=new HashMap<> ();
		for(int i=0;i<nums.length;i++) {
			if (HP.containsKey(nums[i])) {
				HP.put(nums[i], HP.get(nums[i])+1);				
			}
			else {
				HP.put(nums[i], 1);			}			
		}
		for (int key : HP.keySet()) {
			if(HP.get(key)>nums.length/8) {
				System.out.println(key);
				
			}
		}
		}	
	public static void main(String[] args) {
	int[]nums= {1,2,3,6,5,4,7,8,9,4,4,8,65,6,3,21,4,5,13,5,42,3,65,23,65,2,3,2,3,2,3,23,2,4};
	System.out.println("length of array "+nums.length); 
	Arrays.asList(nums);
	
	System.out.println("length of array/8 "+nums.length/8); 
	//FindingMajorityElement.main(nums);
	main(nums);
		
		
		
	}}