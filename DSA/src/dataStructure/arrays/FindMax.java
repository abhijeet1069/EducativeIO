package dataStructure.arrays;

public class FindMax {
	
	//Kadane Algorithm
	public static int findMaxSumSubArray(int[] arr) {
        int currentMax = Integer.MIN_VALUE;
        int current = 0;
        for(int i : arr) {
        	current = Math.max(current+i, i);
        	currentMax = Math.max(currentMax, current);
        }
        return currentMax;
    }
	
	
	public static void main(String[] args) {
		int[] arr = new int[]{1, 7, -2, -5, 10, -1};
		System.out.println(findMaxSumSubArray(arr));
	}

}
