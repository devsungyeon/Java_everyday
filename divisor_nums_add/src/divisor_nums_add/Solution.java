package divisor_nums_add;

public class Solution {
	private boolean divisor(int x) {
		int count = 0;
		
		for(int i = 1; i<= Math.sqrt(x) ; i++ ) {
			if(x % i == 0) {
				if(i*i == x) count+=1;
				else count+=2;
			}
		}
		if(count % 2 == 0) return true;
		else return false;
	}
	
	public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left ; i <= right;i++ ) {
        	if(divisor(i)) answer += i;
        	else answer -= i;
        }
        
        return answer;
    }
}
