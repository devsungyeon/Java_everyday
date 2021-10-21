package absolutes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		
		int result = sol.solution(absolutes, signs);
		
		System.out.println(result);
	}
}
