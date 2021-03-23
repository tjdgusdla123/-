package 알고리즘;
//프로그래머스 - 문자열 내 p와 y의 개수
public class Solution20210324 {

		boolean solution(String s) {
			boolean answer = true;
			s = s.toUpperCase();
			char chr;
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				chr = s.charAt(i);
				if (chr == 'P') {
					count++;
				} else if (chr == 'Y') {
					count--;
				}
			}
			if (count == 0) {
				answer = true;
			} else {
				answer = false;
			}
			return answer;
		}	
		public static void main(String[] args) {
			Solution20210324 a = new Solution20210324();
			String s = "pyypy";
			System.out.println(a.solution(s));
		}
}	
//프로그래머스 - 서울에서 김서방 찾기
//class Solution {
//    public String solution(String[] seoul) {
//        String answer = "";
//        for(int i = 0; i<seoul.length; i++ ){
//            if("Kim".equals(seoul[i])){
//                answer="김서방은 " + i + "에 있다";
//            }
//        }
//        return answer;
//    }
//} 