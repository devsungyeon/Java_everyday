package functiondev;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		Solution sol = new Solution() ;
		int[] result = sol.solution(progresses, speeds);
		
		for(int i : result) {
			System.out.println(i);
		}
	}

}
