package amount;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        int max = 0;
        for(int i:d) {
        	max += i;
        	if(max > budget)
        		break;
        	answer++;
        }
        
        return answer;
    }

}
