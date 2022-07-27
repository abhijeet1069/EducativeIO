package dataStructure.arrays;

public class BinarySearch {
	
	public static int binarySearch(int[] nums, int target) {
		int left = 0, right = nums.length-1;
        while(left < right) {
            int mid = left+(right-left)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target) //search right
                left = mid+1;
            else
                right = mid-1;
        }
        return -1;
	}
	
	static int binarySearchGFG(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
  
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
  
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
  
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
  
        // if we reach here, then element was
        // not present
        return -1;
    }
	
	static int first(int arr[], int x){
		int low = 0, high = arr.length-1, res = -1;
		while (low <= high){
			// Normal Binary Search Logic
			int mid = (low + high) / 2;
			if (arr[mid] > x)
				high = mid - 1;
			else if (arr[mid] < x)
				low = mid + 1;

			// If arr[mid] is same as x, we update res and move to the left half.
			else{
				res = mid;
				high = mid - 1;
			}
		}
		return res;
}
	public static void main(String[] args) {
		int[] arr = new int[] {2,4,6,8,10,12,14,16,16,16,18,20};
		int target=16;
		System.out.println(first(arr,target));
	}

}
