package failure_rate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		Solution sol = new Solution();
		int[] answer = sol.solution(N, stages);
		
	}

}
