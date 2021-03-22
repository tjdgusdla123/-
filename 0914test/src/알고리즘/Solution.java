package 알고리즘;


import java.util.*;

public class Solution {
	public static void main(String[] args) {
	
		int[] numbers = { 2, 1, 3, 4, 1 };
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers.length-i; j++) {
				System.out.println(numbers.length);
				if (!arr.contains(numbers[i] + numbers[j + i])
						&& numbers[i] + numbers[j + i] != 0) {					
					arr.add(numbers[i] + numbers[j + i]);
					System.out.println(arr);
				}
			}
		}
		int[] answer = new int[arr.size()];
		arr.sort(null);
		for (int i = 0; i < arr.size(); i++) {
			answer[i] = (int) arr.get(i);
			System.out.println(answer[i]);
		}
		  
	 
	    
	     
		  }
		  
	
	   }
	   





