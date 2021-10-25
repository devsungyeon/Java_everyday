package stringtoint;

public class Solution {
	public int solution(String s) {
        int answer = 0;
        
        int abs = 1;
        
        String substr = "";
        if(s.charAt(0) == '+') {
        	abs = 1;
        	substr = s.substring(1, s.length());
        }
        else if(s.charAt(0) == '-') {
        	abs = -1;
        	substr = s.substring(1, s.length());
        }
        else {
        	substr = s;
        }
        
        answer = Integer.parseInt(substr);
        answer *= abs;
        
        return answer;
    }
}
