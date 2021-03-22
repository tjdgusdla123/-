package 알고리즘1031;

public class Solution20210322 {
	public static String solution(int a, int b) {
		  String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
	        int[] dcount = {31,29,31,30,31,30,31,31,30,31,30,31};
	        int total = 0;
	        //월계산
	        for (int i = 0; i < a-1; i++) {
	           System.out.println(a);
	        	total += dcount[i];
	        }
	      
	        total += b;
	        total = total%7;
	        //날계산
	        String s = day[total];
	        
	        String answer = s;
		 return answer;
		 
	 }
	
	
	
	public static void main(String[] args) {
		Solution20210322 s = new Solution20210322();
		int a = 4;
		int b =3;
		System.out.println(Solution20210322.solution(a, b));
				

	}
	
	 
    }

