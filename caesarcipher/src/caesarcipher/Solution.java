package caesarcipher;

public class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for(char c:s.toCharArray()) {
        	if(c == ' ') {
        		
        	}
        	else if(c >= 97) {
        		c += n;
        		c -= 97;
        		c %= 26;
        		c += 97;
        	}
        	else {
        		c += n;
        		c -= 65;
        		c %= 26;
        		c += 65;
        	}
        	answer += Character.toString(c);
        }
        
        return answer;
    }
}
