package week3.day3Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the most duplicate number -> First most duplicate
		/*
		* input: abbaba
		* output: b
		* 
		* 
		*/

		/*
		 * Psuedocode
		 * 
		 * a) Map -> HashMap 
		 * b) String -> ch[] -> Get all the character -> occurance
		 * c) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
		String text = "abbaba";
		
		Map<Character,Integer> map = new HashMap<>();
		
		
		char[]  chararray = text.toCharArray();
		for (int i =0 ; i<chararray.length;i++) {
			
			char key = chararray[i];
			
			if (map.containsKey(key)){
				
				Integer value = map.get(key);
				
				map.put(key, value+1);
				
			}
			
		else {
				
				map.put(key,1 );
				
			 }
						
		}
		
		System.out.println(map);
		
		int mostduplicate =0 ;
		char maxoccuchar = 0;
		for (Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>mostduplicate) {
				mostduplicate = entry.getValue();
				maxoccuchar = entry.getKey();
				
				

			}
		}

		System.out.println("max occuring  "+ maxoccuchar + " occurence is "+ mostduplicate);
		
		
		
	}
	}
