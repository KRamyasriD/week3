package week3.day3Assignment;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {
		
		//Assignment2: FindNumbersOccurances

		/*
		 * Input array numbers, each occurances
		 * 
		 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
		 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
		 * 
		 * Order: Ascending Order
		 * 
		 */

		/*
		 * Psuedcode:
		 * 
		 * a) Create Map -> TreeMap
		 * b) For loop -> each number -> add to the map
		 * c) If it is exist -> update it with + 1
		 * 	  Else -> new entry with 1 as value
		 * 
		 */
		 int[] nums = {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer,Integer> occurence = new TreeMap<>();
		
		
		for (int i =0 ; i<nums.length;i++) {
			
			Integer keynum = (Integer) nums[i];
			
			if (occurence.containsKey(keynum)){
				
				Integer valuenum = occurence.get(keynum);
				
				occurence.put(keynum, valuenum+1);
				
			}
			
			else {
				
				occurence.put(keynum,1 );
				
			}
						
		}
		
		System.out.println(occurence);
		


		
	}
}
