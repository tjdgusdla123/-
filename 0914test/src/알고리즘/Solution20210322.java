package 알고리즘;

public class Solution20210322 {
	public static String solution(int a, int b) {
		  String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
	        int[] dcount = {31,29,31,30,31,30,31,31,30,31,30,31};
	        int total = 0;
	        //월계산
	        for (int i = 0; i < a-1; i++) {
	        	total += dcount[i];
	        }
	      
//	        total += b;
//	        total = total%7;
//	        //날계산
//	        String s = day[total];
//	        
//	        String answer = s;
	        String answer = "";
	        answer = day[(total + b) % 7];

	
		 return answer;
		 
	 }
	
	
	
	public static void main(String[] args) {
		Solution20210322 s = new Solution20210322();
		int a = 5;
		int b =24;
		System.out.println(Solution20210322.solution(a, b));
		
				

	}
	
	 
    }

