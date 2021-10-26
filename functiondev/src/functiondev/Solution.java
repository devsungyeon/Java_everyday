package functiondev;

import java.util.*;

public class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i<progresses.length;i++ ) {
			progresses[i] = 100 - progresses[i];
			progresses[i] = (int) Math.ceil((double)progresses[i] / (double)speeds[i]);
		}
        for(int i = progresses.length-1;i>=0;i--) {
        	stack.push(progresses[i]);
        }
        //5 10 1 1 20 1
        
        int wdate = 100;
        int cnt = 0;
        while(!stack.empty()) {
        	int i = stack.pop();
        	System.out.println(i);
        	if(wdate == 100) {
        		wdate = i;
        		cnt++;
        	}
        	else if( i > wdate ) {
        		list.add(cnt);
        		wdate = i;
        		cnt=1;
        	}
        	else {
        		cnt++;
        	}
        }
        list.add(cnt);

        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++) {
        	answer[i] = list.get(i);
        }
        		
		return answer;
    }
}
