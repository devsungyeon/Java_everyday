package phoneketmon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] nums) {
        int N = nums.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int num:nums)
        	if(!arrayList.contains(num))
    			arrayList.add(num);
        
        return Math.min(N/2, arrayList.size());
    }
    
    public int solution1(int[] nums) {
    	return Arrays.stream(nums)
    			.boxed()
    			.collect(Collectors.collectingAndThen(Collectors.toSet(), phonekemons->Integer.min(phonekemons.size(), nums.length/2)));
    }
    
    public int solution2(int[] nums) {
    	HashSet<Integer> hs = new HashSet<>();
    	
    	for(int num:nums)
    		hs.add(num);
    
    	return Math.min(hs.size(), nums.length/2);
    }
}