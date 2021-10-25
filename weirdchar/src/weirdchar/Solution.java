package weirdchar;

public class Solution {
	public String solution(String s) {
        String answer = "";
        
        int idx = 0;
        for(char c:s.toCharArray()) {
        	String tmp = String.valueOf(c);
        	if(c == ' ') {
        		idx = 0;
        		answer += tmp;
        		continue;
        	}
        	else if(idx % 2 == 0) {
        		tmp = String.valueOf(Character.toUpperCase(c));
        	}
        	else {
        		tmp = String.valueOf(Character.toLowerCase(c));
        	}
        	answer += tmp;
        	idx++;
        }
        
        return answer;
    }
}
